package designPatternsFinalWork;
//客户端
import java.util.Scanner;

public class Client
{
	public static void main(String args[])
	{	
		System.out.println("【欢迎来到小米手机商城系统】");//欢迎语
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您的姓名：");
		String name = scan.next();
		System.out.println("请输入您的地址：");
		String address = scan.next();
		System.out.println("请输入您的电话：");
		String pnum = scan.next();
		System.out.println("请选择物流方式：");
		System.out.println("1.快递到家.");
		System.out.println("2.到店自取.");

		Scanner input=new Scanner(System.in);
		int contents=input.nextInt();
		switch(contents) {
		case 1:
			System.out.println("你需要购买小米10还是小米10Plus呢？");
			System.out.println("3.小米10");
			System.out.println("4.小米10Plus");
			int options =new Scanner(System.in).nextInt();
			switch(options) {
			case 3:
				try
				{//工厂方法模式
					MobilePhone mp;
					MPFactory factory = new MP10Factory();
					mp=factory.produceMobilePhone();
					mp.produce();
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try
				{//工厂方法模式
					MobilePhone mp;
					MPFactory factory = new MP10PlusFactory();
					mp=factory.produceMobilePhone();
					mp.produce();
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
			}
			
			OrderBuidler ob = new SubOrderBuilder();//建造者模式
			ob.buildOrder(name, address);//建造者模式
			XiaoMiCompany company = XiaoMiCompany.getInstance();//单例生成对象
			System.out.println("发信人："+company.call());//单例模式
			SMS obj1 = new SMS(name, pnum);//原型模式
			SMS obj2=(SMS)obj1.clone();//原型模式克隆一个对象
			System.out.println("收信人："+obj2);//调用克隆对象输出
			DeliverMethod dg = new DeliverMethod(true);//代理模式
			System.out.println(dg.selectMethod());//代理模式
			break;

		case 2:
			System.out.println("你需要购买小米10还是小米10Plus呢？");
			System.out.println("3.小米10");
			System.out.println("4.小米10Plus");
			int options2 =new Scanner(System.in).nextInt();
			switch(options2) {
			case 3:
				try
				{//工厂方法模式
					MobilePhone mp;
					MPFactory factory = new MP10Factory();
					mp=factory.produceMobilePhone();
					mp.produce();
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try
				{//工厂方法模式
					MobilePhone mp;
					MPFactory factory = new MP10PlusFactory();
					mp=factory.produceMobilePhone();
					mp.produce();
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
			}
			
			OrderBuidler ob0 = new SubOrderBuilder();//建造者模式
			ob0.buildOrder(name, address);//建造者模式
			XiaoMiCompany company0 = XiaoMiCompany.getInstance();//单例生成对象
			System.out.println("发信人："+company0.call());//单例模式
			SMS obj3 = new SMS(name, pnum);//原型模式
			SMS obj4=(SMS)obj3.clone();//原型模式克隆一个对象
			System.out.println("收信人："+obj4);//调用克隆对象输出
			DeliverMethod dg0 = new DeliverMethod(false);//代理模式
			System.out.println(dg0.selectMethod());//代理模式
			break;
			
		default:
			System.out.println("输入不正确，请重新输入喔~");
		}
		System.out.println("本次购物已完成，感谢您对小米手机的支持，祝您购物愉快~");//结语
	}
}

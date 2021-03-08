package designPatternsFinalWork;
//订单具体建造者--建造者模式
public class SubOrderBuilder extends OrderBuidler
{
	public void buildOrder(String name,String address) 
	{
		// TODO Auto-generated method stub
		order.setName(name);
		order.setAddress(address);
		System.out.println("【已生成订单】 姓名："+ name +"  "+ "地址："+ address);
	}

}

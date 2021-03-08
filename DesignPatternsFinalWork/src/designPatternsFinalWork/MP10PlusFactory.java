package designPatternsFinalWork;
//小米10Plus具体工厂类--工厂方法模式
public class MP10PlusFactory implements MPFactory
{
	public MobilePhone produceMobilePhone()
	{
		System.out.println("小米10Plus手机工厂生产小米10Plus手机");
		return new MP10Plus();
	}
}

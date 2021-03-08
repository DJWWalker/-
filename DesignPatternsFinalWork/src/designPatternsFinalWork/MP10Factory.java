package designPatternsFinalWork;
//小米10具体工厂类--工厂方法模式
public class MP10Factory implements MPFactory
{
	public MobilePhone produceMobilePhone()
	{
		System.out.println("小米10手机工厂生产小米10手机");
		return new MP10();
	}
}

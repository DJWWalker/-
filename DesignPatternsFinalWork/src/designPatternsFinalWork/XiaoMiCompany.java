package designPatternsFinalWork;
//小米总公司--单例模式
public class XiaoMiCompany {
	
	private XiaoMiCompany()
	{
	}
	
	private static class SingletonInstance
	{//静态内部类
		private static final XiaoMiCompany INSTANCE = new XiaoMiCompany();
	}

	public static XiaoMiCompany getInstance(){
		return SingletonInstance.INSTANCE;
	}
	public String call(){
		return "小米总公司";
	}
}

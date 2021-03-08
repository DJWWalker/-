package designPatternsFinalWork;
//订单抽象建造者--建造者模式
public abstract class OrderBuidler {
	protected Order order = new Order();

	public abstract void buildOrder(String name,String address);

	public Order getOrder()
	{
		return order;
	}
}	

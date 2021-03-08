package designPatternsFinalWork;
//订单类--建造者模式
public class Order {
	private String name;//顾客姓名
	private String address;//顾客地址

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
}


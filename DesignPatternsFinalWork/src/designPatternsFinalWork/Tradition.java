package designPatternsFinalWork;
//到店自取--代理模式
public class Tradition implements DeliverGoods {
	boolean flag;
	String m = null;

	public Tradition(boolean flag) {
		this.flag = flag;
	}

	public String sendMP(String method) {
		if(flag == false){
			m = method;
		}
		return "请凭借短信或者订单"+m+"喔，谢谢~";
	}

	public String selectMethod() {
		return null;
	}
}

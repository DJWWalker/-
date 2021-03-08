package designPatternsFinalWork;
//快递到家--代理模式
public class Express implements DeliverGoods{
	boolean flag;
	String m = null;

	public Express(boolean flag ){
		this.flag = flag;
	}

	public String sendMP(String method) {
		if(flag == true){
			m = method;
		}
		return "即将通过"+m+"方式为您发货，请注意查收喔~";
	}

	public String selectMethod() {
		return null;
	}
}

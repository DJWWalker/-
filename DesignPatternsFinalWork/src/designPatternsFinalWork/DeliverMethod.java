package designPatternsFinalWork;
//发货方式--代理模式
public class DeliverMethod implements DeliverGoods{
	boolean flag;
	public DeliverMethod(boolean flag){
		this.flag = flag;
	}

	public String selectMethod(){
		if(flag){//如果flag为true，则选择快递代理方式
			DeliverGoods express = new Express(flag);
			return express.sendMP("快递到家");
		}else{//否则，到店自取
			DeliverGoods tradition = new Tradition(flag);
			return tradition.sendMP("到店自取");
		}
	}

	public String sendMP(String method) {
		return null;
	}
}

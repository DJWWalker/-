package designPatternsFinalWork;
//短信类--原型模式（浅克隆）
public class SMS implements Cloneable 
{
	private String name;//收信人姓名
	private String pnum;//收信人手机号码

	public SMS(String name,String pnum)
	{
		this.name = name;
		this.pnum = pnum;
	}

	public Object clone(){//克隆方法
		SMS clone = null;
		try
		{
			clone = (SMS) super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return clone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String toString() {
		return name + pnum ;
	}
}

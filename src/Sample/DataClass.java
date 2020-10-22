package Sample;

public class DataClass {
	private int anumber;
	private String astring;
	public  DataClass (int anumber,String astring) {
		super();
		this.anumber=anumber;
		this.astring=astring;
	}
	public int getAnumber() {
		return anumber;
	}
	public void setAnumber(int anumber) {
		this.anumber = anumber;
	}
	public String getAstring() {
		return astring;
	}
	public void setAstring(String astring) {
		this.astring = astring;
	}

}

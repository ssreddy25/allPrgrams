package oops;

public class InvoiceItem {
	String id;
	String desc;
	int quty;
	double unitprice;
	public InvoiceItem(String id, String desc, int quty, double unitprice) {

		this.id = id;
		this.desc = desc;
		this.quty = quty;
		this.unitprice = unitprice;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQuty() {
		return quty;
	}
	public void setQuty(int quty) {
		this.quty = quty;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	public double getTotal(){
		return  (quty*unitprice);
	}
	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", desc=" + desc + ", quty=" + quty + ", unitprice=" + unitprice + "]";
	}
	
	
	

}

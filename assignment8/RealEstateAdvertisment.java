package assignment8;

public class RealEstateAdvertisment extends Advertisment {
	public String realEstateType;
	public String size;
	public double Price;
	public RealEstateAdvertisment(String advertismentId, String adDescriptionS, String realEstateType, String size,
			double price) {
		super(advertismentId, adDescriptionS);
		this.realEstateType = realEstateType;
		this.size = size;
		Price = price;
	}
	@Override
	public String toString() {
		return "RealEstateAdvertisment [realEstateType=" + realEstateType + ", size=" + size + ", Price=" + Price
				+ ", advertismentId=" + advertismentId + ", adDescriptionS=" + adDescriptionS + "]";
	}
	
	

}

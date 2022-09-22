package assignment8;

public class MatrimonialAdvertisment extends Advertisment {
	public String gender;
	public int age;
	public String occupation;
	public MatrimonialAdvertisment(String advertismentId, String adDescriptionS, String gender, int age,
			String occupation) {
		super(advertismentId, adDescriptionS);
		this.gender = gender;
		this.age = age;
		this.occupation = occupation;
	}
	@Override
	public String toString() {
		return "MatrimonialAdvertisment [gender=" + gender + ", age=" + age + ", occupation=" + occupation
				+ ", advertismentId=" + advertismentId + ", adDescriptionS=" + adDescriptionS + "]";
	}
	

}

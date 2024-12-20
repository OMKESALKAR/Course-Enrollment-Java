package Dec_17_EducationInstituteCourseEnrollmentSystem;
//FILE-02
public class Offer 
{
	private String offerText;
	
	public Offer(String offerText) {
		super();
		this.offerText = offerText;
	}

	public String getOfferText() {
		return offerText;
	}

	@Override
	
	public String toString() {
		return  getOfferText();
	}	
	
	
}

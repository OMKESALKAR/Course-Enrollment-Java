package Dec_17_EducationInstituteCourseEnrollmentSystem;
//FILE-03
public class EducationInstitute 
{
	Course[] courses;
	Offer[] offers;
	
	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}
	
	public Course[] getCourses()
	{
		return courses;
	}
	
	public Offer[] getOffers()
	{
		return offers;
	}

	public void enrollStudentInCourse(int courseId, String studentName) 
	{
		for (Course c : courses) 
		{
			if (courseId == c.getCourseId())
			{
				System.out.println("\n" + studentName + " has enrolled in the course: " + c.getCourseName());
				break;
			} 
		}
	}
}

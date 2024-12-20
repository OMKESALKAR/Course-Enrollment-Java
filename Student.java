package Dec_17_EducationInstituteCourseEnrollmentSystem;
//FILE-04
public class Student
{
	String name;
	EducationInstitute institute;
	
	public Student(String name, EducationInstitute institute) 
	{
		super();
		this.name = name;
		this.institute = institute;
	}
	
	public void viewCoursesAndFees()
	{
		Course[] courses = institute.getCourses();
		System.out.println("\nAvailable Courses: \n");
		for(Course c: courses)
		{
			System.out.println(c);
		}
	}
	
	public void viewOffers()
	{
		Offer[] offers = institute.getOffers();
		System.out.println("\nOngoing Offers: \n");
		for(Offer f : offers)
		{
			System.out.println(f);
		}
	}	
	
	public void enrollInCourse(int courseId)
	{
		institute.enrollStudentInCourse(courseId, name);
	}
}

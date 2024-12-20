package Dec_17_EducationInstituteCourseEnrollmentSystem;
//Main
public class EducationInstituteApp 
{
	public static void main(String[] args) throws InterruptedException
	{
		Course[] courses = new Course[] {
						new Course(1, "Mathematics", 1000),
						new Course(2, "Science", 1200), 
						new Course(3, "English", 900)
		};
		
		Offer[] offers = new Offer[] {
					new Offer("Special discount: Get 20% off on all courses!"), 
					new Offer("Limited time offer: Enroll in any two courses and get one course free!")	
		};
		
		EducationInstitute nit = new EducationInstitute(courses, offers); 
		
		Student s1 = new Student("Om Kesalkar", nit);
		Student s2 = new Student("Milind Ataram", nit);
		Student s3 = new Student("Nilay", nit);
		
		Runnable r1 = new Runnable() 
		{	
			@Override
			public void run() 
			{
				s1.viewCoursesAndFees();
				s1.viewOffers();
				s1.enrollInCourse(2);
				System.out.println("\n--------------- Thank You!! Have a nice day -------------");
			}
		};
		
		Runnable r2 = new Runnable()
		{
			@Override
			public void run() 
			{
				s2.viewCoursesAndFees();
				s2.viewOffers();
				s2.enrollInCourse(1);
				System.out.println("\n--------------- Thank You!! Have a nice day -------------");
			}
		};
		
		Runnable r3 = new Runnable()
		{
			@Override
			public void run() 
			{
				s3.viewCoursesAndFees();
				s3.viewOffers();
				s3.enrollInCourse(3);
				System.out.println("\n--------------- Thank You!! Have a nice day -------------");
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
	}

}

package StudentRegistration.Assignment1_B;

import java.util.ArrayList;

import org.joda.time.DateTime;

import StudentRegistration.Assignment1.Course;
import StudentRegistration.Assignment1.Module;
import StudentRegistration.Assignment1.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// make a list of modules
		Module softwareEngineering = new Module("Software Engineering III");
		Module machineLearning = new Module("Machine Learning");
		Module metricSpaces = new Module("Metric spaces");
		
		// make a list of courses
		Course computerScience = new Course("Computer Science", new DateTime(2020, 9, 1, 9, 0), new DateTime(2021, 6, 4, 17, 0)); // 1st sept 2020 @9am - 4th June 2021 @5pm
		Course maths = new Course("Maths", new DateTime(2020, 9, 1, 9, 0), new DateTime(2021, 6, 4, 17, 0));		
		
		// associate modules and courses together
		computerScience.AddModule(softwareEngineering);
		computerScience.AddModule(machineLearning);
		computerScience.AddModule(metricSpaces);
		// the two courses share one module
		maths.AddModule(machineLearning);
		maths.AddModule(metricSpaces);
		
		ArrayList<Module> moduleList = new ArrayList<Module>();
		moduleList.add(softwareEngineering);
		moduleList.add(machineLearning);
		
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(computerScience);		
		
		Student s1 = new Student("Bob Bobson", 25, "bobbybob69");
		s1.addCourse(computerScience);
		Student s2 = new Student("Alice Alicesmith", 19, "alllllllllice");
		s2.addCourse(maths);
		//test what happens when someone does two courses with an overlapping module
		Student s3 = new Student("Brainbox", 21, "bb99");
		s3.addCourse(maths);
		s3.addCourse(computerScience);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
    }
}

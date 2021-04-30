package thirdhomework;

public class InstructorManager {
  public void Add(instructor instructor) {
	  System.out.println("Yeni kurs eklendi: " + instructor.getCourseName());
	  
  }
  public void Delete(instructor instructor) {
		System.out.println(" Kurs Silindi: " + instructor.getCourseName());
	}
}

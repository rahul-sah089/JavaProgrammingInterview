package shallowCloining;

public class ShallowCopyInJava {
	public static void main(String[] args) {
		Course course = new Course("physics", "chemistry", "biology");
		Student student1 = new Student(1, "rahul", course);
		Student student2 = null;

		try {
			// Creating clone of student1 and assigning it to student2
			student2 = (Student) student1.clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		
		//printing the subject3 for student2
		System.out.println("Subject 3 of student 2-->"+student2.getCourse().getSubject3());
		
		//changing the subject3 of student2
		student2.getCourse().setSubject3("English");
		
		//printing the subject3 for student1
		System.out.println("Subject 3 of student 1-->"+student1.getCourse().getSubject3());

	}
}

package csci3444.inheritence;

public class MainEntry 
{
	public MainEntry() {}

	public static void main(String[] args) 
	{
		Person p1, p2;
		Teacher t = new TeacherImpl("Ilker", "java");
		Student s = new StudentImpl("Thomas", "java");
		
		
		p1 = t;
		p2 = s;
		
		System.out.println("p1's name  is: " + p1.getName());
		System.out.println("p2's name is: " + p2.getName());
		
	}

}

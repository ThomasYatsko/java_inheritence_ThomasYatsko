package csci3444.inheritence;

public class TeacherImpl extends PersonBaseImpl implements Teacher
{
	String thoughtCourseTitle;
	
	public TeacherImpl(String _name, String _thoughtCourseTitle) 
	{
		super(_name);
		name = _name;
		thoughtCourseTitle = _thoughtCourseTitle;	
	}
	public String teachesFor()
	{
		return thoughtCourseTitle;	
	}
	public String getDetails()
	{
		return "teacher";
	}
	

}

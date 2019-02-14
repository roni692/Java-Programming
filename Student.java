package Training;

import java.util.Set;

public class Student 
{
	int studentid;
	char studentType;
	Student()
	{
		studentid=10;
		studentType='F';
	}
	
	public void setstudentid(int id)
	{
		this.studentid = id;
		
	}
	public int getstudentid()
	{
		return studentid;
		
	}
	public void setstudentType(char studentType)
	{
		this.studentType =studentType;
	}
	public char getstudentType()
	{
		return studentType;
		
	}
	

}

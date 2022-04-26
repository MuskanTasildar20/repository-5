
public class student {
	int [] marks;
	private String name;
	private String address;
	private String rollno;
	private double CPI;
	student(String name, String rollno, int [] marks)
	{
	this.name = name;
	this.rollno = rollno;
	this.marks = marks;
	}
	String getName()
	{
	return name;
	}

}

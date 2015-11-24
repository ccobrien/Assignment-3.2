
public class Student 
{

	public static final int GRADE = 4;
	public static final int WEIGHT = 2;
	private String name;
	private double grades [][] = new double [GRADE][WEIGHT];
	private double gpa;
	public String studentGPA;
	

	public Student(String name, double [][]grades, double gpa) {
		this.name = name;
		this.grades = grades;
		this.gpa = gpa;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double [][] getGrades()
	{
		return this.grades;
	}
	public void setGrades(double [][] grades)
	{
		this.grades = grades;
	}
	//calculates GPA( actually it calculates the test average and total grade
	public void setGPA(double [][] grades)
	{
		double gpa = 0;
		for(int i = 0; i < GRADE; i++)
		{
			gpa+= (grades[i][0]) * (grades[i][1]);
		}
		this.gpa = gpa;
	}
	//calculates and then outputs the real gpa
	public double getGPA()
	{
		double actualGPA = (gpa/20) - 1;
		return this.gpa;
	}
	//calculates and then outputs the real gpa
	public String getGPATxt()
	{
		double actualGPA = (gpa/20) - 1;
		String studentGPA = Double.toString(actualGPA);
		return studentGPA;
	}
	//calculate test average(grade)
	public String getTestAverage()
	{
		double sum = 0;
		for(int i = 0; i < GRADE; i++)
		{
			sum+= (grades[i][0]) * (grades[i][1]);
		}
		String testAvg = Double.toString(sum);
		return testAvg;
	}
	//calculate letter grade
	public String getLetterGrade()
	{
		if(gpa >= 90)
		{
			return "A";
		}
		else if(gpa >= 80.0)
		{
			return "B";
		}
		else if(gpa >= 70.0)
		{
			return "C";
		}
		else if(gpa >= 60.0)
		{
			return "D";
		}
		else
		{
			return "F";
		}

	}
}


public class Student {
	private int rollNo;
    private String name;
    private float percentage;
	private String subject;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
    public void info()
    {
        System.out.println("Roll No : "+rollNo);
        System.out.println("Name : "+name);
        System.out.println("Subject Name : "+subject);
    }

    public static class StaticClass {
        public static void studentOptions() {
            System.out.println(" 1] Student Info \n 2] Display Results \n 3] Display Principle name of School \n 4] Exit \n ");
        }
    }

    public Student(int rollNo, String name, float percentage , String subject) {
        // TODO Auto-generated constructor stub
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
        this.subject = subject;
    }

	public String getSubject() {
		// TODO Auto-generated method stub
		return subject;
	}

}


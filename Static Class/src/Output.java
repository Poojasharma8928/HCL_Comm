import java.util.Scanner;
public class Output {
	public static void main(String[] args) {
        Student obj = new Student(1, "Pooja", 90.00f , "Java");
        Student obj1 = new Student(2 , "Sayli" , 89.00f , "Java");
        DetailsStudent student = new DetailsStudent(obj, "K John Public School", "Father Jobi Joseph" , "Java");
        DetailsStudent student1 = new DetailsStudent(obj1, "K John Public School", "Father Jobi Joseph" , "Java");
        Scanner sc = new Scanner(System.in);

        int in;
        do {
            Student.StaticClass.studentOptions();
            in = sc.nextInt();
            switch (in) {
            case 1: {
                obj.info();
                obj1.info();
                break;
            }
            case 2: {
                student.Result();
                student1.Result();
                break;
            }
            case 3: {
            	 student.setPrinciple(true);
            	 student.display();
            	 student1.setPrinciple(true);
            	 student1.display();
                break;
            }
            }
            System.out.println("\n");
        } while (in != 4);

    }
}

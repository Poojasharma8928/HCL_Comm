
public class DetailsStudent {
	private Student studentInfo;
    private String schoolName;
    private boolean principle;
    private String principleName;
    private String Subject;

    public DetailsStudent(Student studentInfo, String schoolName, String principleName , String Subject) {
        this.studentInfo = studentInfo;
        this.schoolName = schoolName;
        this.principalName = principleName;
        this.Subject = Subject;
    }

    public String getPrincipleName() {
        return principleName;
    }

    public void setPrincipleName(String principleName) {
        this.principleName = principleName;
    }

    public boolean isPrinciple() {
        return principle;
    }

    public void setPrinciple(boolean principle) {
        this.principle = principle;
    }

    private String principalName;

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public Student getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(Student studentInfo) {
        this.studentInfo = studentInfo;
    }

    public String getSubject() {
        return this.Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    } 
    
    
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void Result() {
        System.out.println("Result :");
        System.out.println("Name :" + studentInfo.getName());
        System.out.println("RollNo :" + studentInfo.getRollNo());
        System.out.println("Percentage :" + studentInfo.getPercentage());
//        System.out.println("Subject Name is :" + studentInfo.getSubject());
        
    }

    public void display() {
        class LocalInner {
            void preDeclaredResults() {
                System.out.println("Pre Declared Result :");
                System.out.println("Name :" + studentInfo.getName());
                System.out.println("RollNo :" + studentInfo.getRollNo());
                System.out.println("Percentage :" + studentInfo.getPercentage());
//                System.out.println("Subject Name is :" + studentInfo.getSubject());
                
            }
        }
        LocalInner li = new LocalInner();
        if (isPrinciple()) {
            li.preDeclaredResults();
        }

        abstract class Principle {
            abstract void principleName();
        }
        Principle p = new Principle() {

            @Override
            void principleName() {
                // TODO Auto-generated method stub
                System.out.println("Principle Name : " + principalName);
            }
        };
        p.principleName();
    }
}


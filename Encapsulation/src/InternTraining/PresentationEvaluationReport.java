package InternTraining;
import java.util.Scanner;
public class PresentationEvaluationReport {
public static void main(String[] args) {
	PresentationDetails  presentationDetails = new PresentationDetails();
	Scanner input = new Scanner (System.in);
	System.out.println("Enter your Name");
	String name = input.next();
	
	
	System.out.println("Enter your Topic Id");
	
	int topicId = input.nextInt();
	
	System.out.println("Enter Marks of Student");
	
	int marks = input.nextInt();
	
	PresntationTopic presentationTopic = new PresntationTopic();
	
	presentationDetails.setInternName(name);
	presentationTopic.setTopicId(topicId);
	presentationDetails.setMarksONPresentation(marks);
	presentationDetails.setFinalResult();
	presentationDetails.setPresentationTopic(presentationTopic);
	
	System.out.println("Internal Presentation Evaluation");
	
	System.out.println("****************************************");
	
	System.out.println("Name:" + presentationDetails.getInternName());
	
	System.out.println("TopicId:" + presentationTopic.getTopicName());
	
//	System.out.println("Marks:" + presentationDetails.getMarksONPresentation());
	
	System.out.println("FinalResult:" + presentationDetails.getFinalResult());
	
	
	
	
	
}
	
}


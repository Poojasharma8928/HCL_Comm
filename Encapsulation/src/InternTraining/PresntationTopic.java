package InternTraining;

public class PresntationTopic {
	public int topicId;
	public String topicName;



public void setTopicId(int id) {
    this.topicId = id;
    
}
//    public void setTopicName(String Topic_Name) {
//        this.TopicName = Topic_Name;
//}
    

public String getTopicName() {
	if(topicId == 3344) {
		return "Java Advance Concepts";
	}
	else if(topicId ==9087){
		return "HTML Validation";
	}
	else if(topicId ==0476){
		return "Jquery Events";
	}
	else if(topicId ==3455){
		return "Introduction to Python";
	}
	
	else if(topicId == 564){
		return "Ruby on Nails";
	}
	
	return topicName;
}
}
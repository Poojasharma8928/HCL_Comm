package InternTraining;

public class PresentationDetails {
	private String internName;
	private PresntationTopic presentationTopic;
	private int marksOnPresentation;
	private String finalResult;


public String getInternName() {
    return internName;      
}
public void setInternName(String internName) {
	this.internName = internName;
}
public PresntationTopic getPresentationTopic() 
{
	return presentationTopic;
}
public void setPresentationTopic(PresntationTopic presentationTopic) {
	this.presentationTopic = presentationTopic;
}


public int getMarksONPresentation() {
	return marksOnPresentation;
}

public void setMarksONPresentation(int marksONPresentation) {
	this.marksOnPresentation = marksONPresentation;
}


public String getFinalResult() {
	return finalResult;
}


public void setFinalResult() {
	
	if(marksOnPresentation>=40 && marksOnPresentation<=100)
	{
		this.finalResult="Pass";
	}
	else if (marksOnPresentation > 100)
	{
		this.finalResult="Invalid Marks";
	}
	else if (marksOnPresentation<40) {
		this.finalResult="Fail";
	}
	
	this.finalResult = finalResult;
}



}
import java.util.ArrayList;

// Monkey class that inherits from RescueAnimal class
public class Monkey extends RescueAnimal {
	// Monkey class variables in addition to base class RescueAnimal inherited variables
	private String species;
	private String tailLength;
	private String height;
	private String bodyLength;

	
	
	// overloaded Constructor method that includes parameters from RescueAnimal class
	public Monkey(String name, String species, String gender, String age, String weight, String acquisitionDate,
			String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry,
			String tailLength, String height, String bodyLength) {
		
	
		
		// setting attributes from constructors parameter arguments
		setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        
	}
	
	

	// accessors and mutators
	public void setSpecies(String newSpecies) {
		species = newSpecies;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setTailLength(String newTailLength) {
		tailLength = newTailLength;
	}
	
	public String getTailLength() {
		return tailLength;
	}
	
	public void setHeight (String newHeight) {
		height = newHeight;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void setBodyLength(String newBodyLength) {
		bodyLength = newBodyLength;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
	
	
	}
	



import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)
    
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    //Instance variables
    
     

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	char userInput;
    	
    	// initialize an ArrayList to hold the monkey species that are permitted so they are searchable
    	ArrayList<String> monkeySpeciesList = new ArrayList<String>();
    	String species1 = "Capuchin";
    	String species2 = "Guenon";
    	String species3 = "Macaque";
    	String species4 = "Marmoset";
    	String species5 = "Squirrel Monkey";
    	String species6 = "Tamarin";
    	
    	
    	// Initialize Array Lists
        initializeDogList();
        initializeMonkeyList();
        
        // Populate Monkey Species ArrayList with species
        monkeySpeciesList.add(species1);
        monkeySpeciesList.add(species2);
        monkeySpeciesList.add(species3);
        monkeySpeciesList.add(species4);
        monkeySpeciesList.add(species5);
        monkeySpeciesList.add(species6);
        
        
        
        
        
        // Display menu and get user input based on menu options included input validation
        displayMenu();
        do {
        	userInput = scanner.next().charAt(0);
        
        	if (userInput == '1' || userInput == '2' || userInput == '3' || userInput == '4' || userInput == '5' || userInput == '6') {
        		if (userInput == '1') {
        			intakeNewDog(scanner);
        		}
        		else if (userInput == '2') {
        			intakeNewMonkey(scanner);
        		}
        		else if (userInput == '3') {
        			reserveAnimal(scanner);
        		}
        		else if (userInput == '4' || userInput == '5' || userInput == '6'){
        			printAnimals();
        		}
        	}
        	else if (userInput == 'q') {
        		System.out.println("Goodbye.");
        		break;
        	}
        	else {
        		System.out.println("Input is not correct, please enter an option from the menu.");
        		       	
        	}
        } while (userInput != 'q');

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Billy", "Tamarin", "male", "15", "67", "04-03-2020", "USA", "Phase 1", false, "USA", "21", "56", "130");
    	Monkey monkey2 = new Monkey("Tommy", "Squirrel monkey", "male", "16", "89", "05-12-2020", "USA", "Phase 1", false, "USA", "23", "65", "23");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    
    }


    // Intake method for new dogs, must receive all attributes from user and set them at end
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.next();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
            
        }
        
        System.out.println("What is the dog's breed?");
        String breed = scanner.next();
        
        System.out.println("What is the dog's gender?");
        String gender = scanner.next();
        
        System.out.println("What is the dog's age?");
        String age = scanner.next();
        
        System.out.println("What is the dog's weight?");
        String weight = scanner.next();
        
        System.out.println("What is the dog's acquistion date?");
        String acquisitionDate = scanner.next();
        
        System.out.println("What is the dog's acquistion country?");
        String acquisitionCountry = scanner.next();
        
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.next();
        
        System.out.println("What is the dog's reserved status?");
        Boolean reserved = scanner.nextBoolean();
        
        System.out.println("What is the dog's service country?");
        String inServiceCountry = scanner.next();
        
        scanner.close();
        
        // create new dog instance based on user inputs
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, 
        		acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        
        // add dog to ArrayList of dog objects
        dogList.add(newDog);
        
        }

    
		// Accept user input for fields needed to create a new Monkey object
		// Make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.println("What is the monkey's name?");
            String name = scanner.next();
            for (Monkey monkey: monkeyList) {
            	if (monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		return;
            	}
            }
            
            
            System.out.println("What is the monkey's species?");
            String species = scanner.next();
            for (String monkeyType: monkeySpeciesList) {
            	if (!monkeyType.equalsIgnoreCase(species)) {
            		System.out.println("This monkey species is not accepted.");
            		return;
            		
            	}
            }
            
            
            System.out.println("What is the monkey's gender?");
            String gender = scanner.next();
            
            System.out.println("What is the monkey's age?");
            String age = scanner.next();
            
            System.out.println("What is the monkey's weight?");
            String weight = scanner.next();
            
            System.out.println("What is the monkey's acquisition date?");
            String acquisitionDate = scanner.next();
            
            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scanner.next();
            
            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.next();
            
            System.out.println("What is the monkey's reserved status?");
            boolean reserved = scanner.nextBoolean();
            
            System.out.println("What is the monkey's service country?");
            String inServiceCountry = scanner.next();
            
            System.out.println("What is the monkey's tail length?");
            String tailLength = scanner.next();
            
            System.out.println("What is the monkey's height?");
            String height = scanner.next();
            
            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.next();
            
            scanner.close();
            
            
            // Instantiate and add the new monkey to the appropriate list
            Monkey newMonkey = new Monkey(name, species, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength);
            
            monkeyList.add(newMonkey);
            
            return;
            
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	String animalType = " ";
        	String serviceCountry = " ";
        	int i;
        	
        	
        	
        	do {
        		System.out.println("Please enter animal type(monkey or dog): ");
        		animalType = scanner.nextLine();
        	}
        	while (!animalType.equalsIgnoreCase("dog") || !animalType.equalsIgnoreCase("monkey")); 
        		
        	
        	System.out.println("Please enter your country: ");
  
        	serviceCountry = scanner.nextLine(); 
        	
        	if (animalType == "dog") {
        		for (Dog dog : dogList) {
        			if (dog.getAcquisitionLocation().equalsIgnoreCase(serviceCountry)) {
        				dog.setReserved(true);
        				dog.setInServiceCountry(serviceCountry);
        				System.out.println(dog.getName() + " has been reserved in " + serviceCountry + ".");
        				return;	
        			}
        			else {
        				System.out.println("There are no available service dogs in " + serviceCountry);
        				return;
        			}
        		}
        	}
        	if (animalType == "monkey") {
        		for (Monkey monkey: monkeyList) {
        			if (monkey.getAcquisitionLocation().equalsIgnoreCase(serviceCountry)) {
        				monkey.setReserved(true);
        				monkey.setInServiceCountry(serviceCountry);
        				System.out.println(monkey.getName() + " has been reserved in " + serviceCountry + ".");
        				return;
        			}
        			else {
        				System.out.println("There are no available monkeys in " + serviceCountry);
        				return;
        			}
        		}
        	}
        	
        	
            

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals() {
        	for (Dog dog: dogList) {
        		System.out.printf("Dog name: %s | ", dog.getName());
        		System.out.printf("Dog breed: %s | ", dog.getBreed());
        		System.out.printf("Dog training status: %s | ", dog.getTrainingStatus());
        		System.out.printf("Dog acquisition country: %s | ", dog.getAcquisitionLocation());
        		System.out.printf("Dog reserved status: %s | ",  dog.getReserved());
        		System.out.println();
        	}
        	System.out.println();
        	System.out.println();
        	
        	for (Monkey monkey: monkeyList) {
        		System.out.printf("Monkey name: %s | ", monkey.getName());
        		System.out.printf("Monkey species: %s | ", monkey.getSpecies());
        		System.out.printf("Monkey training status: %s | ", monkey.getTrainingStatus());
        		System.out.printf("Monkey acquisition country: %s | ", monkey.getAcquisitionLocation());
        		System.out.printf("Monkey reserved status: %s | ",  monkey.getReserved());
        		System.out.println();
        		
        	}
        	System.out.println();
        	System.out.println();
        	
        	System.out.println("----ALL AVAILABLE ANIMALS----\n\n");
        	
        	System.out.println("----Available service dogs----");
            for (Dog dog: dogList) {
            	if (dog.getTrainingStatus() == "in service" && dog.getReserved() == false) {
            		System.out.printf("%s is available in %s.", dog.getName(), dog.getInServiceLocation());
            	}
            }
            
            System.out.println();
            
            System.out.println("----Available service monkeys----");
            for (Monkey monkey: monkeyList) {
            	if (monkey.getTrainingStatus() == "in service" && monkey.getReserved() == false) {
            		System.out.printf("%s is available in %s.", monkey.getName(), monkey.getInServiceLocation());
            	}
            }

        }
}


package JavaRoadMap;

public class JavaDetails {
	String topic;
	public JavaDetails(String topic) {
		this.topic = topic;
	}
	public void displayInfo() {
		System.out.println("I am learning " + topic + " in Java");
	}
	public static void main(String... args) {
		System.out.println("=================================");
		System.out.println("Welcome to the World of Java");
		System.out.println("=================================");
		JavaDetails[] details= new JavaDetails[3];
		details [0] = new JavaDetails("langchainj4");
		details [1] = new JavaDetails("spring ai");
		for(int i=0;i<3;i++) {
			
			details[i].displayInfo();
		}
	}

}
/*Output:=================================
Welcome to the World of Java
=================================
I am learning langchainj4 in Java
I am learning spring ai in Java */

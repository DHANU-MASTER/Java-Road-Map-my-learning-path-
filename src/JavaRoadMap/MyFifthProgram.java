package JavaRoadMap;

public class MyFifthProgram {
	public static void main(String... args) {
        // We just call the machine. 
        // We don't do: int x = sayHello("Dhanush") because it returns nothing!
        sayHello("Dhanush");
        sayHello("Java Master");
    }

    // "void" means no data comes back. It just executes the code inside.
    public static void sayHello(String name) {
        System.out.println("===========================");
        System.out.println("Hello, " + name + "! Welcome to Day 5.");
        System.out.println("===========================");
        
        // Notice there is no 'return' statement down here!
}}
/*Output:===========================
Hello, Dhanush! Welcome to Day 5.
===========================
===========================
Hello, Java Master! Welcome to Day 5.
===========================

    
  /*  // ==========================================================
    // 1. THIS IS THE MAIN PROGRAM (Where the code actually runs)
    // ==========================================================
    public static void main(String[] args) {
        
        System.out.println("Starting the calculator...");
        
        // We "call" our custom machine and feed it the ingredients: 5 and 10
        int roomOne = calculateArea(5, 10);
        
        // We can use it again without rewriting the math!
        int roomTwo = calculateArea(20, 30);
        
        System.out.println("Room 1 Area: " + roomOne);
        System.out.println("Room 2 Area: " + roomTwo);
    }
    
    // ==========================================================
    // 2. THIS IS OUR CUSTOM MACHINE (Built outside of main!)
    // ==========================================================
    // "int" means it will spit out a whole number. 
    // The parentheses hold the ingredients it needs to work.
    public static int calculateArea(int length, int width) {
        
        // The machine does the work
        int total = length * width;
        
        // "return" is the machine spitting the final answer out
        return total;
    }
}
/*Output:Starting the calculator...
Room 1 Area: 50
Room 2 Area: 600
*/
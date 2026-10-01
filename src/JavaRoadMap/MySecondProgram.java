package JavaRoadMap;

public class MySecondProgram {
	public static void main(String[] args) {
int a = 10;
int b = 30;
float c =20.5f;
System.out.println("The value of a is: " + a);
System.out.println("The value of b is: " + b);
System.out.println("The value of c is: " + c);
System.out.println("The sum of a and b is: " + (a + c));
int winner = (int) ((a > b) ? (a > c ? a : c) : (b > c ? b : c));
System.out.println("The winner is: " + winner);
	}

}

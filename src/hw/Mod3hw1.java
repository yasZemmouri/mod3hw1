package hw;

public class Mod3hw1 {
	//Methods
	public static boolean getUp(boolean squawking, int currentHour) {
		if(squawking == true && !(currentHour>6 && currentHour<22)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// Some use cases
		if(getUp(true, 5)) System.out.println("Get Up!"); 
		else System.out.println("Stay!");
		if(getUp(false, 5)) System.out.println("Get Up!"); 
		else System.out.println("Stay!");
		if(getUp(true, 23)) System.out.println("Get Up!");
		else System.out.println("Stay!");
		if(getUp(true, 10)) System.out.println("Get Up!");
		else System.out.println("Stay!");
		
	}

}

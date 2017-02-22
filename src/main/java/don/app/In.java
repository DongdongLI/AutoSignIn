package don.app;

import java.util.Scanner;

import don.signin.SignIn;

public class In {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		SignIn.changeMyStatus("in");
		
		if(!SignIn.checkStatus("in")){
			System.out.println("Please TRY again");
		}
		
		System.out.println("Press any key to continue");
		s.nextLine();
	}
}

import java.lang.String;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ProcessAName5026211128{

  public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Type your name: ");

	String firstName, lastName, name, inisial, ans;
	firstName = "";
	lastName = "";
	name = "";
	ans = "";
	inisial = "";

	int start = 1;

	firstName = sc.next();
	int huruf = firstName.length();
	inisial = firstName.charAt(0) + ".";

	name = sc.nextLine();
	int idx = name.indexOf(" ", start);

	if(name == ""){

		System.out.println(huruf);
		System.out.println("Your name is: "+ firstName);
	}
	else {

	while(idx != -1){

		lastName = ans;
		ans = name.charAt(start) + ". ";
		start = idx+1;
		idx = name.indexOf(" ", start);

	}

	ans = name.substring(start, name.length()) + ", " + inisial + ans;
	ans = ans.substring(0,ans.length()-1);
		System.out.println(huruf);
		System.out.println(ans);

  	}

  }
}
	
	






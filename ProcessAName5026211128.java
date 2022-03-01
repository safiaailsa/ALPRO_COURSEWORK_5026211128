import java.util.Scanner;

public class ProcessAName5026211128{

  public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
		System.out.print("Type your name: ");
	String Name = sc.nextLine();

	int lastIndex = Name.lastIndexOf(" ");
		System.out.println(lastIndex);

	int firstname = Name.lastIndexOf(" ");
	String lastname = Name.substring(firstname+1);
		System.out.println("Your name is " +lastname+ ", " +Name.charAt(0)+ ". ");
  }
}


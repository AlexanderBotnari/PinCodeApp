import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    final int Corect_Pin = 1234 ;
	    int pin;// from user
	    int y = 1;
	    do{
	    System.out.println("Enter your pin :");
	    pin = in.nextInt();
	    y++;
	    }while(pin != Corect_Pin && y<4);
	}

}

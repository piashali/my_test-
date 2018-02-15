import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		int randomnum=(int)(Math.random()*100)+1;
		boolean yesit=false;
		System.out.println("a number has been generated");
		System.out.println("Guess the number");
	 
	 for(int i=10;i>0;i--) {
		 Scanner nn= new Scanner(System.in);
		 int num= nn.nextInt();
		 System.out.println(num);
		 System.out.println("you have more "+ i+ " turns"); 
	 
	 
	 if(num < randomnum) {
		 
		 System.out.println("the number is bigger than your guess"); 
	 }
if(num > randomnum) {
		 
		 System.out.println("the number is small than your guess"); 
	 }
if(num == randomnum) {
	 yesit=true;
 break; 
}
		// TODO Auto-generated method stub

	}
	 if(yesit) {
		 System.out.println("u win");
	 }
	 else 	 System.out.println("u loss, game over");
	}
}

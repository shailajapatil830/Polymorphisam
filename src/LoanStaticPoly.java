import java.util.Scanner;

public class LoanStaticPoly {
	
	public void CallLoan(int age) {
		if(age < 18){
			System.out.println("you will not get loan. ");
		}
	   else {
		   System.out.println("you will get loan. ");
		   Scanner input = new Scanner(System.in);
		   
		   System.out.println("Enter the loan Amount : ");
		  int loanAmount = input.nextInt();
	   }
		
	}
	
	public void CallLoan(int age, int loanAmount) {
		if(age < 18){
			System.out.println("you will not get loan. ");
		}
	   else {
		   System.out.println("you will get loan. ");
	   }
	}

}
    


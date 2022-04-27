import java.util.Scanner; //import  scanner class to take user input
public class LoanPayments { //Naming public class as LoanPayments

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int years, months; // defining years and months as integers
		double amount, i, rate, monthlyPayment, total; //variable for amount
		
		amount = 0; //setting amount to 0
		years = 0; //variable for number of years
		
		Scanner scnr = new Scanner(System.in);//initializing scanner for input data from user.
        
        System.out.print("Enter loan amount,  for example 120000.95: ");//asking user for input data.
        amount = Double.parseDouble(scnr.nextLine()); //Storing amount 
          
        if(amount > 0){ //to validate if loan amount is greater than 0
         }       
        
        else{ //If its less than 0 then we print to screen to re-enter program.
          System.out.println("Please enter a positive number and re-enter program.");
         }
        
        System.out.print("Enter number of years as an integer, for example, 5: "); //Asking user to enter number of years
        years = Integer.parseInt(scnr.nextLine());
        if(years > 0){
         }        
        
        else{
         System.out.println("Please enter a positive number of years and re-enter program.");
         }
        
        System.out.printf("Loan Amount: $%.2f\n", amount);//Printing loan amount to screen 
        System.out.printf("Numbers of Years: %d\n", years);//Printing number of years to screen 
        System.out.printf("%-15s%-20s%s\n", "Interest Rate", "Monthly Payment", "Total Payment");//printing interest rate monthly payment and total payment to screen
        
        months = years * 12; //computing total number of months
        for(i = 5.0; i <= 8.0; i += (1.0/8.0)){ //setting for loop for known range of values
        	rate = (i /100) / 12.0; //setting the rate by dividing i by 100 then dividing it by 12
            monthlyPayment = amount / ((Math.pow(1 + rate, months) - 1) / (rate * (Math.pow(1 + rate, months))));
            //loan_amount / ((((1 + monthly interest rate MIR) ^ number of months) - 1) / (MIR * ((1+rate) ^ number of months)))
            total = monthlyPayment * months;
            //the total payments is multiplied by our monthly payment amount by the number of months
            System.out.printf("%.3f%-7s%-20.2f%.2f\n", i, "%", monthlyPayment, total);
            //printing to screen the amounts with class formatter to give spacing, decimal point placements
        }
	}
}


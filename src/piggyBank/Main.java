package piggyBank;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;


public class Main{

    public static void main(String args[]){

        int choice=8;
        
        MoneyAdder myPiggyBank = new MoneyAdder();
       

        while (choice!=0) {

            out.println("\nOptions");
            out.println("0: Done");
            out.println("1: Show total amount of money.");
            out.println("2: Add a dollar.");
            out.println("3: Add a quarter.");
            out.println("4: Add a dime.");
            out.println("5: Add a nickel.");
            out.println("6: Add a penny.");
            out.println("\nEnter your choice: \n");
            //break;

            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            if(choice == 1)
            {
              out.println(myPiggyBank.getTotal());
            }
            if(choice == 2)
            {
              myPiggyBank.addDollar();
             
            }
            if(choice == 3)
            {
              myPiggyBank.addQuarter();
            }
            if(choice == 4)
            {
              myPiggyBank.addDime();
            }
            if(choice == 5)
            {
              myPiggyBank.addNickel();
            }
            if(choice == 6)
            {
              myPiggyBank.addPenny();
            }  

           
         

        }

    }

   
}
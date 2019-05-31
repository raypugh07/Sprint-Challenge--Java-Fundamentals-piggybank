package piggyBank;
//import static java.lang.System.out;
//import java.util.Scanner;
import java.text.DecimalFormat;

public class PiggyBank{

    DecimalFormat fp = new DecimalFormat("$###,###.00");

    private double dollars=0;
    private double quarters=0;
    private double dimes=0;
    private double nickels=0;
    private double pennies=0;

    public String getTotal(){

        double total=(dollars*1.0+(quarters*.25)+(dimes*.10)+(nickels*.05)+(pennies*.01));
        return "Dollars:"+ dollars + "\nquarters:" + quarters + "\ndimes:" + dimes + "\nnickels:" + nickels + "\npennies:" + pennies
                +"\nThe Piggy Bank holds: "+ fp.format(total);
    }

    public void addDollar(){
        dollars++;

    }
    public void addQuarter(){
        quarters++;
    }
    public void addDime(){
        dimes++;
    }
    public void addNickel(){
        nickels++;
    }
    public void addPenny(){
        pennies++;
    }

}
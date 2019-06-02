package piggyBank;

/*package piggyBank;
//import static java.lang.System.out;
//import java.util.Scanner;
import java.text.DecimalFormat;

public abstract class PiggyBank{

    DecimalFormat fp = new DecimalFormat("$###,###.00");

    public double dollars;
    public double quarters;
    public double dimes;
    public double nickels;
    public double pennies;

    public PiggyBank(double dollars,double quarters,double dimes,double nickels,double pennies){

      this.dollars=dollars;
      this.quarters=quarters;
      this.dimes=dimes;
      this.nickels=nickels;
      this.pennies=pennies;


    }

    public PiggyBank(){
      dollars=0;
      quarters=0;
      dimes=0;
      nickels=0;
      pennies=0;
    }

    public abstract String getTotal();

    

   /* public void addDollar(){
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

}*/

import java.util.ArrayList;
import java.text.DecimalFormat;


public class PiggyBank{

  private ArrayList<Coin> coinArray= new ArrayList<Coin>();

        DecimalFormat fp = new DecimalFormat("$###,###.00");


        public PiggyBank(){

        }

        public void addCoin(Coin newCoin){
          coinArray.add(newCoin);
        }

        public void iGetMoney(){
          double arrayValue=0;
           for (Coin coin : coinArray) {
            System.out.println(coin.toString());
            arrayValue += coin.getTotal();
        }
        System.out.println("The piggy bank holds " + fp.format(arrayValue));
        }

     


   

   
}
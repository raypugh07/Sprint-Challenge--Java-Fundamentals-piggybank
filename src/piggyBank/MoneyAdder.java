package piggyBank;

public class MoneyAdder extends PiggyBank{

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
  
      @Override
      public String getTotal(){
        
          double total=(dollars*1.0+(quarters*.25)+(dimes*.10)+(nickels*.05)+(pennies*.01));
          return "Dollars:"+ dollars + "\nquarters:" + quarters + "\ndimes:" + dimes + "\nnickels:" + nickels + "\npennies:" + pennies
                  +"\nThe Piggy Bank holds: "+ fp.format(total);
      }
  
  }
import java.io.*;
import java.util.*;
import java.util.Scanner;

abstract class beverage{
    String desc = "Unknown Beverage";
     public String getDescription(){
         return desc;
     }
     public abstract int getCost();
}

class houseBlend extends beverage{                   
      public houseBlend(){
          desc = "HouseBlend";
      }  
      public int getCost(){
          return 10;
      }
}

class darkRoast extends beverage{                   
      public darkRoast(){
          desc = "DarkRoast";
      }  
      public int getCost(){
          return 20;
      }
}

class espresso extends beverage{                   
      public espresso(){
          desc = "Espresso";
      }  
      public int getCost(){
          return 30;
      }
}

abstract class condimentDecorator extends beverage{
     
}

class milk extends condimentDecorator{
      beverage bev;
      public milk(beverage bev){
          this.bev = bev;
      }
      public String getDescription(){
          return bev.getDescription() + " Milk";
      }
      public int getCost(){
          return 15 + bev.getCost();
      }
}

class mocha extends condimentDecorator{
    beverage bev;
    public mocha(beverage bev){
        this.bev = bev;
    }
    public String getDescription(){
        return bev.getDescription() + " Mocha";
    }
    public int getCost(){
        return 25 + bev.getCost();
    }
}

class chocolate extends condimentDecorator{
    beverage bev;
    public chocolate(beverage bev){
        this.bev = bev;
    }
    public String getDescription(){
        return bev.getDescription() + " Chocolate";
    }
    public int getCost(){
        return 35 + bev.getCost();
    }
}




public class decoratorPattern {
    public static void main(String[] args)
    {
        System.out.println("\nHi, this is Decorator Pattern: \n");

        espresso esp = new espresso();
        milk mi = new milk(esp);
        chocolate choc = new chocolate(mi);

        System.out.println("Your beverage is: \n");
        System.out.println(choc.getDescription()+"\n");
        System.out.println(choc.getCost()+"\n");


        

    }
}

package Pizzas;

public class Pizza {
      private boolean isVeg;
      private int extraCheesePrice;
      private int totalPrice;
      private  int toppingPrice;
      private int paperBagPrice;
      private String bill;



    Pizza(Boolean ans){
          if(ans){
             totalPrice = 300;
             this.bill = "Base Price of Veg Pizza is :" + 300 +"\n";
          }
          else{
              totalPrice = 400;
              this.bill = "Base Price of Non-Veg Pizza is :" + 400 +"\n";
          }
          this.extraCheesePrice = 70;
          this.paperBagPrice = 20;
          if(ans){
              this.toppingPrice = 70;
          }
          else{
              this.toppingPrice =120;
          }

      }

      public void addExtraCheese(){
        totalPrice = totalPrice + extraCheesePrice;
          this.bill = "Base Price of  Pizza is :" + totalPrice +"\n";
      }

    public void addExtraToppings(){
        totalPrice = totalPrice + toppingPrice;
        this.bill = "Base Price of Pizza is :" + totalPrice +"\n";
    }
    public void packedPizza(){
        totalPrice = totalPrice + paperBagPrice;
        this.bill = "Total Packed Price of Pizza is :" + totalPrice +"\n";
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    public String getBill(){
        this.bill = this.bill + "Total Bill Price is :"+totalPrice+"\n";
        return bill;
    }

}

package Pizzas;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Ma'am  would you like to order Veg or No-veg Pizza"+"Write veg for VEG and non-veg for NON-VEG");
         String ans = sc.next();
         Pizza pizza;
         if(ans.equals("VEG")){
             pizza = new Pizza(true);
         }
         else{
             pizza = new Pizza(false);
         }
         System.out.println("Ma'am would you like to top-up with extra cheese"+"Please Press YES or NO");
         String isExtraCheese = sc.next();

         if(isExtraCheese.equals("YES")){
             pizza.addExtraCheese();
         }

         System.out.println("Ma'am would you like any extra toppings"+"Please Press YES or NO");
         String isExtraToppings = sc.next();

         if(isExtraToppings.equals("YES")){
             pizza.addExtraToppings();
         }

         System.out.println("Ma'am would you like to eat or pack the pizza"+"Please Press EAT or PACK");
         String ispacked = sc.next();

         if(ispacked.equals("PACK")){
             pizza.packedPizza();
         }
         System.out.println("Total amount is : "+pizza.getTotalPrice());

         //Bill angle



         System.out.println("Would you like a generate Bill : YES / NO");

         String BillAns = sc.next();

         if(BillAns.equals("YES")){
             String bill = pizza.getBill();
             System.out.println(bill);
         }
     }
}
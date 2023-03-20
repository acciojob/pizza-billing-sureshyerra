package com.driver;

public class Pizza {

   public int basePrice;

   public int cheesePrice;

   public int paperBagPrice;

   public int toppings;

   public boolean getbilladded;



   public int totalPrice;

   public String bill;

   public boolean cheesePriceAdded;

   public boolean bagPriceAdded;

   public boolean toppingsAdded;



    public Pizza(Boolean isVeg){

        // your code goes here
        if(isVeg == true){
            basePrice = 300;
            toppings = 70;
        }
        else {
            basePrice = 400;
            toppings = 120;
        }
        cheesePrice = 80;

        paperBagPrice = 20;



        cheesePriceAdded = false;

         bagPriceAdded = false;

         toppingsAdded = false;

        getbilladded = false;
        totalPrice = basePrice;

        bill =  "Base Price Of The Pizza: "+ basePrice  + "\n";


    }

    public int getPrice(){

        return this.totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here

        if(cheesePriceAdded == false){
            this.totalPrice+=cheesePrice;
            cheesePriceAdded = true;


        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (toppingsAdded == false){
            this.totalPrice+=toppings;
            toppingsAdded = true;


        }
    }

    public void addTakeaway(){
        // your code goes here
        if(bagPriceAdded == false){
           this.totalPrice+= paperBagPrice;
            bagPriceAdded = true;

        }
    }

    public String getBill(){
        // your code goes here

        if (getbilladded == false) {

            if(cheesePriceAdded == true){
                bill = bill + "Extra Cheese Added: "+cheesePrice + "\n";
            }
            if (toppingsAdded == true){
                bill = bill + "Extra Toppings Added: "+toppings + "\n";
            }
            if (bagPriceAdded == true){
                bill = bill +  "Paperbag Added: " + paperBagPrice + "\n";
            }

            bill = bill + "Total Price: " + totalPrice + "\n";
            getbilladded = true;


        }
        return this.bill;

    }
}

package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isExtraCheeseAdded;
    private Boolean isToppingsAdded;
    private Boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        isExtraCheeseAdded = false;
        price = (isVeg ? 300 : 400);
        isToppingsAdded = false;
        isTakeAway = false;
        this.bill = "";
        if(isVeg){
            bill+="Base Price Of The Pizza: 300"+"\n";
        }else{
            bill+="Base Price Of The Pizza: 400"+"\n";
        }
        // your code goes her
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            price+=80;
            bill+="Extra Cheese Added: 80"+"\n";
        }
        isExtraCheeseAdded = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            price+=(isVeg ? 70 : 120);
            if(isVeg)
                bill+="Extra Toppings Added: 70"+"\n";
            else
                bill+="Extra Toppings Added: 120"+"\n";
        }
        isToppingsAdded = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway) {
            price += 20;
            bill+="Paperbag Added: 20"+"\n";
        }
        isTakeAway = true;
    }

    public String getBill(){
        // your code goes here

        return this.bill+"Total Price: "+price+"\n";
    }
}

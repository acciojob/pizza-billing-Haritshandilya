package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean isExtraCheeseAdded;
    private Boolean isToppingsAdded;
    private Boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        isExtraCheeseAdded = false;
        price = (isVeg ? 300 : 400);
        isToppingsAdded = false;
        isTakeAway = false;
        // your code goes her
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            price+=80;
        }
        isExtraCheeseAdded = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            price+=(isVeg ? 70 : 120);
        }
        isToppingsAdded = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway) price+=20;
        isTakeAway = true;
    }

    public String getBill(){
        // your code goes here
        bill = "";
        if(isVeg){
            bill+="Base Price Of The Pizza: 300";
        }else{
            bill+="Base Price Of The Pizza: 400";
        }
        if(isExtraCheeseAdded){
            bill+="\n"+"Extra Cheese Added: 80";
        }
        if(isToppingsAdded){
            if(isVeg)
                bill+="\n"+"Extra Toppings Added: 70";
            else
                bill+="\n"+"Extra Toppings Added: 120";
        }
        if(isTakeAway){
            bill+="\n"+"Paperbag Added: 20";
        }
        bill+="\n"+"Total Price: "+price;
        return bill;
    }
}

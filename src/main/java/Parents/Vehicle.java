package Parents;

import Behaviours.IAssemble;
import Components.Tyres;

public abstract class Vehicle {

    //instance
    private double price;
    private String colour;


    //constructor
    public Vehicle (double price, String colour){
            this.price = price;
            this.colour = colour;

    //engine- excluded (comes from iAssemble)
    //tyres - excluded (comes from iAssemble)
    //price - hardcoded
    //colour - hardcoded

}

    //methods

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

//    public canAddDamage(damage){
//
//
//    }

    //add damage - includes a cost impact, vehicle price reduced

}

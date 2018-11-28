package Components;

import Behaviours.IAssemble;

public class Tyres implements IAssemble {

    //instance

    private String make;
    private String model;
    private Double price;

    //constructor

    public Tyres(String make, String model, double price){
        this.make = make;
        this.model = model;
        this.price = price;
    }



    //methods

    //getters

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

     public String getAssembly(String data){
           return "My tyres are assembled" + data;

     }
}

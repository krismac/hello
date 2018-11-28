package Components;

import Behaviours.IAssemble;

public class Engine implements IAssemble {

        //instance
        private int capacity;
        private String brand;
        private double price;

        //constructor
        public Engine(int capacity, String brand, double price){
            this.capacity = capacity;
            this.brand = brand;
            this.price = price;

    //size
    //brand
    //price
}

    //methods
        //getters
    public int getCapacity() {
        return capacity;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getAssembly(String data){
        return "My engine is assembled" + data;

    }

}

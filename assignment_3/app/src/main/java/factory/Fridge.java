package factory;

import factory.Product;

//Fridge implement Product, EnergyConsumer
    //store a boolean whether the the fridge has a freezer, int on total volume in liter, String to store the brand of the fridge
    //static factory methods to create common fridge types
    //static Fridge createFreezer(String brand, int volume, double price) that constructs a fridge that has a freezer, the specified volume, brand and price, and runs on 240𝑉, 2𝐴. 
    //static Fridge createFridge(String brand, int volume, double price)

public class Fridge implements Product, EnergyConsumer {
    
    //initialize
    private double price;
    private String material;
    
    private double voltage;
    private double current;

    private boolean hasFreezer;
    private int totalVolume;
    private String brand;

    //Override product methods
    @Override 
    public double getPrice() {
        return this.price;
    }
    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    @Override
    public void visit(ProductVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String toString(){
        return String.format("This %s Fridge cost %f", this.material, this.price);
    }


    //Override energyconsumer methods
    @Override
    public double getCurrent() {
        return this.current;
    }
    @Override
    public double getVoltage() {
        return this.voltage;
    }


    //use static factory methods to create instances of Fridge
    public static Fridge createFreezer(String brand, int volume, double price){
        
    };
    public static Fridge createFridge(String brand, int volume, double price){

    };


}

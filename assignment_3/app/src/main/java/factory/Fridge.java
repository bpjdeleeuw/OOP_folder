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
    
    private double voltage;
    private double current;

    private boolean hasFreezer;
    private int totalVolume;
    private String brand;

    // //constructor
    // private Fridge(double price, double voltage, double current, boolean hasFreezer, int totalVolume, String brand){
    //     this.price = price;
    //     this.voltage = voltage;
    //     this.current = current;
    //     this.hasFreezer = hasFreezer;
    //     this.totalVolume = totalVolume;
    //     this.brand = brand;
    // }


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

        private String freezerPrint;
        if (this.hasFreezer){
            this.freezerPrint = "a"
        }else{
            this.freezerPrint = "no"
        }

        return String.format("This %s Fridge costs %f, runs on %f V, %f amps, has a total volume of %x, has %s freezer. ", this.brand, this.price, this.voltage, this.current, this.totalVolume, freezerPrint);
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
    public static Fridge createFreezer(String brand, int totalVolume, double price){
        //   constructs a fridge that has a freezer, the specified volume,
        // brand and price, and runs on 240𝑉, 2𝐴. 
        
        boolean hasFreezer = true;
        double current = 2;
        double voltage = 240;
        
    return new Fridge(price, voltage, current, hasFreezer, totalVolume, brand)

    };
    public static Fridge createFridge(String brand, int totalVolume, double price){
        
        boolean hasFreezer = false;
        double current = 2;
        double voltage = 240;
        
        return new Fridge(price, voltage, current, hasFreezer, totalVolume, brand)

    };


}

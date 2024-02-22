package factory;

import java.util.List;
import java.util.ArrayList;

public class Warehouse {
    private String name;
    private List<Product> products;

    public Warehouse(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public static Warehouse createMyWarehouse() {
        List<Product> products = new ArrayList<>();

        products.add(new Chair(50,  "Wood"));
        products.add(new Chair(100, "metal"));
        // products.add(new TV(
            // displayTechnology:"LG L27LCD+",
            // horizontalResolution:1920,
            // verticalResolution:1080,
            // refreshRate:60
            // bit

        return new Warehouse("My warehouse", products);
    }

    public void procedure1() {

        //using downcasting to access properties of objects within warehouse
        for(Product product : products) {
            //reduce price of all TVs with LCD technology by 10%
            if(product instanceof TV) {
                TV tv = (TV) product;
                if (tv.getDisplayTechnology().equals("LCD")){
                    tv.setPrice(tv.getPrice() * 0.9);
                }
            }

            //increase price of all Fridges by 20%
            if(product instanceof Fridge) {
                Fridge fridge = (Fridge) product;
                if (fridge.getFreezer()){
                fridge.setPrice(fridge.getPrice() * 1.2);
                }
            }
        }

    }

    public void procedure2() {
        // Extend the product interface such that it contains a method void accept(ProductVisitor
        // visitor). A ProductVisitor3 is a new interface, that contains the methods void
        // visit(Chair chair), void visit(Fridge fridge), void visit(Tv tv).
        // This procedure should:
        // • Create a class implementing the ProductVisitor interface, which:
        // – Discounts every wooden chair by 15%, while increasing the price of metal
        // chairs by 12%.
        // – Discounts every Samsung fridge by 5%.
        // – Discounts every TV having 2 or more DP connectors by 30%.
        // • Iterate over all products and call product.accept(visitor).

        //visitor allows adding new behaviour to exisiting classes without altering any existing code. 

        //you make a new class visitor which you place between the class and the calling
    }

    public interface ProductVisitor{
        void visit(Chair chair);
        void visit(Fridge fridge);
        void visit(TV tv);
    }

    public class Productiterator implements ProductVisitor{
        
    }

    @Override
    public String toString() {
        // TODO implement

        return "";
    }
}

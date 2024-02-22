package factory;

public interface Product {
    double getPrice();
    void setPrice(double newPrice);
    default void multiplyPrice(double factor){ this.setPrice(factor * this.getPrice());};
    void visit(ProductVisitor visitor);
    String toString();
}

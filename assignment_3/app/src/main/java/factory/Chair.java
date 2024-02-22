package factory;

public class Chair implements Product{
  private double price;
  private String material;

  public Chair(double price, String material){
    this.price = price;
    this.material = material;
  }
  
  @Override
  public double getPrice(){
    return this.price;
  }

  @Override
  public void setPrice(double newPrice){
    this.price = newPrice;
  }

  @Override
  public void visit(ProductVisitor visitor) {
    visitor.visit(this);
  }

  public String getMaterial(){
    return this.material;
  }

  @Override
  public String toString(){
    return String.format("This %s chair cost %f", this.material, this.price);
  }
}

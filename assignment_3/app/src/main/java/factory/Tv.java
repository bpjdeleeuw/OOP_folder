package factory;

public class Tv implements Product, EnergyConsumer, Display{  

  private double price;
  private double voltage;
  private double current;
  private int horizontalResolution;
  private int verticalResolution;
  private int refreshRate;
  private int bitsPerPixel;
  private String brand;
  private String model;
  private String displayTechnology;
  private String[] connectorList;
  private int amountOfConnectors;
  private int currentAmountOfConnectors;


  //Override Product method
  @Override
  public double getPrice(){
    return this.price;
  }
  @Override
  public void setPrice(double newPrice){
    this.price = newPrice;
  }
  @Override
  public void visit(ProductVisitor visitor){
    visitor.visit(this);
  }
  @Override
  public String toString(){
    return "";
  }

  //Override energy consumer method
  @Override
  public double getVoltage(){
    return this.voltage;
  }
  @Override
  public double getCurrent(){
    return this.current;
  }
  @Override
  public double getYearlyEnergyUsage(){
    return this.getVoltage() * this.getCurrent() * 365 * 0.001;
  }

  //Override Display methods
  @Override
  public int getHorizontalResolution() {
    return this.horizontalResolution;
  }
  @Override
  public int getVerticalResolution() {
    return this.verticalResolution;
  }
  @Override
  public int getRefreshRate() {
    return this.refreshRate;
  }
  @Override
  public int getBitsPerPixel() {
    return this.bitsPerPixel;
  }
  @Override
  public String getBrand() {
    return this.brand;
  }
  @Override
  public String getModel() {
    return this.model;
  }
  @Override
  public String getDisplayTechnology() {
    return this.displayTechnology;
  }
  @Override
  public int getConnectorCount(String type) {
    int count = 0;
    for(String connector : this.connectorList){
      if (connector.equals(type)){
        count+=1;
      }
    }
    return count;
  }

  private Tv(Builder tvBuilder){
    this.horizontalResolution = tvBuilder.horizontalResolution;
    this.verticalResolution = tvBuilder.verticalResolution;
    this.price = tvBuilder.price;
    this.voltage = tvBuilder.voltage;
    this.current = tvBuilder.current;
    this.refreshRate = tvBuilder.refreshRate;
    this.bitsPerPixel = tvBuilder.bitsPerPixel;
    this.brand = tvBuilder.brand;
    this.model = tvBuilder.model;
    this.displayTechnology = tvBuilder.displayTechnology;
    this.amountOfConnectors = tvBuilder.amountOfConnectors;
    this.connectorList = tvBuilder.connectorList;
    this.currentAmountOfConnectors = tvBuilder.currentAmountOfConnectors;
  }

  public static class Builder{
    //Required fields
    private int horizontalResolution;
    private int verticalResolution;

    private double price = 50;
    private double voltage = 240;
    private double current = 2;
    private int refreshRate = 60;
    private int bitsPerPixel = 150;
    private String brand = "Samsung";
    private String model = "LI203";
    private String displayTechnology = "LCD";
    private int amountOfConnectors = 3;
    private String[] connectorList = new String[this.amountOfConnectors];
    private int currentAmountOfConnectors;

    public Builder(int horizontalResolution, int verticalResolution){
      this.horizontalResolution = horizontalResolution;
      this.verticalResolution = verticalResolution;
    }

    public Builder setHorizontalResolution(int newRes){
      this.horizontalResolution = newRes;
      return this;
    }
    public Builder setVerticalResolution(int newRes){
      this.verticalResolution = newRes;
      return this;
    }
    public Builder setPrice(double price){
      this.price = price;
      return this;
    }
    public Builder setVoltage(double voltage){
      this.voltage = voltage;
      return this;
    }
    public Builder setCurrent(double current){
      this.current = current;
      return this;
    }
    public Builder setRefreshRate(int refreshRate){
      this.refreshRate = refreshRate;
      return this;
    }
    public Builder setBitsPerPixel(int bitsPerPixel){
      this.bitsPerPixel = bitsPerPixel;
      return this;
    }
    public Builder setBrand(String brand){
      this.brand = brand;
      return this;
    }
    public Builder setModel(String model){
      this.model = model;
      return this;
    }
    public Builder setDisplayTechnology(String displayTechnology){
      this.displayTechnology = displayTechnology;
      return this;
    }
    public Builder setAmountOfConnector(int amount){
      this.amountOfConnectors = amount;
      this.connectorList = new String[amount];
      this.currentAmountOfConnectors = 0;
      return this;
    }
    public Builder addSingleConnector(String connector){
      this.connectorList[this.currentAmountOfConnectors] = connector;
      this.currentAmountOfConnectors += 1;
      return this;
    }

    public Tv build(){
      return new Tv(this);
    }
  }
}

package factory;

public interface EnergyConsumer {

  public double getVoltage();
  public double getCurrent();

  default double getYearlyEnergyUsage(){
      double powerConsumption;
      powerConsumption = this.getVoltage() * this.getCurrent() * 24 * 365 * 0.001;

      return powerConsumption;
  };
}
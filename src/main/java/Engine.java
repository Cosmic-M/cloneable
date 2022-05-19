public class Engine implements Cloneable{
  private double power;
  private double value;
  private String fuel;
  private String modification;
  private int year;

  public Engine() {
  }

  @Override
  public  Engine clone() {
    try {
      return (Engine) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException("Cannot create Engine clone: " + e);
    }
  }

  public double getPower() {
    return power;
  }

  public void setPower(double power) {
    this.power = power;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public String getFuel() {
    return fuel;
  }

  public void setFuel(String fuel) {
    this.fuel = fuel;
  }

  public String getModification() {
    return modification;
  }

  public void setModification(String modification) {
    this.modification = modification;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
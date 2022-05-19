public class Car implements Cloneable{
  private Engine engine;
  private String color;
  private String type;
  private String model;
  private int countOfDoors;

  public Car() {
  }

  @Override
  public Car clone() {
    try {
      Car cloneCar = (Car) super.clone();
      cloneCar.setEngine(engine.clone());
      return cloneCar;
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException("Cannot create Car clone: " + e);
    }
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getCountOfDoors() {
    return countOfDoors;
  }

  public void setCountOfDoors(int countOfDoors) {
    this.countOfDoors = countOfDoors;
  }
}
class Monitor {
  private String make;
  private String model;
  private int price;

  public Monitor(String make, String model, int price) {
    setMake(make);
  }

  public String getMake() {
    return this.make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}

class Car {
  private String make;
  private boolean forSale;
  private int vin;

  public Car(String make, boolean forSale, int vin) {
    setMake(make);
    setForSale(forSale);
    setVin(vin);
  }

  public Car(String make, int vin) {
    setMake(make);
    this.forSale = true;
    setVin(vin);
  }

  public Car(String make) {
    setMake(make);
    this.forSale = false;
  }

  public String getMake() {
    return this.make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public boolean isForSale() {
    return forSale;
  }

  public void setForSale(boolean forSale) {
    this.forSale = forSale;
  }

  public int getVin() {
    return this.vin;
  }

  public void setVin(int vin) {
    this.vin = vin;
  }
}

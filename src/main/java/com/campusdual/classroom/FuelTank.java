package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.getActualFuel() + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }

  public int setActualFuel(int fuel) {
    if (0 < fuel)
      this.actualFuel = fuel;
    return this.getActualFuel();
  }

}

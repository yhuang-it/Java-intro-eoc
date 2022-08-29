package com.car;

public class Car {  
  private String color;
  private int year;
  private int speed = 0;
  private int maxSpeed;
  private boolean isElectric;

  public Car(String color, int year, int maxSpeed) {
    this.color = color;
    this.year = year;
    this.maxSpeed = maxSpeed;
  }

  public String getColor() {
    return color;
  }
  public int getYear() {
    return year;
  }
  public int getSpeed() {    
    return speed;
  }
  public int getMaxSpeed() {
    return maxSpeed;
  }
  public boolean getIsElectric() {
    return isElectric;
  }

  public void setColor(String color) {
    this.color = color;
  }
  public void setYear(int year) {
    this.year = year;
  }
  public void setSpeed(int speed) {
    if (speed >= 0) {
      this.speed = speed;
    } else {
      System.out.println("Speed must be non-negative");
    }
  }
  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }
  public void setIsElectric(boolean isElectric) {
    this.isElectric = isElectric;
  }

  public void accelerateSpeed() {
    speed += 5;
    if (speed > maxSpeed) {
      speed = maxSpeed;
    }

    // max speed = 50
    // speed = 47
    // if (speed < maxSpeed) {
    //   if (speed + 5 < maxSpeed) {
    //     speed += 5;
    //   } else {
    //     speed = maxSpeed;
    //   }
    // }
  }

  public void decelerateSpeed() {
    speed -= 5;
    if (speed < 0) {
      speed = 0;
    }

    // if (speed > 0) {
    //   if (speed - 5 > 0) {
    //     speed -= 5;
    //   } else {
    //     speed = 0;
    //   }
    // }
  }

  public void convertToElectric() {
    if (isElectric) {
      System.out.println("The car is alread electric");
    } else {
      isElectric = true;
    }
  }

}

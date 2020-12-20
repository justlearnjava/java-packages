/*
 *    Copyright 2020 Just Learn Java
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.example.packages;

import com.example.packages.elevator.Car;

/**
 * Represents a passenger in elevator-type Cars.
 */
public class ElevatorPassenger {
  /**
   * The main method that drives the program.
   */
  public static void main(final String[] args) {
    ElevatorPassenger elevatorPassenger = new ElevatorPassenger();
    // Instantiate and print info about an elevator Car
    elevatorPassenger.instantiateElevatorCar();
  }

  /**
   * Instantiate and then print out info about a elevator-type Car
   */
  private void instantiateElevatorCar() {
    var car = new Car();
    car.manufacturerName = "Otis";
    car.maximumOccupancy = 12;
    car.weightLimitKilos = 1000;

    System.out.println("I'm a passenger in an elevator car: " + car);
  }
}

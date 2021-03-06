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

import com.example.packages.vehicle.Car;

/**
 * Represents a passenger in vehicle-type Cars.
 */
public class VehiclePassenger {
  /**
   * The main method that drives the program.
   */
  public static void main(final String[] args) {
    VehiclePassenger passenger = new VehiclePassenger();
    // Instantiate and print info about a vehicle Car
    passenger.instantiateVehicleCar();
  }

  /**
   * Instantiate and then print out info about a vehicle-type Car
   */
  private void instantiateVehicleCar() {
    Car car = new Car();
    car.make = "Toyota";
    car.model = "Camry";
    car.year = 2017;
    car.numberOfDoors = 4;
    car.hasSunroof = false;

    System.out.println("I'm a passenger in a vehicular car: " + car);
  }
}

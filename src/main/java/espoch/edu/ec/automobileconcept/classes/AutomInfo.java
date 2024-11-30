/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.automobileconcept.classes;

import espoch.edu.ec.automobileconcept.classes.Ennumerations.AutomobileType;
import espoch.edu.ec.automobileconcept.classes.Ennumerations.Coulor;
import espoch.edu.ec.automobileconcept.classes.Ennumerations.FuelType;

/**
 *
 * @author sahid
 */
public class AutomInfo {

    private String brand;
    private String model;
    private String engine;
    private int doorsNum;
    private int seatsNum;
    private double currentV;
    private double maxV;
    private FuelType fuelType;
    private AutomobileType automobileType;
    private Coulor coulor;

    public Coulor getCoulor() {
        return coulor;
    }

    public void setCoulor(Coulor coulor) {
        this.coulor = coulor;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public AutomobileType getAutomobileType() {
        return automobileType;
    }

    public void setAutomobileType(AutomobileType automobileType) {
        this.automobileType = automobileType;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoorsNum() {
        return doorsNum;
    }

    public void setDoorsNum(int doorsNum) {
        this.doorsNum = doorsNum;
    }
    
     public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }

    public double getCurrentV() {
        return currentV;
    }

    public void setCurrentV(double currentV) {
        this.currentV = currentV;
    }

    public double getMaxV() {
        return maxV;
    }

    public void setMaxV(double maxV) {
        this.maxV = maxV;
    }
    
    public void printValues() {
        System.out.println("Informacion del Automovil");
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Motor: "+ engine);
        System.out.println("Tipo de Combustible: " + FuelType.GASOLINA);
        System.out.println("Tipo de Automovil: " + AutomobileType.CIUDAD);
        System.out.println("Número de Puertas: " + doorsNum);
        System.out.println("Cantidad de Asientos: " + seatsNum);
        System.out.println("Velocidad Máxima: " + maxV + " km/h");
        System.out.println("Color: " + Coulor.NEGRO);
        System.out.println("Velocidad Actual: " + currentV + " km/h");
    }
    
     public void accelerate(double increment1) {
        
        if (currentV + increment1 > maxV) {
            System.out.println("Haz sobrepasado el limite maximo de velocidad: " + maxV + " km/h.");
        } else {
            currentV += increment1;
            System.out.println("Acelerando... Velocidad actual: " + currentV + " km/h.");
        }
    }

    public void decelerate(double decrement) {
        
        if (currentV - decrement < 0) {
            System.out.println("No es posible desacelerar mas");
        } else {
            currentV -= decrement;
            System.out.println("Desacelerando... Velocidad actual: " + currentV + " km/h.");
        }
    }
    
    
      
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.automobileconcept.classes;

/**
 *
 * @author sahid
 */
public class AutomobileInfo {
    private String brand;
    private String model;
    private String engine;
    private int doorNum;
    private double currentV;
    private double maxV;
    
    public class main {
        public void main(String[] args){
            
             AutomobileInfo objAutomInfo = new AutomobileInfo();
            
            objAutomInfo.setBrand("Mazda");
            objAutomInfo.setModel("mazda");
            
            
            
            
        }
        
        
        
        
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

    public int getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
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

    

    
    
 
        
    

}

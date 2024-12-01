/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espoch.edu.ec.automobile;

import espoch.edu.ec.automobileconcept.classes.AutomInfo;
import java.util.Scanner;

/**
 *
 * @author sahid
 */
public class Automobile {

    public static void main(String[] args) {
                
        AutomInfo objAutomInfo= new AutomInfo();
        objAutomInfo.setBrand("Audi");
        objAutomInfo.setModel("RS6 Avant Mansory/MTM edition");
        objAutomInfo.setEngine("4.0 litros V8 biturbo");
        objAutomInfo.setDoorsNum(5);
        objAutomInfo.setSeatsNum(5);
        objAutomInfo.setMaxV(330);
        objAutomInfo.setCurrentV(100);
        objAutomInfo.setDistance(623);
        
        objAutomInfo.printValues();
        
        objAutomInfo.estimatedTime();
        
        System.out.print("Acelerando: ");
        double increment1 = 20;
        objAutomInfo.accelerate(increment1);
        
                    
        System.out.print("Desacelerando: ");
        double decrement = 50;
        objAutomInfo.decelerate(decrement);
        
        objAutomInfo.brake();
        
      
        
       
        
        
            
        
      
    }
}

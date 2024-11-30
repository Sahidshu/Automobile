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
        
         Scanner scanner = new Scanner(System.in);
        
        AutomInfo objAutomInfo= new AutomInfo();
        objAutomInfo.setBrand("Audi");
        objAutomInfo.setModel("RS6 Avant Mansory/MTM edition");
        objAutomInfo.setEngine("4.0 litros V8 biturbo");
        objAutomInfo.setDoorsNum(5);
        objAutomInfo.setSeatsNum(5);
        objAutomInfo.setMaxV(330);
        
        objAutomInfo.printValues();
        
        System.out.print("Acelerando: ");
        double increment1 = scanner.nextDouble();
        objAutomInfo.accelerate(increment1);
                    
        System.out.print("Desacelerando: ");
        double decrement = scanner.nextDouble();
        objAutomInfo.decelerate(decrement);
        
       
        
        
            
        
      
    }
}

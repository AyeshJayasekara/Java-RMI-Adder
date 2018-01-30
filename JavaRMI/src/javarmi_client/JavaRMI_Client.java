/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi_client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ayeshjayasekara1
 */
public class JavaRMI_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        
    try {  
         Registry registry = LocateRegistry.getRegistry("127.0.0.1",2015); //default null on port 1099
         Adder stub = (Adder) registry.lookup("Adder"); 
         System.out.println(""+stub.add(1,5));
         
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
      } 
    }
}

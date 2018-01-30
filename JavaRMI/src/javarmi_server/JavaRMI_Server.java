/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarmi_server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ayeshjayasekara1
 */
public class JavaRMI_Server {
    public static void main(String args[]){  
    try { 
         // Instantiating the implementation class 
         AdderRemote obj = new AdderRemote(); 
         Registry registry = LocateRegistry.createRegistry(2015);
         registry.bind("Adder",obj);  
         System.out.println("Service Started.");
      } 
    catch(RemoteException e){
        System.out.println("Something want wrong with IP or Ports?");
    }
    catch (Exception e) { 
         System.err.println("Server exception: " + e.toString()); 
      }
    }
}
    
    
    
    
    
    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

*/



package networking.chapter2;
import java.net.*;
/**
 *
 * @author hariom
 */
public class printip {
 public static void main(String[] args){
     try{
         InetAddress address=InetAddress.getByName("www.google.com");
         System.out.println(address);
         
     }
     catch (UnknownHostException ex) {
         System.out.println("Could not find www.google.com");
     }
 }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagireddy_lab01objects;
import java.util.Random;


/**
 *
 * @author S545498
 */
public class Nagireddy_Lab01Objects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String string1="  welcome    ";
    String string2=" to ";
    String string3="  the first    ";
    String string4="Lab Activity ";
    String string5=" in the   ";
    String string6=" OOP Course ";
    String S =string1.concat(string2+string3+string4+string5+string6);
    System.out.println(S);
    int s2 =S.length();
    System.out.println("The length of the concatenated string is :"+s2);
    String S3="Welcome to the first Lab Activity in the OOP Course!";
    System.out.println(S3);
    int S4=S3.length();
    System.out.println("Length of the above string is:"+S4);
    System.out.println("Retrieved:"+string4);
    System.out.println("Index of first I in 'LAB ACTIVITY' is at:"+string4.indexOf('i'));
    String S5="lab interesting activites are activites lab Interesting Lab Activites Are Interesting Lab activites Lab activites";
    String S6="Interesting";
    int S7=S5.indexOf(S6);
    System.out.println("First occurrence of Interesting is at:"+S7);
    String S8="Object-Oriented-Programming 44542";
    System.out.println(S8);
    String A1=S8.replaceAll("-","_");
    System.out.println(A1);
    String A2="Computer";
    String A3="Science";
    System.out.println("The ID is:"+A2.substring(0, 4)+A3.substring(0, 3).toUpperCase()+A2.length()+A3.length());
    System.out.println("I aspire to be a AWS developer to reach my goals and for upskilling my career Applied computer science course will emphasizes computer science theories and skills in a work setting to drive business decisions and operations ");
    
    //math class
    
    System.out.println("******** Math Class ********");
    
   int value1=9;
   int value2=13;
   double A6=Math.sqrt(value1)+Math.sqrt(value2);
   System.out.println("sqrt (value12 +value22) :"+ A6);
   System.out.println("exp(9)     = " + Math.exp(value1));
    System.out.println("sec (9)    = " +1/Math.cos(value1));
   int mynumber=27;
   System.out.println("Math.cbrt(x) :"+Math.cbrt(mynumber));
   System.out.println("Logarithm value is:"+Math.log(mynumber));
   double b= Math.tan(60);
   double b1=Math.tan(45);
   System.out.println("tan 60° - tan 45° / (1 + tan 60° tan 45°) = "+ (b-b1)/(1+b*b1));
   System.out.println("Theoretical value of tan (90) is:"+Math.tan(90));
    System.out.println("Cubic root of modulus value of tan (90) is:"+Math.cbrt(Math.abs(Math.tan(90))));
    double A7=1/Math.sin(30);
    double A8=1/Math.cos(30);
    System.out.println("Cosecant of 30 is:"+A7);
        System.out.println("Secant of 30 is:"+A8);
        System.out.println("Minimum value in Cosec (30) and Sec (30) is:"+Math.min(A7,A8));
        System.out.println("Maximum value in Cosec (30) and Sec (30) is:"+Math.max(A7,A8));
        
        int mynumber1=45;
        int mynumber2=27;
        System.out.println("Rounded Value of cos 45 :"+ Math.round(Math.cos(mynumber1)));
        System.out.println("Rounded Value of cos 27 :"+ Math.round(Math.cos(mynumber2)));
        System.out.println("Rounded Value of tan 45 :"+ Math.round(Math.tan(mynumber1)));
        System.out.println("Rounded Value of tan 27 :"+ Math.round(Math.tan(mynumber2)));
        double m1=  Math.abs(8*Math.cos(mynumber2));
        double m2=  Math.pow(Math.pow(7, 4)+(8*6*7*5),(double)1/4);
        double m3= Math.pow(Math.pow(5,2)- Math.pow(3,2),(double)1/8);
        double m4= (m1*m2)/m3;
        System.out.println("output"+m4);
        
       
         
         // Random Class
         
          Random c = new Random();
          int d =c.nextInt(200);
          System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)"+"first :"+(int)Math.pow(d,2));
          int e =c.nextInt(200);
          System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)"+"second :"+(int)Math.pow(e,2));
          int f =c.nextInt(200);
          System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)"+"Third :"+(int)Math.pow(f,2));
          int g =c.nextInt(200);
          System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)"+"forth :"+(int)Math.pow(g,2));
          System.out.println("no i didn't get the same results ");
          Random h = new Random(30);
          int i =c.nextInt(200);
          System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)"+"first :"+(int)Math.pow(i,2));
          int j =c.nextInt(200);
          System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)"+"second :"+(int)Math.pow(j,2));
          int k =c.nextInt(200);
          System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)"+"Third :"+(int)Math.pow(k,2));
          int l =c.nextInt(200);
          System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)"+"forth :"+(int)Math.pow(l,2));
          int o =c.nextInt();
          System.out.println("Fifth random integer value is :"+o);
          int q =c.nextInt();
          System.out.println("Sixth random integer value is :"+q);
          int w =c.nextInt();
          System.out.println("Seventh random integer value is :"+w);
          
          
          System.out.println("i got different results for every execution");
          System.out.println("----------------------------------------");
          
          
          
          
          
          
          
          
          
         
         
         
         
         
         
        
        
        
      
        
    
    
    
   
   
   
   
   
   
    
    
    
    
            
    
    
    
    
    
        
    }
    
}

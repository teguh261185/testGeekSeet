/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testgeekseet;

import java.util.Scanner;
import java.util.stream.IntStream;


/**
 *
 * @author somadun
 */
public class TestGeekseet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner show = new Scanner(System.in);
       System.out.println ("count of person");
       int count=show.nextInt();
       
       int age[]=new int[count];
       int year[]= new int[count];
       int calc[] = new int [count];
       int killed[] = new int [count];
       int j=0;
       for (int i=0; i<count; i++){
           j=j+1;
           System.out.println("person "+j);
           System.out.print("age of death ");
           age[i] = show.nextInt();
           System.out.print("Year of death ");
           year[i] = show.nextInt();
           calc[i] = year[i] - age[i];
           killed[i]=fibonacClass1.fibonacClass(calc[i]);   
       }
       
       for (int i=0; i<count; i++){
            System.out.println("person "+(i+1)+" born on year ="+year[i]+" - "+age[i]+" = "+calc[i]+", number of people killed on year "+ calc[i] +" is "+ killed[i]);
            
       }
       
       long sum=0;
        for (int i = 0; i < count; i++) {
            sum= sum+killed[i];
        }
        System.out.println("So the average is "+((float)(sum)/count));
    }

    private static class fibonacClass1 {

        public static int fibonacClass(int a) {
            
        try{
                int n = a;//show.nextInt();
                long fib[] = new long[n];

                fib[0] = 1;
                fib[1] = 1;

                for(int i = 2; i < n; i++) {
                    fib[i] = fib[i-1] + fib[i-2];
                }

                //for (int i = 0; i < n; i++) {
                    //System.out.print(fib[i] +  " ");
                //}
                long sum=0;
                for (int i = 0; i < n; i++) {
                    sum= sum+fib[i];
                }
                return (int) sum;
           }catch(Exception e){
               return -1;
           }
        }
    }
    
}

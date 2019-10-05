/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author Ar
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {  
        int arr[] ={3,60,35,2,45,320,5};  
                 
            System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                    System.out.print(arr[i] + " ");  
                }
                    System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                    System.out.print(arr[i] + " ");  
                }
    }
}

 package assignment2;

import java.util.Arrays;
import java.util.Random;
 import java.util.Scanner;

public class Tamrin2 {

    

    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number for rows:");
        int row=input.nextInt();
        
        System.out.println("enter the number for colums:");
        int colum=input.nextInt();
      
        Random rand=new Random();
        int array[][]=new int[row][colum];
        for (int i=0;i<row;i++) {
            for (int j=0;j<colum;j++) {
                array[i][j]=rand.nextInt(100);
                System.out.print(array[i][j]+" ");
            }
           System.out.println();
        }
        
        
        System.out.println("enter the number of row you want to sort:");
        int r=input.nextInt();
        for (int i = 0; i < colum -1 ; i++) {
            for(int j=0; j < colum-1 ; j++){
             
                     if(array[r][j]>array[r][j+1]){
                    int temp=array[r][j];
                    array[r][j]=array[r][j+1];
                    array[r][j+1]=temp;
                                  
                  } 
                } 
            }
        
        for (int i=0;i<row;i++) {
            for (int j=0;j<colum;j++) {
              
                System.out.print(array[i][j]+" ");
            }
           System.out.println();
        }
        
        
        System.out.println("enter the number of colum you want to sort:");
        int c=input.nextInt();
        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j < row-1; j++) {
                
                if(array[i][c]>array[i+1][c]){
                    int temp=array[i][c];
                    array[i][c]=array[i+1][c];
                    array[i+1][c]=temp;
                    System.out.println(array[j][c]+"  ");
                }
            }
            
        }
      
         for (int i=0;i<row;i++) {
            for (int j=0;j<colum;j++) {
              
                System.out.print(array[i][j]+" ");
            }
           System.out.println();
        }
        }
     
    
}

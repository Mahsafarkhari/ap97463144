

import java.util.Scanner;
public class Tamrin1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter n:");
        int n=input.nextInt();
        
        int [] array=new int [n];
        int [] b=new int [n-1];
         array[0]=1;
         array[1]=1;
        
        System.out.println(array[0]);
        System.out.println(array[1]);
        for(int i=2;i<n;i++)
        {
           
            array[2]=array[1]+array[0];
            array[0]=array[1];
            array[1]=array[2];
            
            if(i%10==0)
            {   
               System.out.println("a["+i+"]="+array[2]);
                         
            }
           System.out.println(array[2]);
           }
       /* int i=0;
        while(i<n-1)
        {
            b[i]=array[i];
            i++;
        }
        for(int j=0;j<array.length;j++)
        {
            System.out.println(array[j]);
        }*/
    }        
}

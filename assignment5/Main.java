
package assignment5;

public class Main {
    public static void main(String[] args){
    
    Long starttime=System.currentTimeMillis();
    float f,min=0,max=0;
    float i;
    float j;
    
    
    for(i=0;i<=999;i++)
    {
        for(j=0;j<=999;j++)
        {
            f=(float)((Math.abs(i*j+j*j))/(i*Math.sin(i+j)+j*Math(i+j)));
            if(f>max)
            {
                max=f;
            }
            if(f<min)
            {
                min=f;
            }
        }
        
        
    }
    System.out.format("the max is %f\n",max);
    System.out.format("the min is %f\n",min);
    System.out.println((System.currentTimeMillis()-starttime)+"ms");
    
    }
}

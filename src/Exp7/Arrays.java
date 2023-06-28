package Exp7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shail
 */
public class Arrays {
    
    
    public static int max(int[] array){
        
        int m = array[0];
        for(int i=0;i<array.length;i++)
            if(m<array[i])
                m=array[i];
        return m;
        
    }
    
    public static int[] generateAP(int a,int d, int n){
        
        int seq[] =new int[n];
        seq[0] = a;
        for(int i=1;i<n;i++)
        {
            seq[i]=seq[i-1]+d;
        }
        return seq;
        
    }
    
    
    
    public static void main(String[] args) {
        
        int a[] = new int[5];
        int[] b = new int[5];
        int []c = new int[5];  
        
        for(int i=0;i<5;i++)
        {
            a[i]=i;
            b[i]=2*i;
            c[i]=a[i]+b[i];
        }
        
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]);
        }
        
        System.out.println(Arrays.max(b));
        
        c = Arrays.generateAP(2,7,10);
        
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");
        
    }
    
}

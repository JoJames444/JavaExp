/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp7;

import java.util.Random;

/**
 *
 * @author shail
 */



class Box{
    int l,b,h;

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public int getVolume()
    {
        return this.l*this.b*this.h;
    }
}

public class ObjecArray {
    
    public static void main(String[] args) {
        
        Random random = new Random(); 
        Box[] boxes = new Box[10];
        for(int i=0;i<10;i++)
            boxes[i] = new Box(random.nextInt(),random.nextInt(),random.nextInt());
        
        int max_vol=-1;
        int max_idx = -1;
        for(int i=0;i<10;i++){
            if(max_vol<boxes[i].getVolume()){
                
                max_vol = boxes[i].getVolume();
                max_idx = i;
            }
        }
        
        System.out.println("Max volume is for Box No :"+max_idx+"with volume : "+max_vol);
   
    }
    
}

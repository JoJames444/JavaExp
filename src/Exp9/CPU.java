/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp9;

/**
 *
 * @author shail
 */
public class CPU {
    
    double price;
    class Processor{
        
        
        int no_cores;
        String manufacturer;

        public Processor(int no_cores, String manufacturer) {
            this.no_cores = no_cores;
            this.manufacturer = manufacturer;
        }
        
        double getCache(){
            return 3.5;
        }
    }
    class RAM{
        
        int memory_size;
        String manufacturer;

        public RAM(int memory_size, String manufacturer) {
            this.memory_size = memory_size;
            this.manufacturer = manufacturer;
        }
        
        double getSpeed()
        {
            return 5.5;
        }
    }
    
}

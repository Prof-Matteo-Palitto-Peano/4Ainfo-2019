/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingconflicts;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matteo
 */

class inc1000 extends Thread {
    static int cnt = 0;
    
    synchronized void inc1() {
        cnt = cnt + 1;
    }
    
    public void run() {
        for(int n =0; n<1000; n++) {
            inc1();
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(inc1000.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

public class MultiThreadingConflicts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        inc1000 t1 = new inc1000();
        inc1000 t2 = new inc1000();
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println(inc1000.cnt);
    }
    
}

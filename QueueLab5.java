/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuelab5;
import structures.EpicQueue;

/**
 *
 * @author avecaschilling
 */
public class QueueLab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EpicQueue q = new EpicQueue();
        
        q.enqueue(8);
        q.enqueue(89);
        Integer result = q.dequeue();
        System.out.println("result: "+ result);
        q.enqueue(77);
        System.out.println("The queue is: "+q);
        q.enqueue(3);
        q.enqueue(21);
        q.enqueue(12);
        
        // should be 89,77,3,21,12
        System.out.println(q);
        
        q.dequeue();
        System.out.println(q);
        // is it what you think it should be?
        
        //shouldn't crash your program
        for (int i = 0; i<9;i++){
            System.out.println(q.dequeue());
        }
        
        // Should be empty
        System.out.println(q);
       
        
    }
    
}

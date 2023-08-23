package structures;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The EpicQueue implements queue functionality using an ArrayList as an 
 * underlying data structure.
 * 
 * Ann Marie V Schilling
 * @author avecaschilling
 * 
 * CS174 - Object Oriented Programming
 * Ursinus College - Go Bears!
 */
public class EpicQueue {
    
    private ArrayList<Integer> _queue = new ArrayList<Integer>();
    
    /**
     * Inserts the integer at the end of the queue
     * 
     * @param i value to insert
     */
    public void enqueue(Integer i){
        _queue.add(i);
    }
    
    /**
     * Removes the value at the front of the queue 
     * 
     * @return if queue is empty, returns null.  Otherwise returns value at 
     * front of the queue.
     * 
     */
    public Integer  dequeue(){
        Integer toReturn = null;
        if(!_queue.isEmpty()){
           toReturn = _queue.remove(0);
        }
        // THIS IS A DUMMY, be sure to assign toReturn a value
        return toReturn;
    }
    
    public String toString(){
        return _queue.toString();
    }
    
}

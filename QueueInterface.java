/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayque;

/**
 *
 * @author iraafh
 */
public interface QueueInterface {

    public void add(Object object);
    public Object first();
    public Object remove();
    public int size();
    public boolean isEmpty();
    
    
}

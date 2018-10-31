
package arrayque;


public class ArrayQueue implements QueueInterface {
    private Object[] a;
    private int front, back;
    
    public ArrayQueue(int capacity){
        a = new Object[capacity];
    }

    @Override
    public void add(Object object) {
        if (back == a.length) resize();
        a[back++] = object;
    }

    @Override
    public Object first() {
        if (size()==0)
            throw new IllegalStateException("queue is empty");
        return a[front];
    }

    @Override
    public Object remove() {
        if (size() == 0)
            throw new IllegalStateException("queue is empty");
        Object object=a[front];
        a[front++] = null;
        return object;
    }

    @Override
    public int size() {
        return back - front;
    }
private void resize() {
    Object[] aa = a;
    a = new Object[2*aa.length];
    System.arraycopy(aa, front, a, 0, size());
}
    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }
    
}

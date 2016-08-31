/*
* SOURCE CODE: QueueExample.java
* AUTHOR NAME: Kimberly Orozco
* GITHUB URL: [github.com/kimOrozco]
* LAST UPDATE: [08/09/2016]
*
 */
package queueexample;

public class QueueExample {
    
    private String[] storage;
    private int tail = 0;
    private int capacity = 0;
    
    public QueueExample(int capacity) {
        this.capacity = capacity;
        this.storage = new String[capacity];
    }

    public static void main(String[] args) {
        
        QueueExample queue = new QueueExample(10);
        System.out.println("STORAGE CAPACITY = " + "10" );
        System.out.println();
        
        queue.enqueue("one");
        queue.show();
        queue.enqueue("two");
        queue.show();
        queue.enqueue("three");
        queue.show();
        queue.enqueue("four");
        queue.show();
        queue.enqueue("five");
        queue.show();
        queue.enqueue("six");
        queue.show();
        queue.enqueue("seven");
        queue.show();
        queue.enqueue("eight");
        queue.show();
        queue.enqueue("nine");
        queue.show();
        queue.enqueue("ten");
        queue.show();
        queue.dequeue();
        queue.show();
        
    }
    
    public void show() {
      for (int i = this.capacity-1; i >= 0; i--) {
          System.out.println("Storage ["+ i + "] = " + this.storage[i]);
      }
      System.out.println();
    }
  
  private boolean isEmpty() {
    if (this.storage[0] == null) {
      System.out.println("Storage is empty");
      return true;
    } 
    return false;
  }

  private boolean isFull() {
    if (this.tail == this.capacity) {
      System.out.println("Storage is full");
      return true;
    } 
    return false;
  }
    
    public  void enqueue(String value){
        if (this.isFull()){
            System.out.println("The queue is full. Sorry we cant add anything anymore. Try to dequeue first.");
            return;
        }
        this.storage[tail++] = value;        
    }
    
    public void dequeue(){
        if (this.isEmpty()){
            System.out.println("The queue is empty. Sorry but we dont have anything to dequeue. Try to enqueue first.");
            return;
        }
        this.storage[0] = null;
        this.rearrange();
        this.tail--;
    }
    
    public void rearrange(){
        for (int i = 1; i < this.capacity; i++){
            String tmp = this.storage[i];
            this.storage[i-1] = tmp;
            this.storage[i] = null;
        }
    }
}

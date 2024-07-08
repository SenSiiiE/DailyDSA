public class CustomQueue {
    private final int [] queue;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;
//    private int rear = front;

    CustomQueue(){
        this.queue = new int[DEFAULT_SIZE];
    }

    CustomQueue(int size) {
        this.queue = new int[size];
    }

    public boolean isFull(){
        return end == queue.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }

    public boolean enqueue(int item) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full");
        }
        queue[end++] = item;
        return true;
    }

    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = queue[0];
        for (int i = 1; i < end; i++) {
            queue[i - 1] = queue[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty..");
        }
        return queue[0];
    }

    public void display(){
        for (int i = 0; i < end ; i++) {
            System.out.println(queue[i] + " ");
        }
    }
//    public void enqueue(int n){
//        if(isFull()){
//            System.out.println("Queue is full..");
//        } else {
//            if(front == -1){
//                front++;
//            }
//            rear++;
//            queue[rear] = n;
//            System.out.println("Inserted element is: "+ n);
//
//        }
//    }
//
//    public void dequeue(){
//        if(front == -1){
//            System.out.println("Queue is empty..");
//        }else{
//            if(rear == 0){
//                front--;
//            }
//            System.out.println("Dequeued element is: "+ queue[rear--]);
//        }
//    }
//
//    public void display(){
//        for (int i = front; i <= rear; i++) {
//            System.out.print(queue[i]+ " ");
//        }
//    }
//    public boolean isFull() {
//        return rear == DEFAULT_SIZE - 1;
//    }
//
//    public boolean isEmpty(){
//        return front == -1;
//    }

}

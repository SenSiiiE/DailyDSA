public class CircularQueue {
    protected int [] queue;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    CircularQueue(){
        this.queue = new int[DEFAULT_SIZE];
    }

    CircularQueue(int size) {
        this.queue = new int[size];
    }

    public boolean isFull(){
        return size == queue.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public boolean enqueue(int item) throws Exception {
        if(isFull()){
            throw new Exception("Queue is full");
        }
        queue[end++] = item;
        end = end % queue.length;
        size++;
        return true;
    }
}

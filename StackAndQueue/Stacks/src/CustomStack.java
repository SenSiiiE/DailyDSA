public class CustomStack {
    protected int[] stack;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
          this.stack = new int[size];
    }

    public boolean push(int item) throws StackException{
        if(isFull()){
            throw new StackException("Stack OverFlow...");
        }
        ptr++;
        stack[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack UnderFlow..");
        }
        return stack[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is Empty..");
        }
        return stack[ptr];
    }
    public boolean isFull() {
        return ptr == stack.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}

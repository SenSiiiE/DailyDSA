public class StackArray {
    private int[] stack;
    private int size = 0;
    private int count = 0;
    StackArray(){
        stack = new int[5];
        size = 5;
    }
    StackArray(int n){
        stack = new int[n];
        size = n;
    }

    public void insert(int num) {
        if (count < stack.length){
            stack[count] = num;
            count++;
        }else{
            int[] temp = new int[size];
            for (int i = 0; i < size; i++) {
                temp[i] = stack[i];
            }
            size = 2 * size;
            stack = temp;
        }
    }

    public void display(){
        for (int i = 0; i < count; i++) {
            System.out.println(stack[i]);
        }
    }

    public void peek(){
        System.out.println(stack[count - 1]);
    }
}

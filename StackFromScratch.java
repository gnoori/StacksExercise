import java.util.Arrays;

public class StackFromScratch {
    private int[] arr = new int[10];
    private int count=0;
    public void push(int item){
        if(count==arr.length)
            throw new StackOverflowError();
        arr[count] = item;
        count++;
    }
    public int pop(){
        if(count==0)
            throw new IllegalStateException();
        count--;
        return arr[count];
    }

    public int peek(){
        int l = count-1;
        if (l<0){
            throw new IllegalStateException();
        }
        return arr[l];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(arr, 0, count);
        return Arrays.toString(content);
    }


}

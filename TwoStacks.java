import java.util.Arrays;

public class TwoStacks {
    int arr[] = new int[10];
    int size = arr.length;
    int top1 = -1;
    int top2 = size;
    public void push1(int i){
        if(top1<top2-1){
            top1++;
            arr[top1] = i;
        }
        else{
            System.out.println("Stack is full");
        }
    }

    public void push2(int i){
        if(top1<top2-1){
            top2--;
            arr[top2] = i;
        }
        else{
            System.out.println("Stack is full");
        }
    }
     public int pop1(){
         System.out.println("Popping element from Stack1");
        int last = arr[top1];
        top1--;
        return last;
     }

     public int pop2(){
        System.out.println("Popping element from Stack2");
         int last = arr[top2];
         top2++;
         return last;
     }
    public void showStack2(){
        System.out.print("Stack1: ");
        for(int i = top2; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void showStack1(){
        System.out.print("Stack2: ");
        for(int i = top1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}


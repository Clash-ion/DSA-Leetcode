import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ImplementingStackUsingQueues
 */
public class ImplementingStackUsingQueues {

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        for (int i = 0; i < 6; i++) {
            obj.push(i);
        }
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
        System.out.println();
    }

    
}


class MyStack {

    Queue<Integer> queue1;    
    Queue<Integer> queue2;    

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if (queue1.isEmpty()) {
            queue1.add(x);
        }
        else{
            int q1s = queue1.size();
            for (int i = 0; i < q1s ; i++) {
                queue2.add(queue1.remove());
            }
            queue1.add(x);
            int q2s = queue2.size();
            for (int i = 0; i < q2s ; i++) {
                queue1.add(queue2.remove());
            }
        }
    }
    
    public int pop() {
        return queue1.remove();
    }
    
    public int top() {
        return queue1.peek();
    }
    
    public boolean empty() {
        System.out.println(Arrays.toString(queue1.toArray()));
        return queue1.isEmpty();
    }
}
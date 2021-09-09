import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class bj_10828 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringBuffer sb = new StringBuffer();
        List<Integer> stack = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String commend = br.readLine();
            if(commend.startsWith("push")) {
                String[] commends = commend.split(" ");
                push(stack, Integer.parseInt(commends[1]));
            } else if(commend.startsWith("pop")) {
                sb.append(pop(stack) + "\n");
            } else if(commend.startsWith("size")) {
                sb.append(size(stack) + "\n");
            } else if(commend.startsWith("empty")) {
                sb.append(empty(stack) + "\n");
            } else if(commend.startsWith("top")) {
                sb.append(top(stack) + "\n");
            }
        }
        System.out.println(sb.toString());
    }
    
    public static void push(List<Integer> stack, int num) {
        stack.add(num);
    }

    public static int pop(List<Integer> stack) {
        if(empty(stack) == 1) {
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    public static int size(List<Integer> stack) {
        return stack.size();
    }

    public static int empty(List<Integer> stack) {
        if(stack.isEmpty()) {
            return 1;
        }
        return 0;
    }
    
    public static int top(List<Integer> stack) {
        if(empty(stack) == 1) {
            return -1;
        }
        return stack.get(stack.size() - 1);
    }
}

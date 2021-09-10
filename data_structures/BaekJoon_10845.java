import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * [자료 구조] 백준 10845 큐
 */
public class BaekJoon_10845 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();
        List<Integer> queue = new LinkedList<>();
        for(int i=0; i<n; i++) {
            String commend = br.readLine();
            if(commend.startsWith("push")) {
                String[] commends = commend.split(" ");
                push(queue, Integer.parseInt(commends[1]));
            } else if(commend.startsWith("pop")) {
                sb.append(pop(queue) + "\n");
            } else if(commend.startsWith("size")) {
                sb.append(size(queue) + "\n");
            } else if(commend.startsWith("empty")) {
                sb.append(empty(queue) + "\n");
            } else if(commend.startsWith("front")) {
                sb.append(front(queue) + "\n");
            } else if(commend.startsWith("back")) {
                sb.append(back(queue) + "\n");
            }
        }
        System.out.println(sb.toString());
    }

    public static void push(List<Integer> queue, int num) {
        queue.add(num);
    }

    public static int pop(List<Integer> queue) {
        if(empty(queue) == 1) {
            return -1;
        }
        return queue.remove(0);
    }

    public static int size(List<Integer> queue) {
        return queue.size();
    }

    public static int empty(List<Integer> queue) {
        if(queue.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public static int front(List<Integer> queue) {
        if(empty(queue) == 1) {
            return -1;
        }
        return queue.get(0);
    }

    public static int back(List<Integer> queue) {
        if(empty(queue) == 1) {
            return -1;
        }
        return queue.get(queue.size()-1);
    }
}

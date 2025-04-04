// queue.offer(x); // 삽입
// queue.poll(); // 맨 앞 꺼내고 제거
// queue.peek(); // 맨 앞 확인만
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            String inputVal = br.readLine();
            int num = 0;

            String[] parts = inputVal.split(" ");
            String cmd = parts[0];

            switch (cmd) {
                case "push":
                    queue.offer(Integer.parseInt(parts[1]));
                    break;
                case "pop":
                    num = queue.isEmpty() ? -1 : queue.poll();
                    break;
                case "size":
                    num = queue.size();
                    break;
                case "empty":
                    num = queue.isEmpty() ? 1 : 0;
                    break;
                case "front":
                    num = queue.isEmpty() ? -1 : queue.peekFirst();
                    break;
                case "back":
                    num = queue.isEmpty() ? -1 : queue.peekLast();
                    break;
            }

            if(!cmd.equals("push")){
                System.out.println(num);
            }
        }

    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*

문제
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

*/

public class Main {

    static Stack<Integer> stack;
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        stack = new Stack<>();

        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()){
                case "push" : stack.push(Integer.parseInt(st.nextToken())); break;

                case "top" : sb.append(top()).append("\n"); break;

                case "size" : sb.append(stack.size()).append("\n"); break;

                case "pop" : sb.append(pop()).append("\n"); break;

                case "empty" : sb.append(empty()).append("\n"); break;

            }

        }

        System.out.println(sb);

    }

    private static int top(){
        if(stack.empty()){
            return -1;
        }
        return stack.peek();
    }

    private static int pop(){
        if(stack.empty()){
            return -1;
        }
        return stack.pop();

    }

    private static int empty(){
        if(stack.empty()){
            return 1;
        }
        return 0;

    }


}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*

push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.




 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> q = new LinkedList<>();

        for(int i=0; i<n; i++){


            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()){
                case "push" : q.add(Integer.parseInt(st.nextToken()));
                                break;


                case  "pop" : {
                                    Integer item = q.poll();
                                    if(item == null){
                                        sb.append("-1").append('\n');
                                    } else {
                                        sb.append(item).append('\n');
                                    }
                                    break;    
                                }

                case  "size" : sb.append(q.size()).append('\n');
                                break;

                case  "empty" : {
                                    if(q.isEmpty()){
                                        sb.append('1').append('\n');
                                    } else{
                                        sb.append('0').append('\n');
                                    }
                                    break;
                                  }
                case  "front" : {
                                    Integer a = q.peek();

                                    if(a != null){
                                        sb.append(a).append('\n');
                                    } else {
                                        sb.append("-1").append('\n');
                                    }
                                    break;
                                 }
                case  "back" : {
                                    Integer b = q.peekLast();
                                    if(b != null){
                                        sb.append(b).append('\n');
                                    } else {
                                        sb.append("-1").append('\n');
                                    }
                                    break;
                                }

            }


        }


        System.out.println(sb);
    }

}

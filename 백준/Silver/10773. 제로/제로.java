import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;


/*



 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();

        //입력받을 수
        int n = Integer.parseInt(br.readLine());


        for(int i=0; i<n; i++){

            int val = Integer.parseInt(br.readLine());

            if(val != 0){
                stack.push(val);
            }else {
                stack.pop();
            }
        }

        int sum = 0;

        for (int ans : stack){
            sum += ans;
        }

        System.out.println(sum);


    }

}



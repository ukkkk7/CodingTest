

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;


        while (true) {

                line = br.readLine();

                if (line.equals("."))
                    break;

               sb.append(solve(line)).append("\n");


        }

        System.out.println(sb);


    }

    public static String solve(String a){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<a.length(); i++){

            char c= a.charAt(i);


            if(c == '(' || c == '['){
                stack.push(c);
            } else if (c == ')') {
                if(stack.empty() || stack.peek() != '(')
                    return "no";
                else
                    stack.pop();
            } else if (c == ']') {
                if(stack.empty() || stack.peek() != '[')
                    return "no";
                else
                    stack.pop();
            }

        }

        if(stack.empty()){
            return "yes";
        } else{
            return "no";
        }


    }



}

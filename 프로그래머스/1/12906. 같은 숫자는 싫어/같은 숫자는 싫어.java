import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

//        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int[] answer;

  //      q.add(arr[0]);
        stack.add(arr[0]);
        for(int i=1; i<arr.length; i++){
           if (stack.peek() != arr[i]) {
   //            q.add(arr[i]);
               stack.push(arr[i]);
           }

        }


     //       answer = new int[q.size()];

        answer = new int[stack.size()];
//        for(int i=0; !q.isEmpty(); i++){
//
//            answer[i] = q.poll();
//        }

        for(int i=stack.size()-1; i>=0; i--){
            answer[i] = stack.pop();
        }


        return answer;

    }
}
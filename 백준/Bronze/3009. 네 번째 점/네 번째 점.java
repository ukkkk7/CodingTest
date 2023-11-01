import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] node1 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());

        int[] node2 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());

        int[] node3 = {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
        


        int x,y;


        if(node1[0] == node2[0]){
            x = node3[0];
        } else if (node1[0] == node3[0]) {
            x = node2[0];
        } else {
            x = node1[0];
        }

        if(node1[1] == node2[1]){
            y = node3[1];
        } else if (node1[1] == node3[1]) {
            y = node2[1];
        } else {
            y = node1[1];
        }


        System.out.println(x + " " + y);


    }

}
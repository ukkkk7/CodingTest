import java.util.*;

class Solution {
    
    public int solution(String[] friends, String[] gifts) {
    int answer = 0;
         int[][] giftGraph = new int[friends.length][friends.length];
         int[] giftDegree = new int[friends.length];
         Map<String, Integer> name = new HashMap<>();    
    
        for(int i=0; i<friends.length; i++){
            name.put(friends[i], i);
        }
        
        
        for(String gift : gifts){
            String[] giftName = gift.split(" ");
            giftDegree[name.get(giftName[0])]++;
            giftDegree[name.get(giftName[1])]--;
            giftGraph[name.get(giftName[0])][name.get(giftName[1])]++;
        }
        
        
        
        for(int i=0; i<friends.length; i++){
            int cnt = 0;
            for(int j=0; j<friends.length; j++){
                
                if(i==j) continue; 
                
                if(giftGraph[i][j] > giftGraph[j][i] || giftGraph[i][j] == giftGraph[j][i] && giftDegree[i] > giftDegree[j]){
                    cnt++;
                } 
                
                if(cnt > answer){
                    answer = cnt;
                }
                
            }
        }
        
        return answer;
        
        
        
    }
}
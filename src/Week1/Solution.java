package Week1;
import java.util.ArrayList;
public class Solution {
    public void sortLost(Lost[] lostArray){
        for(int i = 0;i < lostArray.length-1;i++){
            for(int j = 0;j < lostArray.length - i -1;j++){
                if(lostArray[j].getDate()>lostArray[j+1].getDate()){
                    Lost temp = lostArray[j];
                    lostArray[j] = lostArray[j+1];
                    lostArray[j+1] = temp;
                }
            }
        }
    }
    public Lost[] selectByKeyword(Lost[] lostArray,String keyword){
        ArrayList<Lost> temp = new ArrayList<>();
        for(int i = 0;i < lostArray.length;i++){
            if(lostArray[i].getGetPlace().equals(keyword)){
                temp.add(lostArray[i]);
            }
        }
        int i = temp.size();
        Lost[] outcome = (Lost[])temp.toArray(new Lost[i]);
        return outcome;
    }
}

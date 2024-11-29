import java.util.*;

public class mango
{
    
    
    
    public static ArrayList<Integer> sieve(int n){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            nums.add(i);
        }
        for(int i = 0; i < nums.size(); i++){
            int temp = nums.get(i);
            for(int j =i+1; j < nums.size();){
                if(nums.get(j)%temp == 0) nums.remove(j);
                else j++;
            }
            
        }
    
        return nums;
    
    }
    
    public static 
}


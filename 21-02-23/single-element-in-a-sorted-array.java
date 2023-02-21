/*
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10
 

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 105
*/


class Solution {
    public int singleNonDuplicate(int[] nums) {
        int c=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int d=nums[i];
            if(map.containsKey(d)){
                int val=map.get(d);
                map.put(d,val+1);
            }else{
                map.put(d,1);
            }
        }for(Map.Entry m : map.entrySet()){
            
            if((int)m.getValue()==1){
                return (int) (m.getKey());
            }    
   }return 0;        
        
    }
}

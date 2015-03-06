package yy.practice.leetcode;

import org.junit.Test;

public class TwoSum {
	
	@Test
	public void test(){
		int[] numbers = {-3,4,3,90};
	    int target=0;
	    twoSum(numbers,target);
	}
	
	
    public int[] twoSum(int[] numbers, int target) {
        
        int[] index = null;
        for(int i=0;i<numbers.length-1;i++){
            System.out.println("i="+i);
           
            for(int j=i+1;j<numbers.length;j++){
            	System.out.println("j="+j);
                System.out.print("numbers["+i+"]="+numbers[i]+", numbers["+j+"]="+numbers[j]);
               
                if(numbers[i]+numbers[j]==target){
                	index = new int[2];
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }

}

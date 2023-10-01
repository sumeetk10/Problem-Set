package Leetcode_Daily;

public class Aug8 {
    class Solution {
        public int search(int[] arr, int target) {
            
            int s = 0;
            int e = arr.length-1;
    
            // for every mid
            // if we check whether left is sorted or right is 
            // then we check if given target value exists in sorted array boundaries chekc in that part
            // else otherwise
            while(s<=e)
            {
                int mid = s+(e-s)/2;
                if(arr[mid] == target)
                {
                    return mid;
                }
                //left sorted
                if(arr[mid]>=arr[s])
                {
                    //target in sorted array?
                    if(target>=arr[s] && target<=arr[mid])
                    {
                        e = mid-1;
                    }
                    else
                    {
                        s = mid+1;
                    }
                }
                //right sorted
                else
                {
                    //target in sorted array?
                    if(target<=arr[e] && target>=arr[mid])
                    {
                        s = mid+1;
                    }
                    else
                    {
                        e = mid-1;
                    }
                }          
            }
            return -1;
        }
    }
    
    
}

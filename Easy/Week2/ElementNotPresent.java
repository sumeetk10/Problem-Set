public static List<Integer> findDisappearedNumbers(int[] nums)
{
    HashSet<Integer> set=new HashSet<>();
    ArrayList<Integer> list=new ArrayList<>();
    
    for(int i=0;i<nums.length;i++)
    {
        set.add(nums[i]);
    }
    for(int i=1;i<=nums.length;i++)
    {
        if(!set.contains(i))
            list.add(i);
    }
    return list;
}
```
//--------------------using Cyclic sort----------------------------------------
//-------------time comp: O(n)------------------------------------
//-------------space comp: O(1)---------------------------------------

```
public static List<Integer> findDisappearedNumbers(int[] nums) {
    
    ArrayList<Integer> list=new ArrayList<>();
    
    int i=0;
    while(i<nums.length)
    {
        int correctIndex=nums[i]-1;
        if(nums[i]!=nums[correctIndex])
            swap(nums,i,correctIndex);
        else
            i++;
    }
    for(int j=0;j<nums.length;j++)
    {
        if(nums[j]!=j+1)
            list.add(j+1);
    }
    return list;
    
}
 public static void swap(int arr[],int j,int m)
{
    int temp=arr[j];
    arr[j]=arr[m];
    arr[m]=temp;
}

}
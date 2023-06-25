package Week2;

public class CountPrime {
    class Solution {
    public int countPrimes(int n) {
        
     boolean[] isprime = new boolean[n];
     int count = 0;
        
        for(int i = 2; i*i<=n; i++){        //all the multiple are crossed present within range
            if(!isprime[i]){
                    for(int j = i*2; j<n; j+=i){
                        isprime[j] = true;
                    }
            }
        }
        for(int i=2;i<isprime.length;i++){
            if(!isprime[i]){
                count++;
            }
        }
        return count;
    }
}
}

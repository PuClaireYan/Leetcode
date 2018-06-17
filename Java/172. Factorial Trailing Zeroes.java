class Solution {
    public int trailingZeroes(int n) {
        int s = 1;
        int count = 0;
        for(int i=1; i<=n;i++){
            s = s * i;
        }
        for(int j=0; j<s.length();j-- ) {
            if (s.indexOf(j) == 0){
                count++;
            } else break;
        }  
        return count;
    }
}

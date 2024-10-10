class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;

        for(int i = 0; i < accounts.length; i++){
            int sumJ = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sumJ += accounts[i][j];
            }
            if(sumJ > ans){
                ans = sumJ;
            }

        }

        return ans;
        
    }
}
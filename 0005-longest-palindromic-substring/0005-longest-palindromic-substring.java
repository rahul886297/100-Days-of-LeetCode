class Solution {
    public static boolean checkpalindrom(String s){
        int left=0, right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int len=s.length();
        String longest="";
        for(int i=0; i<=len; i++){
            for(int j=i+1; j<=len; j++){
                String sub=s.substring(i, j);

                if(checkpalindrom(sub) && sub.length()>longest.length()){
                    longest=sub;
                }

            }
        }
        return longest;
        
    }
}
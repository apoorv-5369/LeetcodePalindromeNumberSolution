class Solution {
    public boolean isPalindrome(int x) {
        int count=0;
        String s=Integer.toString(x);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
            else if(s.charAt(0)=='-') return false;
            else count++;
        }
        if(count>=s.length()/2) return true;
        return false;
    }
}

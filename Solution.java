class Solution {
    public int minSwaps(String s) {
        int swap=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='[')
            swap++;
            else if(swap>0)
            swap--;
        }
        return (swap+1)/2;
    }
}

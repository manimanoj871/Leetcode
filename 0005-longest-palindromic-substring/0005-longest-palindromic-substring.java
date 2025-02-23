class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<1)
        return "";
        String lps="";
        for(int i=0;i<s.length();i++)
        {
            String odd=pln(s,i,i);
            if(odd.length()>lps.length())
            lps=odd;
            String even=pln(s,i,i+1);
            if(even.length()>lps.length())
            lps=even;
        }
        return lps;
    }
    public static String pln(String s,int l,int r)
    {
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r) )
        {
            l--;
            r++;
        }
        return s.substring(l+1,r);

    }
}
/*
Link : https://leetcode.com/problems/letter-case-permutation/description/
*/
class Solution {
    public List<String> letterCasePermutation(String s) {
StringBuilder sb=new StringBuilder(s);
List<String>al=new ArrayList<>();
        solve(0,sb,s.length(),al);
        return al;
    }
    public static void solve(int i,StringBuilder sb,int n,List<String>al){
        if(i==n){
            al.add(sb.toString());
            return ;

        }
        if(Character.isAlphabetic(sb.charAt(i))){
 sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
solve(i+1,sb,n,al);
 sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
solve(i+1,sb,n,al);

        }else
        {
            solve(i+1,sb,n,al);
        }

    }
}
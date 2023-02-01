/*
Link : https://leetcode.com/problems/remove-invalid-parentheses/description/
*/
class Solution {
    public List<String> removeInvalidParentheses(String s) {
            HashSet<String>hs=new HashSet<>();

        int minrem=minRemoval(s);
        List<String>ans=new LinkedList<>();
        remove(s,ans,minrem,hs);
        return ans;
    }
    public static void remove(String s,List<String>ans,int minrem,HashSet<String>hs)
    {       
        if(hs.contains(s))return;
        hs.add(s);
        
        if(minrem==0){
       
        int min=minRemoval(s);
        if(min==0 )
        {
            ans.add(s);
        }
        
        return;
    }
        
        for(int i=0;i<s.length();i++){
      StringBuilder str=new StringBuilder(s);
            str.deleteCharAt(i);        
        remove(str.toString(),ans,minrem-1,hs);
    }
        
    }
    public static int minRemoval(String s)
    {    Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
st.push(c);
            }else if(c==')')
            {
                if(st.size()>0&&st.peek()=='(')
                {
st.pop();
                }else
                {
st.push(')');
                }
            }
        }
    
    return st.size();}
}
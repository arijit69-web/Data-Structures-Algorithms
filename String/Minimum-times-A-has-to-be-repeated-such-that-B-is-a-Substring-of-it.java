/*
Link : https://leetcode.com/problems/repeated-string-match/description/
*/
class Solution {
    static int minRepeats(String A, String B) {
        StringBuilder ans= new StringBuilder("");
        int count=0;
while(ans.length()<=A.length()+B.length())
{
    ans.append(A);
    count++;
    if(ans.indexOf(B)!=-1)return count;
}
return -1;

    }
};
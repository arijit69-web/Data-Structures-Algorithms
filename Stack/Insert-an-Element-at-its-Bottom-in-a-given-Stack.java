/*
Link : https://www.codingninjas.com/codestudio/problems/insert-an-element-at-its-bottom-in-a-given-stack_1171166?leftPanelTab=1
*/
public class Solution {
    public static Stack<Integer> pushAtBottom(Stack<Integer> myStack, int x) {
        insert(myStack, x);
        return myStack;
    }

    public static void insert(Stack<Integer> myStack, int x) {
        if (myStack.size() == 0) {
            myStack.push(x);
            return;
        }
        int key = myStack.pop();
        insert(myStack, x);
        myStack.push(key);
    }
}

/*
Link : https://practice.geeksforgeeks.org/problems/sort-a-stack/1 
*/

class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        sortSolve(s);
        return s;
    }

    public static void sortSolve(Stack<Integer> s) {
        if (s.size() == 0)
            return;

        int temp = s.peek();
        s.pop();
        sortSolve(s);
        insert(temp, s);
    }

    public static void insert(int t, Stack<Integer> s) {
        if (s.size() == 0 || s.peek() <= t) {
            s.push(t);
            return;
        }
        int temp = s.peek();
        s.pop();
        insert(t, s);
        s.push(temp);
    }
}
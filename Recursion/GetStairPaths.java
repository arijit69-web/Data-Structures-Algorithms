/*
Link : https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-stair-paths-official/ojquestion
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n <= 0) {
            ArrayList<String> ans = new ArrayList<>();

            if (n == 0) {
                ans.add("");
            }

            return ans;
        }

        ArrayList<String> path1 = getStairPaths(n - 1);
        ArrayList<String> path2 = getStairPaths(n - 2);
        ArrayList<String> path3 = getStairPaths(n - 3);
        ArrayList<String> paths = new ArrayList<>();

        for (String str : path1) {
            paths.add("1" + str);
        }

        for (String str : path2) {
            paths.add("2" + str);
        }

        for (String str : path3) {
            paths.add("3" + str);
        }

        return paths;
    }

}
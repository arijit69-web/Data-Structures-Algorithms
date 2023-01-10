/*

Pattern 12:

Input: 5

Output:
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1

*/

class Solution 
{

    void printTriangle(int n) 
    {
  
      int sp = 4 * (n - 1);
  
      for (int i = 1; i <= n; i++) 
      {
        for (int j = 1; j <= i; j++)
        {
            System.out.print(j + " ");
        }
        for (int j = 1; j <= sp; j++) 
        {
            System.out.print(" ");
        }
        sp = sp - 4;
  
        for (int j = i; j >= 1; j--) 
        {
            System.out.print(j + " ");
        }
        System.out.println();
      }
    }
}


/*

Pattern 13:

Input: 5

Output:
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

*/

class Solution 
{

    void printTriangle(int n) 
    {
        int t=1;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(t+" ");
                t++;
            }
            System.out.println();
        }
        
    }
}

/*

Pattern 14:

Input: 5

Output:
A
AB
ABC
ABCD
ABCDE

*/

class Solution 
{
    void printTriangle(int n) 
    {
        int t=65;
        for(int i=0;i<n;i++)
        {
            t=65;
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)t);
                t++;
            }
            System.out.println();
        }

    }
}

/*
 
Pattern 15:

Input: 5

Output:
ABCDE
ABCD
ABC
AB
A

*/

class Solution 
{

    void printTriangle(int n) 
    {
        int t=65+n-1;
        
        for(int i=0;i<n;i++)
        {
            for(int j=65;j<=t-i;j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}

/*

Pattern 16:

Input: 5

Output:
A
BB
CCC
DDDD
EEEEE

*/

class Solution 
{
    void printTriangle(int n) 
    {
        int t=65;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)t);
            }
            t++;
            System.out.println();
        }
    }
}

/*

Pattern 17:

Input: 4

Output:
   A
  ABA
 ABCBA
ABCDCBA

*/

class Solution 
{
    void printTriangle(int n) 
    {
        for(int i=0;i<n;i++)
        {
            int c=65;
            for(int j=0;j<n-1-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)c);
                c++;
            }
            int y=c-2;
            for(int j=y;j>=65;j--)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}

/*

Pattern 18:

Input: 5

Output:
E
E D
E D C
E D C B
E D C B A
 
*/

class Solution
{
    void printTriangle(int n) 
    {
        int t=65+n-1;
        for(int i=0;i<n;i++)
        {
            t=65+n-1;
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)t+" ");
                t--;
            }
            
            System.out.println();
        }

    }
}

/*

Pattern 19:

Input: 5

Output:
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

*/

class Solution 
{
    void printTriangle(int n) 
    {
        int sp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<sp;j++)
            {
                System.out.print(" ");
            }
            sp=sp+2;
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sp=2*(n-1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<sp;j++)
            {
                System.out.print(" ");
            }
            sp=sp-2;
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

Pattern 20:

Input: 5

Output:
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/

class Solution 
{
    void printTriangle(int n) 
    {
        int sp=2*(n-1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<sp;j++)
            {
                System.out.print(" ");
            }
            sp=sp-2;
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sp=2;
        int st=n-1;
        for(int i=0;i<st;i++)
        {
            for(int j=0;j<st-i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<sp;j++)
            {
                System.out.print(" ");
            }
            sp=sp+2;
            for(int j=0;j<st-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

/*

Pattern 21:

Input: 4

Output:
****
*  *
*  *
****

*/

public class Solution 
{
    public static void getStarPattern(int n) {
        for(int i=0;i<n;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0||j==n-1)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        if(n!=1)
        {
            for(int i=0;i<n;i++)
            {
                System.out.print("*");
            }
        }
        System.out.println();   
    }
}

/*

Pattern 22:

Input: 4

Output:
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

*/

class Solution
{
    void printSquare(int n) 
    {
        int space=2*(n-1)-1;
        int key=n;
        int midKey=n;
        for(int i=0;i<n;i++)
        {
            key=n;
            for(int j=0;j<=i;j++)
            {
                System.out.print(key+" ");
                key--;                
            }

            for(int j=0;j<space;j++)
            {
                System.out.print(midKey+" ");                
            }

            midKey--;
            space=space-2;
            int lastKey=key+1;

             for(int j=0;j<=i;j++)
            {
                if(lastKey!=1)
                System.out.print(lastKey+" ");
                lastKey++;                
            }
            System.out.println();
        }
        space=1;
        key=n;
        midKey=2;

        for(int i=0;i<n-1;i++)
        {
            key=n;
            for(int j=0;j<n-1-i;j++)
            {
                System.out.print(key+" ");
                key--;
                
            }
             for(int j=0;j<space;j++)
            {
                System.out.print(midKey+" ");
                
            }
            midKey++;
            space=space+2;
            int lastKey=key+1;
            for(int j=0;j<n-1-i;j++)
            {
                System.out.print(lastKey+" ");
                lastKey++;
                
            }
            System.out.println();
        }
        
    }
}
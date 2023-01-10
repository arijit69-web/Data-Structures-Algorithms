/* 

Pattern 1:
   
  Input: 5
  
  Output:
  * * * *
  * * * *
  * * * *
  * * * *
  * * * *
    
*/

class Solution 
{

    void printSquare(int n) 
    {

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}


/* 

Pattern 2:
 
 Input: 5
 
 Output:
 * 
 * *
 * * *
 * * * *
 * * * * *  

*/

class Solution 
{

    void printTriangle(int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}

/* 

Pattern 3:

Input: 5

Output:
1
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
 
*/

class Solution 
{

    void printTriangle(int n) 
    {
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/* 

Pattern 4:

Input: 5

Output:
1
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5

*/

class Solution 
{

    void printTriangle(int n) 
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }    
    }

}

/* 

Pattern 5:

Input: 5

Output:
* * * * *
* * * * 
* * * 
* *  
* 
 
*/

class Solution 
{

    void printTriangle(int n) 
    {
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}


/* 

Pattern 6:

Input: 5

Output:
1 2 3 4 5
1 2 3 4
1 2 3 
1 2  
1 

*/

class Solution 
{

    void printTriangle(int n)
    {
   
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}


/* 

Pattern 7:

Input: 5

Output:
    *
   ***  
  *****
 *******
*********

*/

class Solution 
{

    void printTriangle(int n) 
    {
        int k=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<k;j++)
            {
                System.out.print("*");
            }
            k=k+2;
            System.out.println();
        }
    }
}


/* 

Pattern 8:

Input: 5

Output:

*********
 *******
  *****
   ***
    *

*/

class Solution 
{
    void printTriangle(int n) 
    {
        int t=n+n-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<t;j++)
            {
                System.out.print("*");
            }
            t=t-2;
            System.out.println();
        }

    }
}


/* 

Pattern 9:

For Input: 5

Your Output: 
    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *

*/ 

class Solution 
{
    void printDiamond(int n) 
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        int t=n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<t;j++)
            {
                System.out.print("* ");
            }
            t=t-1;
            System.out.println();
        }
    }

}
    
/* 

Pattern 10:

Input: 5

Output:
* 
* * 
* * * 
* * * * 
* * * * *
* * * *
* * *
* *
*

*/

class Solution 
{
    void printTriangle(int n) 
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        n--;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/* 

Pattern 11:

Input: 5

Output:
1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1

*/

class Solution 
{
    void printTriangle(int n) 
    {
        int t=1;        
        for(int i=0;i<n;i++)
        {
            if(i%2==0)t=1;
            else t=0;
            for(int j=0;j<=i;j++)
            {
                System.out.print(t+" ");
                t=1-t;
            }
            
            System.out.println();
              
        }
    }
}
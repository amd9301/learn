import java.util.*;
import java.lang.*;

class BitManipulations
{
   
    int n,m,i,j;
    int arr[][]= new int[20][10];
    Scanner sc = new Scanner(System.in);
    void read()
    {
        System.out.println("Enter no of rows and columns:");
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.println("Enter the elements of the matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
   
   
    void pickRowCol()
    {
        // enter n if u want  to pick row and enter m if u want to pick columns
       
        // Enter t=0 for row BitManipulations
        // enter t=1 for columns
        System.out.println("enter t value");
        int t;
        t= sc.nextInt();
        if(t==0)
        {
            // enter the row Number
            System.out.println("enter the row number ");
            int chr;
            chr=sc.nextInt();
            for(i=0;i<m;i++)
            {
                arr[chr][i]  =arr[chr][i] ^1;
            }
           
        }
        else
        {
            int ch ;
            System.out.println("Enter the column number");
            ch =sc.nextInt();
            for(i=0;i<n;i++)
            {
                arr[i][ch] = arr[i][ch]^1;
            }
           
        }
       
    }
    void display()
    {
        System.out.println("After BitManipulations");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println("\n");
           
        }
    }
   
}
class Main
{
    public static void main(String args[])
    {
        BitManipulations ob1=new BitManipulations();
        ob1.read();
        ob1.pickRowCol();
        ob1.display();
       
       
    }
}
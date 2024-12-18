import java.util.Scanner;
public class BubbleSort
 {
   public static void main(String []args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of elements:");
       int n= sc.nextInt();
       int[] A=new int[n];
       System.out.println("enter the elements:");
       for(int i=0;i<n;i++)
          A[i]=sc.nextInt();
       bubbleSort(A);
       System.out.println("sorted array:");
       for(int i=0;i<A.length;i++)
          System.out.println(A[i]+"");
     }
      static void bubbleSort(int[] A)
      {
        int n=A.length;
        for(int i=0;i<n-1;i++)
          for(int j=0;j<n-i-1;j++)
            if(A[j]>A[j+1])
            {
              int temp=A[j];
              A[j]=A[j+1];
              A[j+1]=temp;
            }
      }
 }

OUTPUT
enter the number of elements:
5
enter the elements:
9
4
7
1
3
sorted array:
1
3
4
7
9

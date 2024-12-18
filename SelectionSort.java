import java.util.Scanner;
class SelectionSort
{
  public static void main(String []args)
  {
    System.out.println("Enter the size of array:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int []A=new int[a];
    System.out.println("Enter the elements:");
    for(int i=0;i<a;i++)
    {
      A[i]=sc.nextInt();
    }
    selectionSort(A);
    System.out.println("sorted array:");
    for(int i=0;i<A.length;i++)
    {
          System.out.println(A[i]+" ");
    }      
  }
  static void selectionSort(int[] A)
  {
    int a=A.length;
    for(int i=0;i<a-1;i++)
    {
      int min=i;
      for(int j=i+1;j<a;j++)
      {
       if(A[j]<A[min])
       {
         min=j;
       }
      }
      if(min!=i){
        int temp=A[min];
        A[min]=A[i];
        A[i]=temp;
      }
    } 
  }
} 

OUTPUT
Enter the size of array:
4
Enter the elements:
22
66
3
9
sorted array:
3 
9 
22 
66

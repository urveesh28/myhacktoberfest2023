import java.util.*;
public class Array_rotation_1
{
	 
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int[][] arr1=new int[3][3];
        System.out.println("Enter the array elements :");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
                arr1[j][arr1.length-i-1]=arr[i][j];//copying elements
            }
        }
        System.out.println("Original array :");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        
        System.out.println("Rotated array :");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.print("\n");
        }
        
    }
}
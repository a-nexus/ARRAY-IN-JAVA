import java.util.*;
public class TwodArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    int row,coloum;
    System.out.print("ENTER HOW MANY ROWS YOU WANT:");
   row=sc.nextInt();
     System.out.print("ENTER HOW MANY COLOUM YOU WANT:");
   coloum=sc.nextInt();
    int[][] arr=new int[row][coloum];
    for(int i=0;i<row;i++){
        for(int j=0;j<coloum;j++){
            System.out.print("Enter the"+"["+i+"]"+"["+j+"]:");
           
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<coloum;j++){
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
    }
    }
}
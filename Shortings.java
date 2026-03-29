import java.util.*;
public class Shortings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num,temp;
        System.out.print("ENTER THE SIZE OF THE ARRAY:");
        num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            System.out.print("ENTER THE "+(i+1)+" INDEXED VALUE=");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        

    }
    
}

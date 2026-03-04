import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];//INITILIZATION OF A ARRAY
        int num;
        System.out.print("ENTER THE NUMBER OF ELEMENT BETWEEN 0 AND 100:");
        num=sc.nextInt();
        if(num>99 || num<=0){
            System.out.println("INVALID");
            return ;
        }
        for(int i=0;i<num;i++){
            System.out.print("ENTER YOUR NUM:");
         arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+"\t");
        }
return ;
    }
    

}
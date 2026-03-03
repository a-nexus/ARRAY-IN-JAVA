import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] arr=new String[100];//INITILIZATION OF A ARRAY
        for(int i=0;i<2;i++){
            System.out.print("ENTER YOUR NAME:");
         arr[i]=sc.nextLine();
        }
        for(int i=0;i<2;i++){
            System.out.println(arr[i]+"\t");
        }

    }

}
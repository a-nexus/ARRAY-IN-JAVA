// import java.util.*;
// public class Array{
//     public static int main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[100];//INITILIZATION OF A ARRAY
//         int num;
//         System.out.print("ENTER THE NUMBER OF ELEMENT BETWEEN 0 AND 100:");
//         num=sc.nextInt();
//         if(num>99 || num<=0){
//             System.out.println("INVALID");
//             return 0 ;
//         }
//         for(int i=0;i<num;i++){
//             System.out.print("ENTER YOUR NUM:");
//          arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<num;i++){
//             System.out.print(arr[i]+"\t");
//         }
// return 0;
//     }
    

// }


//OUESTION 
//TAKE AN ARRAY AS INPUT FROM THE USER. SEARCH FOR A GIVEN NUMBER X AND PRINT THE INDEX AT WHICH ITS OCCUR
// import java.util.*;
// public class Array{
//     public static void binarySearch(int element,int target){
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[element];
//         for(int i=0;i<element;i++){
//             System.out.print("ENTER THE "+(i+1)+" VALUE=");
//             arr[i]=sc.nextInt();
//         }
//  for(int i=0;i<element;i++){
//     if(arr[i]==target){
//         System.out.print("AT "+i+" INDEX\n");
//     }
   
//  }
//   System.out.println(arr.length);//HERE THE HOW TO FIND THE LENGTH OF THE ARRAY JUST LIKE IN C WE HAVE SIZE OF ATTRIBUTE SO HERE IS length ATTRIBUTE BY WHICH WE CCAN FIND THE SIZE OF THE ARRAY FIRSTLY I HAVE TO WRITE THE NAME OF THE ARRAY AND THEN A . AND THEN LENGTH ATTRIBUTE
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER THE NUMBER OF ELEMENT:");
//         int element=sc.nextInt();
//         System.out.print("ENTER THE TARGETED VALUE:");
//         int target=sc.nextInt();
//          binarySearch(element,target);
//     }
// }

//TAKE AN ARRAY OF NAMES AS INPUT FROM THE USER AND PRINT THEM ON THE SCREEN.

// import java.util.*;
// public class Array{
// public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("ENTER THE NUMBVER OF NAMES:");
//     int num=sc.nextInt();
//     sc.nextLine();
//     String[] name=new String[num];
//     for(int i=0;i<name.length;i++){
//         System.out.print("ENTER THE "+(i+1)+" NAME=");
//         name[i]=sc.nextLine();
//     }
//     for(int i=0;i<name.length;i++){
//         System.out.println((i+1)+" NAME="+ name[i]);
//     }
// }
// }


// //3. TAKE AN ARRAY OF NUMBERS AS INPUT AND CHECK IF IT IS AN ARRAY SORTED IN 
// ASCENDING ORDER. 
// EG : { 1, 2, 4, 7 } IS SORTED IN ASCENDING ORDER. 
//        {3, 4, 6, 2} IS NOT SORTED IN ASCENDING ORDER. 

import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int temp;
        System.out.print("ENTER THE NUMBER OF ELEMENT:");
        int element=sc.nextInt();
        int[] arr=new int[1000];
        if(element>=1000 || element<=0){
            System.out.print("INVALID ELEMENT FILLUP");
            return ;
        }
        for(int i=0;i<element;i++){
            System.out.print("ENTER THE "+(i+1)+" INDEXED VALUE=");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<element;i++){
            for(int j=i+1;j<element;j++){
                if(arr[i]>arr[j]){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
            }
        }
        for(int i=0;i<element;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
import java.util.Scanner;

public class neighbor {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] arr=new int[5];
        int i,j;

        System.out.println("Enter the elements:");
        for(i=0;i<=4;i++){
            arr[i]=scn.nextInt();
        }
        int a,index=0;
        a=Math.abs(arr[1]-arr[0]);
        for(i=2;i<=4;i++){

            if(Math.abs(arr[i]-arr[i-1])<a){
                a=Math.abs(arr[i]-arr[i-1]);
                index=arr[i-1];
            }
        }
        System.out.println(" "+a+" "+index);
    }
}
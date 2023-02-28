import java.util.Scanner;

public class arraylist {
    static int arr[]=new int[5];

    static Scanner scn = new Scanner(System.in);

    static void getData(int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
    }

    static int[] printArray(){
        return arr;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");

        int n=sc.nextInt();

        getData(n);
        System.out.println("Array Elements:");
        int b[]=new int[10];

        b=printArray();

        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
}
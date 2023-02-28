import java.util.Scanner;
 class arrays {
    public static void main(String[] args){

        Scanner scn=new Scanner(System.in);
        int[] even=new int[5];
        int[] odd=new int[5];
        int i=0,j=0,k,a,another;

        do{
            System.out.println("Enter the element:");
            a=scn.nextInt();

            if(a%2==0){
                if(i<=4){
                    even[i]=a;
                    i++;
                }
                else{
                    System.out.println("Array is full");
                }
            }
            if(a%2!=0){
                if(j<=4){
                    odd[j]=a;
                    j++;
                }
                else{
                    System.out.println("Array is full");
                }
            }

            System.out.println("Do u want to continue?(1/0)");
            another=scn.nextInt();
        }while(another==1);

        for(i=0;i<=4;i++){
            System.out.println("Even no.:"+even[i]);
        }
        System.out.println("----------");
        for(j=0;j<=4;j++){
            System.out.println("Odd no.:"+odd[j]);
        }
    }
}
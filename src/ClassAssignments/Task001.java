package ClassAssignments;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        /*Using Scanner create an array of integer values. After the array is created, calculate the sum of all
         stored elements in that array.
         */
        Scanner scan = new Scanner(System.in);
        int[]arr=new int[6];
        System.out.println("Please Enter six numbers");
        arr[0]=scan.nextInt();
        arr[1]=scan.nextInt();
        arr[2]=scan.nextInt();
        arr[3]=scan.nextInt();
        arr[4]=scan.nextInt();
        arr[5]=scan.nextInt();
        int sum=0;

        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];

        }
        System.out.println(sum);



    }
}

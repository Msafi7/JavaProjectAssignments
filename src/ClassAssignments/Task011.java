package ClassAssignments;

public class Task011 {
    public static void main(String[] args) {

//Write a program to print out duplicate elements from an Array of Strings{
            String arr[] = {"Texas", "Houston", "Mike", "John", "Texas", "Houston"};
            for (int i = 0; i < arr.length-1; i++) {
                for ( int j = 0; j < arr.length; j++){
                    if ( (arr[i].equals(arr[j]))&&(i!=j)){
                        System.out.println(arr[i]);
                    }
                }

            }
    }
}

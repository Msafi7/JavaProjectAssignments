package ClassAssignments;

public class Task004 {
    public static void main(String[] args) {
    /*
    Create a 2D array or integer type where you will store odd and even numbers.
    Develop a program which will identify/print the even numbers only.
     */
        int arr[][]={{88,90,48,67,55},
                {34,67,98,11,60},
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]%2==0){
                    System.out.println(arr[i][j]);
                }


            }

            }
        }

    }



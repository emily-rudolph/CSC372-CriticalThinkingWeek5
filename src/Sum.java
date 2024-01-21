import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws Exception {
        Sum sum = new Sum(); 

        int [] newUserNums = sum.userNums(); 
        int l = newUserNums.length; 

        int userSum = sum.calculate(newUserNums, l); 
        System.out.println(String.format("The Sum Of The Entered Numbers Is %d", userSum)); 
        
    } 

    public int calculate(int arr[], int n) {
        if(n > 0) {
            return arr[n -1] + calculate(arr, --n);

        } else {
            return 0;
        }
    }

    public int[] userNums(){ 
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter The First Number: ");
        int n1 = in.nextInt(); 

        System.out.println("Please Enter The Second Number: ");
        int n2 = in.nextInt();

        System.out.println("Please Enter The Third Number: ");
        int n3 = in.nextInt();

        System.out.println("Please Enter The Forth Number: ");
        int n4 = in.nextInt();

        System.out.println("Please Enter The Fifth Number: ");
        int n5 = in.nextInt();

        in.close();
    
        return new int[] {n1, n2, n3, n4, n5}; 
    }
}


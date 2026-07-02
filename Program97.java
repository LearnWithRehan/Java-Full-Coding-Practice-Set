import java.util.Scanner;

public class Program97 {

    //function to partition the array
    static int partition(int arr[],
                         int low,int high
                         ){
        int pivot = arr[high];
        int i = low - 1;

       for (int j = low; j<high; j++){
           if (arr[j] < pivot){
               i++;
               //swap arr[i] and arr[j]
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
       //swap pivot to correct position
        int temp = arr[i + 1];
       arr[i + 1] = arr[high];
       arr[high] = temp;
       return i + 1;
    }
    //Quick sort function
    static void quickSort(int arr[], int low,int hight){
        if (low < hight){
            int pi = partition(arr,low,hight);
            quickSort(arr,low,pi-1);
            quickSort(arr, pi+1, hight);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user input
        System.out.print("enter the num of ele:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //sort the array
        quickSort(arr, 0, n-1);
        //Display sorted array
        System.out.println("Sorted Array:- ");
        for (int num : arr){
            System.out.print(num + " ");
        }
        sc.close();

    }
}

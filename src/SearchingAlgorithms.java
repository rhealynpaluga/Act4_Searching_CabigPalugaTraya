import java.util.Scanner;

public class SearchingAlgorithms {

public static int linearSearch(int[] arr, int target) {
for (int i = 0; i < arr.length; i++) {
if (arr[i] == target) {
return i;
}
}
return -1;
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Choose a searching algorithm to perform:");
System.out.println("1. Linear Search");
System.out.println("2. Binary Search");
System.out.println("3. Jump Search");
System.out.println("4. Exponential Search");

System.out.print("Enter your choice (1-4): ");
int choice = sc.nextInt();

System.out.print("Enter no. of elements: ");
int n = sc.nextInt();

int[] arr = new int[n];
System.out.println("Enter the elements:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}

System.out.print("Enter target element: ");
int target = sc.nextInt();

if (choice == 1) {
int result = linearSearch(arr, target);
if (result != -1) {
System.out.println("Element " + target + " is found at index " + result + ".");
} else {
System.out.println("Element " + target + " is not found in the array.");
}
} else {
System.out.println("Only Linear Search is implemented.");
}

}
}
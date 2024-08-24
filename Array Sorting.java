public class sorting {

    public static void main(String[] args) {
        // Initialize the array
        int arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) { // Sort in descending order
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
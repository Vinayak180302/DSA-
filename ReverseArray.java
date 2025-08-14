import java.util.Arrays;

class ReverseArray{
  public static void Reverse(int arr[]){
    int start = 0, end = arr.length-1;

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;  
    }
    System.out.println(Arrays.toString(arr));
  }
  public static void main(String[] args) {
    int arr[] = {2, 3, 5, 7, 8, 9};
    Reverse(arr);

  }
}
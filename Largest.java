public class Largest{

  public static int largest(int arr[]){
    int large = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > large){
        large = arr[i];

      }
      
    }
    return large;
      
  }

  public static void main(String[] args) {
    int arr[] = {4, 2, 8, 6, 23, 65, 58};
    System.out.println(largest(arr));

  }
}
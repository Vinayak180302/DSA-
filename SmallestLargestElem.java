public class SmallestLargestElem {

  public static void smallestLargest(int arr[]){
    int min = arr[0];
    int max = arr[0];

    for (int i=1; i<arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];

      }else if(arr[i] > max){
        max = arr[i];
      }
      
    }
    System.out.println("max element in array is :"+ max);
    System.out.println("min element in array is:"+ min);
  }
  public static void main(String[] args) {
    int arr[] = {4, 3, 8, 120, 65, 84, 1, 64, 45};
smallestLargest(arr);

  }
}

public class SecondLarge {
  public static int second(int arr[]){
    int largest =arr[0];
    int slargest = -1;

    for (int i = 1; i < arr.length; i++) {
      if(arr[i]> largest){
        slargest = largest;
        largest = arr[i];
      }else if(arr[i] < largest && arr[i] > slargest){
        slargest = arr[i];
      }
    }
    return slargest;
  }
  public static void main(String[] args) {
    int arr[] = {1, 3, 5, 4, 7, 7, 6};
    System.out.println(second(arr));
  }
}

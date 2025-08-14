public class SecondSmall {

  public static int SecSmall(int arr[]){
    int smallest = arr[0];
    int ssmallest = Integer.MAX_VALUE;
     
    for (int i = 1; i < arr.length; i++) {
      if(arr[i] < smallest){
        ssmallest = smallest;
        smallest = arr[i];
      }
      else if(arr[i] != smallest && arr[i] < ssmallest){
        ssmallest = arr[i];
      }
    }
    return ssmallest;
  }
  public static void main(String[] args) {
    int arr[] = {1, 3, 5, 4, 7, 7, 6};
    System.out.println(SecSmall(arr));
  }
}

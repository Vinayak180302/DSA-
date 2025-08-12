public class Maxsum {

  public static void max(int arr[]){
    int currsum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      int start = i;

      for (int j = i; j < arr.length; j++) {
        int end = j;
        currsum = 0;

        for (int k = start; k <= end; k++) {
          currsum += arr[k];
          
        }
        System.out.println("subarray of sum from index" + start + " to index" + end + "=" + currsum);
        
        if (currsum > maxSum) {
          maxSum = currsum;
        }
      }
      
    }
    System.out.println("max sum is " + maxSum);

  }

  public static void kadane(int arr[]){
    int cs = 0;
    int mx = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
       cs = cs + arr[i];
       if(cs < 0){
        cs = 0;
       }
       mx = Math.max(cs, mx);
      
    }
    System.out.println("max sum is : " + mx);
  }

  public static void main(String[] args) {

    int arr[] = {2, -1, 3, -4, 5};
    // max(arr);
    kadane(arr);
    
  }
}

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Binarysearch{
  public static void main(String[] args) {
    System.out.println("Hello world!");
   int[] arr = {-18, -12, -6, -2, 0, 2, 4, 6, 12, 18};
    int target = 5;
    int ans = BinarySearch(arr, target);
    System.out.println(ans);
    
    }

  public static int BinarySearch(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;

    while(start <= end) {
      int mid =  start + ( end - start ) / 2;
      if(target < arr[mid]){
        end  = mid - 1;
        
      } else if(target > arr[mid]){
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }


  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}


public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
      int first = arr[i];
      int second = arr[arr.length - i - 1];
      arr[i] = second;
      arr[arr.length - i - 1] = first;
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];
    int numOfLowest = 0;
    for(double num: arr) {
      if(num < lowest) { lowest = num;}
    }
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { 
        sum += num; 
      }
      else{
        numOfLowest++;
      }
    }
    return sum / (arr.length - numOfLowest);
  }


}


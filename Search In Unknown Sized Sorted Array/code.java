//Given a integer dictionary A of unknown size, where the numbers in the dictionary are sorted in ascending order, 
//determine if a given target integer T is in the dictionary. Return the index of T in A, return -1 if T is not in A.

//Assumptions
//
//dictionary A is not null
//dictionary.get(i) will return null(Java)/INT_MIN(C++)/None(Python) if index i is out of bounds

//Examples
//
//A = {1, 2, 5, 9, ......}, T = 5, return 2
//A = {1, 2, 5, 9, 12, ......}, T = 7, return -1



// My solution
//
/*
*  interface Dictionary {
*    public Integer get(int index);
*  }
*/

// You do not need to implement the Dictionary interface.
// You can use it directly, the implementation is provided when testing your solution.
public class Solution {
  public int search(Dictionary dict, int target) {
    int left = 0;
    int right = 1;
    while (dict.get(right) != null) {
      right *= 2;
    }
    
    return binarySearch(dict, left, right, target);
  }
  
  private int binarySearch(Dictionary dict, int left, int right, int target) {
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (dict.get(mid) == null) {
        right = mid - 1;
      }
      else if (dict.get(mid) == target) {
        return mid;
      }
      else if (dict.get(mid) > target) {
        right = mid - 1;
      }
      else {
        left = mid + 1;
      }
    }
    
    return -1;
  }  
}



// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.8uqa0e4f56pk


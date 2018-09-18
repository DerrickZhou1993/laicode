//Find all pairs of elements in a given array that sum to the pair the given target number. 
//Return all the distinct pairs of values.

//Assumptions
//
//The given array is not null and has length of at least 2
//The order of the values in the pair does not matter

//Examples
//
//A = {2, 1, 3, 2, 4, 3, 4, 2}, target = 6, return [[2, 4], [3, 3]]




// My solution
//
public class Solution {
  public List<List<Integer>> allPairs(int[] array, int target) {
    int left = 0; 
    int right = array.length - 1;
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(array);
    
    while (left < right) {  
      if (left > 0 && array[left] == array[left - 1]) {
        left++;
        continue;
      }       
      if (array[left] + array[right] < target) {
        left++;
      }
      else if (array[left] + array[right] > target) {
        right--;
      }
      else {
        List<Integer> pair = new ArrayList<>();
        pair.add(array[left++]);
        pair.add(array[right--]);
        result.add(pair);
      }    
    }
    return result;
  }  
}




// Professional solution
//
https://docs.google.com/document/d/1FqVLq6Pu6FMr0cObsjUskr7MNLVZfCiTKOrbrTaB0ko/edit#heading=h.8dedf4rshrof




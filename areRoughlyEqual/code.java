Check if the given number x and y are roughly equal, the allowed error is 0.0001.

public class Solution {
  public boolean areEqual(double x, double y) {
    boolean b = Math.abs(x - y) < 0.0001;
    return b;
  }
}




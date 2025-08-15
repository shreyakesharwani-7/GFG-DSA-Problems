// User function Template for Java

class Solution {
    public static boolean checkEqual(int[] a, int[] b) 
    {
        if(a.length != b.length)
        {
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        // Your code here
      return Arrays.equals(a,b);
        
    }
}

class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    private void reverse(char[] s, int left, int right) {
        if (left >= right) return; // base case
        
      char tmp = s[left];
        s[left] = s[right];
        s[right] = tmp;
      
        reverse(s, left + 1, right - 1); // recursive call
    }
}

//69. Sqrt(x)

class Solution {
  public static void main(String[] args) {
        int x=4;
        System.out.println(mySqrt(x));
  }
    public static int mySqrt(int x) {
        if (x < 2)
            return x;
        int start = 2;
        int end = x/2;
        int ans=0;
        while (start <= end) {
            int mid = start +(end - start) / 2;
            long num = (long) mid * mid;
            if(num == x) {
                ans=mid;
                return ans;
//                end = mid - 1;


            }
            else if (num > x) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }
}
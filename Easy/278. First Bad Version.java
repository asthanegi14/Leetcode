/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 1,l=n;
        while(i<l)
        {
            int mid = i+(l-i)/2;
            if(isBadVersion(mid))
            {
                l = mid;
            }
            else{
                i = mid+1;
            }
        }
        return i;
    }
}

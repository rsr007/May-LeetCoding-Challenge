public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1;
        int r=n;
        while(l<r){
            int m=l+(r-l)/2;
            if(isBadVersion(m))
                r=m;
            else
                l=m+1;
            
        }
        return l;
    }
}

/*
Explanation
------------
This ques can be solved in linear time as well by simply traversing till 'n' & calling 'isBadVersion()' for each n, but this will be O(n) and gives TLE on submission.

So binary search works fine for above problem.

For better understanding of binary search. Please look into: https://www.geeksforgeeks.org/binary-search

*/
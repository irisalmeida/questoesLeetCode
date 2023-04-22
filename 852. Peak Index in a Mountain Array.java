class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        return findPeakIndex(arr, left, right);
    }
    
    private int findPeakIndex(int[] arr, int left, int right) {
        if (left == right) {
            return left;
        }
        
        int mid = (left + right) / 2;
        
        if (arr[mid] < arr[mid+1]) {
            return findPeakIndex(arr, mid+1, right);
        } else {
            return findPeakIndex(arr, left, mid);
        }
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = IntStream.concat(Arrays.stream(nums1),Arrays.stream(nums2)).toArray();
        
        Arrays.sort(merge);
        
        int length = merge.length;
        double m = 0;
        int index = length/2;
        
        //짝수
        if(length%2 == 0){
            m = (merge[index] + merge[index -1])/2.0;
        }else{
            m = merge[index];
        }
        
        return m;
        
    }
}
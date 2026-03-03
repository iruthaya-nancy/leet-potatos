class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            //whenever the array is two sorted or like a sorted array we will use
            //two pointer apporach
            int i = m-1;
            int j = n-1;
            int k = m+n-1;
            while(i>=0 && j >= 0){
                if(nums1[i]>nums2[j]){
                    nums1[k] = nums1[i];
                    i--;
                }
                else{
                    nums1[k] = nums2[j];
                    j--;
                }
                k--;
            }

            //if j still has value
            while(j>=0){
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
    }
class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = nums.length / 2;
        int candidate = nums[0];
        int votes = 0;
        for (int num : nums)
        {
            if (candidate == num)
                votes++;
            if (votes > majority)
                return candidate;
        }
        return candidate;
    }
    public void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        majorityElement(arr);
    }
}
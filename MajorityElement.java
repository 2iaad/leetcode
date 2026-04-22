/**
 * this is solved using Boyer-Moore Majority Voting Algorithm
 */
class MajorityElement {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int votes = 0;
        for (int num : nums)
        {
            if (votes == 0)
                candidate = num;
            if (candidate == num)
                votes++;
            else 
                votes--;
        }
        return candidate;
    }
    public void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int a = majorityElement(arr);
        System.out.println(a);
    }
}
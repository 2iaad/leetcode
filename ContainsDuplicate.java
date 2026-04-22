import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums)
        {
            if (set.contains(n))
                return true;
            set.add(n);
        }
        return false;
    }
    public void main(String[] args) {
        int[] arr = {1,2,3, 1, 2};
        boolean flag = containsDuplicate(arr);
        System.out.println(flag);
    }
}
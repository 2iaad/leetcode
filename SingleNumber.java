import java.util.Set;
import java.util.HashSet;

class SingleNumber {
    // public int singleNumber(int[] nums) {
    //     int xor = 0;
    //     for (int n : nums)
    //         xor = xor ^ n;
    //     return xor;
    // }

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n))  // add() return false if already exists
                set.remove(n);
        }
        return set.iterator().next();
    }

    public void main(String[] args)
    {
        int a = singleNumber(new int[] {3, 4, 3, 4, 5});
        System.out.println(a);
    }
}
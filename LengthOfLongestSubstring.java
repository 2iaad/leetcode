import java.util.HashSet;
import java.util.Set;

class LengthOfLongestSubstring {    
    public int lengthOfLongestSubstring(String s) {

        int length = s.length();
        int maxLength = 0, counter = 0, i = 0;
        Set<Character> set = new HashSet<>();
        
        while (i < length) {
            counter = i;

            while (counter < length)
            {
                System.out.print('-');
                System.out.println(s.charAt(counter));
                if (set.contains(s.charAt(counter)))
                {
                    System.out.print("-->");
                    System.out.println(s.charAt(counter));
                    set.clear();
                    break ;
                }
                set.add(s.charAt(counter));
                counter++;
                if (counter - i > maxLength)
                    maxLength = counter - i;
            }
            i++;
        }
       return maxLength;
    }
    public void main(String[] args) {
        String str = "dvdf";
        int a = lengthOfLongestSubstring(str);
        System.out.println(a);
    }
}

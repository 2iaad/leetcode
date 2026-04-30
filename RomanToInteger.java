import java.util.Map;

/**
 * to optimize memory side, use swtich case instead of map
 */

class RomanToInteger {
    static public int romanToInt(String s) {
        int sum = 0;
        
        Map<Character, Integer> obj = Map.of(    
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        // Map<Character, Integer> obj = new HashMap<>();
        // obj.put('I', 1);
        // obj.put('V', 5);
        // obj.put('X', 10);
        // obj.put('L', 50);
        // obj.put('C', 100);
        // obj.put('D', 500);
        // obj.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && obj.get(s.charAt(i)) < obj.get(s.charAt(i + 1)) )
                sum -= obj.get(s.charAt(i));
            else
                sum += obj.get(s.charAt(i));
        }
        return sum;
    }
    static public void main(String[] args)
    {
        int result = romanToInt("II");
        System.out.println();
        System.out.println(result);
    }
}
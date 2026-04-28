/*
    Digital root + another problem


- You are working with data collected from various sensors. Given an array of non-negative integers readings representing the sensor readings, 
transform the array by repeatedly replacing each element with the sum of its digits. Continue this transformation until every element is a single digit.
- Return the most occurring digit in the final array. In case of a tie, return the highest digit.
- Note: You are not expected to provide the most optimal solution, but a solution with time complexity not worse than 0 (readings. Length?) will fit within the execution time limit.

Example:
    readings = [123, 456, 789, 101] the output should be solution(readings) = 6.
Explanation:
    123 -> 1 + 2 + 3 -> 6
    456 -> 4 + 5 + 6 -> 15 -> 6
    789 -> 24 -> 6
    101 -> 2

    for readings = [6], the output shoud be solution(readings) = 6

*/

import java.util.Arrays;

class Bcg {
    // public int digitalRoot(int element) {
    //     if (element < 10)
    //         return element;

    //     int sum = 0;
    //     while (element > 0)
    //     {
    //         sum += element % 10;
    //         element /= 10;
    //     }
    //     return digitalRoot(sum);
    // }

    public static int digitalRoot(int n) {
        return n == 0 ? 0 : 1 + (n - 1) % 9;
    }
    
    public int solution(int[] readings)
    {
        int ret = 0;
        int element = 0;

        for (int i = 0; i < readings.length; i++)
        {
            System.out.print(readings[i]);
            System.out.print("--");
            element = readings[i];

            readings[i] = digitalRoot(element);
            System.out.println(readings[i]);
        }
        System.out.println("-------");
        System.out.println(Arrays.toString(readings));

        return ret;
    }
    public void main(String[] args)
    {
        int[] a = {123, 456, 789, 101};
        solution(a);
    }
    
}
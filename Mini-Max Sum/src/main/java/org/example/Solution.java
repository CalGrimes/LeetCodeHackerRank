package org.example;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        // Sort array because why not
        Collections.sort(arr);

        long minVal = -1;
        // 10^9
        long maxVal = -1;




        long lastElement = -1;
        long sum = 0;
        for (int i = 0; i < 5; i++) {
            // pop last element off list and store
            lastElement = arr.remove(arr.size() - 1);
            sum = 0;

            // sum all elements in list
            for (int j = 0; j < arr.size(); j++) {
                sum+=(long)arr.get(j);
            }

            if (sum < minVal || minVal == -1) {
                minVal = sum;
            } else if (sum > maxVal) {
                maxVal = sum;
            }

            arr.add(0, (int)lastElement);
        }

        System.out.println(minVal + " " + maxVal);


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

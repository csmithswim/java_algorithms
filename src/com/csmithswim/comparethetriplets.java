package com.csmithswim;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<Integer>();
        int aCount = 0;
        int bCount = 0;

// System.out.println(a);
        for (int i = 0; i < a.size(); i++){
            // System.out.println(a.get(i));
            for (int j = 0; j <1; j++){
                // System.out.println(a.get(i));
                // System.out.println("\n");
                // System.out.println(b.get(i));

                System.out.println(a.get(i) > b.get(i));
                if (a.get(i) > b.get(i)){
                    aCount++;
                }
                if (b.get(i) > a.get(i)){
                    bCount++;
                }

            }
        }
// System.out.println(aCount);
// System.out.println(bCount);
        result.add(aCount);
        result.add(bCount);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

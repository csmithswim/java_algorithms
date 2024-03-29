package com.csmithswim;
import java.util.*;

public class DictionariesAndMaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneBook.get(s) == null) {
                System.out.println("Not found");
                continue;
            }
            System.out.println(s + "=" + phoneBook.get(s));
        }
        in.close();
    }
}

package com.csmithswim;

import java.util.HashMap;
import java.util.List;

public class RansomNote {

    public static void main(String[] args) {
        List<String> magazine = List.of("give", "me", "one", "grand", "today", "night", "night");
        List<String> note = List.of("give", "me", "one", "grand", "today", "night", "me");

    /* Count how many strings are in magazine and then compare
    the number of occurrence of each string to note     */
        HashMap<String, Integer> magazineMap = new HashMap<>();
        HashMap<String, Integer> noteMap = new HashMap<>();

        //Loop to populate hashmap and tally occurrences of strings in note
        for (int i = 0; i < note.size(); i++) {
            if (noteMap.containsKey(note.get(i))) {
                noteMap.put(note.get(i), noteMap.get(note.get(i)) + 1);
                continue;
            }
            noteMap.put(note.get(i), 1);
        }

        //Loop to populate hashmap and tally occurrences of strings in magazine
        for (int i = 0; i < magazine.size(); i++) {
            if (magazineMap.containsKey(magazine.get(i))) {
                magazineMap.put(magazine.get(i), magazineMap.get(magazine.get(i)) + 1);
                continue;
            }
            magazineMap.put(magazine.get(i), 1);
        }

        //Seeing if magazineMap has the same number of values as noteMap to make the ransom note
        int count = 0;
        for (int i = 0; i < note.size(); i++) {
            if (magazineMap.get(note.get(i)) == null || noteMap.get(note.get(i)) > magazineMap.get(note.get(i))) {
                count = 1;
                break;
            }
        }
        System.out.println(count > 0 ? "No" : "Yes");
    }
}

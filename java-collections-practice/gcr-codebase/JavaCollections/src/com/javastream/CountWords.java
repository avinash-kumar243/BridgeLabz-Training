package com.javastream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CountWords {
    public static void main(String[] args) {
        String filePath = "input.txt";
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Step 1: Read file and count words
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while((line = br.readLine()) != null) {
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
                String[] words = line.split("\\s+");

                for(String word : words) {
                    if(!word.isEmpty()) {
                    	wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch(IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
            return;
        }

        // Step 2: Sort words by frequency
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

        Collections.sort(list, (a, b) -> b.getValue().compareTo(a.getValue()));

        // Step 3: Display top 5 words
        System.out.println("Top 5 Most Frequent Words:");
        int count = 0;

        for(Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            count++;
            if(count == 5) break;
        }
    }
}
package com.example.project.WordScramble;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         WordScramble ws = new WordScramble();
         System.out.println(ws.scrambleWord("APPLE"));
         ArrayList<String> testWordList = new ArrayList<String>(Arrays.asList("TAN", "ABRACADABRA", "WHOA", "APPLE", "EGGS"));
         ws.scrambleOrRemove(testWordList);
    }
}

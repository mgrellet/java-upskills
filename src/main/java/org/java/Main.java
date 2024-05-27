package org.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  /**
   * Odd or even
   *
   * @param number
   * @return
   */
  public static boolean oddOrEven(int number) {
    return number % 2 == 0;
  }

  /**
   * Is password complex At least six characters 1 Uppercase letter 1 lowercase letter 1 number
   *
   * @param password
   * @return
   */
  public static boolean isPasswordComplex(String password) {
    if (password.length() < 6) {
      return false;
    }
    boolean hasNumber = false;
    boolean hasUppercase = false;
    boolean hasLowercase = false;

    for (int i = 0; i < password.length(); i++) {
      char currentLetter = password.charAt(i);
      if (Character.isDigit(currentLetter)) {
        hasNumber = true;
      }
      if (Character.isUpperCase(currentLetter)) {
        hasUppercase = true;
      }
      if (Character.isLowerCase(currentLetter)) {
        hasLowercase = true;
      }
    }

    return hasLowercase && hasUppercase && hasNumber;
  }

  public static int removeDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int n : nums) {
      set.add(n);
    }
    return set.size();
  }

  public static int squareEveryDigit(int n) {
    String s = String.valueOf(n); //Math.pow
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      int digit = Character.getNumericValue(c);
      result.append(digit * digit);
    }
    return Integer.parseInt(result.toString());
  }

  public static boolean XO(String str) {
    String x = "x";
    String o = "o";
    int xCount = 0;
    int oCount = 0;

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (Character.isDigit(c)) {
        continue;
      }
      String letter = String.valueOf(c).toLowerCase();
      if (letter.equals(x)) {
        xCount++;
      }
      if (letter.equals(o)) {
        oCount++;
      }
    }

    return xCount == oCount;
  }

  public static String[] commonCharacters(String[] strings) {
    // Write your code here.
    List<String> list = new ArrayList<>();
    for (String s : strings) {
      Set<String> uniques = new HashSet<>();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        uniques.add(String.valueOf(s.charAt(i)));
      }

      for (String unique : uniques) {
        sb.append(unique);
      }
      list.add(sb.toString());
    }

    Map<String, Integer> counterMap = new HashMap<>();
    for (String s : list) {
      for (int i = 0; i < s.length(); i++) {
        String charString = String.valueOf(s.charAt(i));
        if (counterMap.containsKey(charString)) {
          counterMap.put(charString, counterMap.get(charString) + 1);
        } else {
          counterMap.put(charString, 1);
        }
      }
    }

    List<String> result = new ArrayList<>();
    counterMap.forEach((k, v) -> {
      if (v.equals(list.size())) {
        result.add(k);
      }
    });

    String[] resultArray = new String[result.size()];
    result.toArray(resultArray);
    return resultArray;
  }

  public static int firstNonRepeatingCharacter(String string) {

    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < string.length(); i++) {
      String letter = String.valueOf(string.charAt(i));
      if (map.containsKey(letter)) {
        map.put(letter, -1);
      } else {
        map.put(letter, i);
      }
    }

    List<Integer> list = new ArrayList<>(map.values());
    Collections.sort(list);

    for (Integer i : list) {
      if (i != -1) {
        return i;
      }
    }
    return -1;
  }

  public static int mostWordsFound(String[] sentences) {

    int max = 0;
    for (int i = 0; i < sentences.length; i++) {
      String[] words = sentences[i].split(" ");
      if (words.length > max) {
        max = words.length;
      }
    }

    return max;
  }

  public static int binaryToInteger(String number) {
    return Integer.parseInt(number, 2);
  }

  public static int firstOccurrence(String haystack, String needle) {
    return haystack.indexOf(needle);
  }
}

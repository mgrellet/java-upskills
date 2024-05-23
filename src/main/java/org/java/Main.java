package org.java;

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
}

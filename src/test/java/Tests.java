import org.java.Main;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

  @Test
  public void isEven_True() {
    Assert.assertTrue(Main.oddOrEven(2));
  }

  @Test
  public void isEven_False() {
    Assert.assertFalse(Main.oddOrEven(3));
  }

  /*==============================================*/

  @Test
  public void isPasswordComplex_True() {
    Assert.assertTrue(Main.isPasswordComplex("Abcdefgh1"));
  }

  @Test
  public void isPasswordComplex_False() {
    Assert.assertFalse(Main.isPasswordComplex("Abcdefg"));
  }

  @Test
  public void removeDuplicate() {
    int[] nums = {1, 1, 2};
    Assert.assertEquals(2, Main.removeDuplicate(nums));
  }

  @Test
  public void SquareEveryDigit_Test() {
    Assert.assertEquals(811181, Main.squareEveryDigit(9119));
    Assert.assertEquals(493625, Main.squareEveryDigit(765));
  }

  @Test
  public void XO_Test() {

    Assert.assertTrue(Main.XO("ooxx"));
    Assert.assertFalse(Main.XO("xooxx"));
    Assert.assertTrue(Main.XO("ooxXm"));
    Assert.assertTrue(Main.XO("zpzpzpp"));
    Assert.assertFalse(Main.XO("zzoo"));
    Assert.assertTrue(Main.XO("xxxooo"));
    Assert.assertTrue(Main.XO("xxxXooOo"));
    Assert.assertFalse(Main.XO("xxx23424esdsfvxXXOOooo"));
    Assert.assertFalse(Main.XO("xXxxoewrcoOoo"));
    Assert.assertFalse(Main.XO("XxxxooO"));
    Assert.assertTrue(Main.XO("zssddd"));
    Assert.assertFalse(Main.XO("Xxxxertr34"));
    Assert.assertTrue(Main.XO(""));
  }

  @Test
  public void commonCharacters_Test() {
    String[] strings = {"abc", "bdc", "cbaccd"};
    Assert.assertArrayEquals(new String[]{"b", "c"}, Main.commonCharacters(strings));
  }

  @Test
  public void firstNonRepeatingCharacter_Test() {
    Assert.assertEquals(1, Main.firstNonRepeatingCharacter("abcdcaf"));
    Assert.assertEquals(6, Main.firstNonRepeatingCharacter("faadabcbbebdf"));
  }

  @Test
  public void mostWordsFound_Test() {
    Assert.assertEquals(6,
        Main.mostWordsFound(new String[]{
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"}));
  }

  @Test
  public void binaryToInteger_Test() {
    Assert.assertEquals(5, Main.binaryToInteger("101"));
    Assert.assertEquals(11, Main.binaryToInteger("1011"));
  }

  @Test
  public void firstOccurrence_Test() {
    Assert.assertEquals(0, Main.firstOccurrence("sadbutsad", "sad"));
    Assert.assertEquals(-1, Main.firstOccurrence("leetcode", "leeto"));
  }

  @Test
  public void isUnique_Test() {
    Assert.assertTrue(Main.isUnique("acbdefg"));
    Assert.assertFalse(Main.isUnique("CrackingTheCode"));
  }

  @Test
  public void stringPermutation_Test() {
    Assert.assertTrue(Main.stringPermutation("ab", "ba"));
    Assert.assertFalse(Main.stringPermutation("ab", "b"));
    Assert.assertTrue(Main.stringPermutation("abcd", "dcba"));
  }

  @Test
  public void palindromePermutation_Test() {
    Assert.assertTrue(Main.palindromePermutation("Tact Coa"));
    Assert.assertFalse(Main.palindromePermutation("Tact Co"));
  }

  @Test
  public void scoreOfAString_Test(){
    Assert.assertEquals(13, Main.scoreOfAString("hello"));
    Assert.assertEquals(50, Main.scoreOfAString("zaz"));
  }

  @Test
  public void reverseString_Test(){
    char[] arr = {'h', 'e', 'l', 'l', 'o'};
    Assert.assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, Main.reverseString(arr));
  }

  @Test
  public void jewelsAndStones_Test(){
    Assert.assertEquals(3, Main.jewelsAndStones("aA", "aAAbbbb"));
    Assert.assertEquals(0, Main.jewelsAndStones("z", "ZZ"));
  }

}


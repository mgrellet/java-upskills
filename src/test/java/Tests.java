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
  public void isPasswordComplex_True(){
    Assert.assertTrue(Main.isPasswordComplex("Abcdefgh1"));
  }

  @Test
  public void isPasswordComplex_False(){
    Assert.assertFalse(Main.isPasswordComplex("Abcdefg"));
  }

}

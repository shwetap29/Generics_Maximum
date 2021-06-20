import com.bridgelabz.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {

    // TC 1.1 Given Max Number at First Position
    @Test
    public void givenFirstNumber_whenFirstNumberMaximum_shouldReturnMaximum() {
        Integer max = FindMaximum.compareMaximum(8, 4, 6);
        Assert.assertEquals((Integer) 8, max);
    }

    // TC 1.2 Given Max Number At Second position
    @Test
    public void givenSecondNumber_whenSecondNumberMaximum_shouldReturnMaximum() {
        Integer max = FindMaximum.compareMaximum(6, 8, 4);
        Assert.assertEquals((Integer) 8, max);
    }

    // TC 1.3 Given Max Number At Third position
    @Test
    public void givenThirdNumber_whenThirdNumberMaximum_shouldReturnMaximum() {
        Integer max = FindMaximum.compareMaximum(6, 4, 8);
        Assert.assertEquals((Integer) 8, max);
    }

    //Finding Maximum Float Value

    //Given 1st num Max Then Return Max
    @Test
    public void givenFloatNumber_whenFirstNumberMaximum_shouldReturnMaximum() {
        Float max = FindMaximum.compareMaximum(25f, 15f, 10f);
        Assert.assertEquals((Float) 25f, max);
    }
    //Given 2nd num Max Then Return Max

    @Test
    public void givenFloatNumber_whenSecondNumberMaximum_shouldReturnMaximum() {
        Float max = FindMaximum.compareMaximum(15f, 25f, 10f);
        Assert.assertEquals((Float) 25f, max);
    }
    // Given 3rd num Max Then Return Max

    @Test
    public void givenFloatNumber_whenThirdNumberMaximum_shouldReturnMaximum() {
        Float max = FindMaximum.compareMaximum(10f, 15f, 25f);
        Assert.assertEquals((Float) 25f, max);
    }

    //Finding Maximum String Value

    @Test
    public void givenString_whenFirstWord_shouldReturnMaximum() {
        String max = FindMaximum.compareMaximum("Peach", "Banana", "Apple");
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenString_whenSecondWord_shouldReturnMaximum() {
        String max = FindMaximum.compareMaximum("Banana", "Peach", "Apple");
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenString_whenThirdWord_shouldReturnMaximum() {
        String max = FindMaximum.compareMaximum("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", max);
    }
}

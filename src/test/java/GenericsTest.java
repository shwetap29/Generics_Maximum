import com.bridgelabz.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {

    // TC 1.1 Given Max Number at First Position
    @Test
    public void givenFirstNumber_whenFirstNumberMaximum_shouldReturnMaximum() {
        FindMaximum<Integer> findMaximum = new FindMaximum<>(8,4, 2);
        Integer max = findMaximum.compareMaximum();
        Assert.assertEquals((Integer) 8, max);
    }

    // TC 1.2 Given Max Number At Second position
    @Test
    public void givenSecondNumber_whenSecondNumberMaximum_shouldReturnMaximum() {
        FindMaximum<Integer> findMaximum = new FindMaximum<>(4,8, 2);
        Integer max =findMaximum.compareMaximum();
        Assert.assertEquals((Integer) 8, max);
    }

    // TC 1.3 Given Max Number At Third position
    @Test
    public void givenThirdNumber_whenThirdNumberMaximum_shouldReturnMaximum() {
        FindMaximum<Integer> findMaximum = new FindMaximum<>(4,8, 2);
        Integer max = findMaximum.compareMaximum();
        Assert.assertEquals((Integer) 8, max);
    }

    //Finding Maximum Float Value

    //Given 1st num Max Then Return Max
    @Test
    public void givenFloatNumber_whenFirstNumberMaximum_shouldReturnMaximum() {
        FindMaximum<Float> findMaximum = new FindMaximum<>(25f,10f, 15f);
        Float max = findMaximum.compareMaximum();
        Assert.assertEquals((Float) 25f, max);
    }
    //Given 2nd num Max Then Return Max

    @Test
    public void givenFloatNumber_whenSecondNumberMaximum_shouldReturnMaximum() {
        FindMaximum<Float> findMaximum = new FindMaximum<>(10f,25f, 15f);
        Float max =  findMaximum.compareMaximum();
        Assert.assertEquals((Float) 25f, max);
    }
    // Given 3rd num Max Then Return Max

    @Test
    public void givenFloatNumber_whenThirdNumberMaximum_shouldReturnMaximum() {
        FindMaximum<Float> findMaximum = new FindMaximum<>(15f,10f, 25f);
        Float max = findMaximum.compareMaximum();
        Assert.assertEquals((Float) 25f, max);
    }

    //Finding Maximum String Value

    @Test
    public void givenString_whenFirstWord_shouldReturnMaximum() {
        FindMaximum<String> findMaximum = new FindMaximum<>("Peach","Banana","Apple");
        String max = findMaximum.compareMaximum();
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenString_whenSecondWord_shouldReturnMaximum() {
        FindMaximum<String> findMaximum = new FindMaximum<>("Banana","Peach","Apple");
        String max = findMaximum.compareMaximum();
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenString_whenThirdWord_shouldReturnMaximum() {
        FindMaximum<String> findMaximum = new FindMaximum<>("Apple","Banana","Peach");
        String max = findMaximum.compareMaximum();
        Assert.assertEquals("Peach", max);
    }

    //To Accept More Than 3 Parameters

    @Test
    public void givenMultipleInt_shouldReturn_maxInt() {
        Assert.assertSame(40, new FindMaximum<>(10, 20, 30, 40).testMax());
    }

    @Test
    public void  givenMultipleFloat_shouldReturn_maxFloat() {
        Assert.assertEquals((Float) 40.4485f, new FindMaximum<>(10.5423f, 20.48452f, 30.345f, 40.4485f).testMax());
    }

    @Test
    public void  givenMultipleString_shouldReturn_maxString() {
        Assert.assertEquals("peach", new FindMaximum<>("peach", "banana", "apple", "coconut").testMax());
    }
}

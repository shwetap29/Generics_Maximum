import com.bridgelabz.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {

    // TC for Maximum Of Integer With 3 parameters
    @Test
    public void givenFirstNumber_whenFirstNumberMaximum_shouldReturnMaximum() {
        FindMaximum<Integer> findMaximum = new FindMaximum<>(8,4, 2);
        Integer max = findMaximum.compareMaximum();
        Assert.assertEquals((Integer) 8, max);
    }


    @Test
    public void givenSecondNumber_whenSecondNumberMaximum_shouldReturnMaximum() {
        FindMaximum<Integer> findMaximum = new FindMaximum<>(4,8, 2);
        Integer max =findMaximum.compareMaximum();
        Assert.assertEquals((Integer) 8, max);
    }


    @Test
    public void givenThirdNumber_whenThirdNumberMaximum_shouldReturnMaximum() {
        FindMaximum<Integer> findMaximum = new FindMaximum<>(4,8, 2);
        Integer max = findMaximum.compareMaximum();
        Assert.assertEquals((Integer) 8, max);
    }

    //TC For Finding Maximum of Float Value with 3 parameters
    @Test
    public void givenFloatNumber_whenFirstNumberMaximum_shouldReturnMaximum() {
        FindMaximum<Float> findMaximum = new FindMaximum<>(25f,10f, 15f);
        Float max = findMaximum.compareMaximum();
        Assert.assertEquals((Float) 25f, max);
    }


    @Test
    public void givenFloatNumber_whenSecondNumberMaximum_shouldReturnMaximum() {
        FindMaximum<Float> findMaximum = new FindMaximum<>(10f,25f, 15f);
        Float max =  findMaximum.compareMaximum();
        Assert.assertEquals((Float) 25f, max);
    }


    @Test
    public void givenFloatNumber_whenThirdNumberMaximum_shouldReturnMaximum() {
        FindMaximum<Float> findMaximum = new FindMaximum<>(15f,10f, 25f);
        Float max = findMaximum.compareMaximum();
        Assert.assertEquals((Float) 25f, max);
    }

    //TC For Finding Maximum of String Value with 3 parameters

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

    //Test case for Maximum with 4 parameters

    @Test
    public void givenMultipleInt_shouldReturn_maxInt() {
        Assert.assertSame(40, new FindMaximum<>(10, 20, 30, 40).testMax());
    }

    @Test
    public void  givenMultipleFloat_shouldReturn_maxFloat() {
        Assert.assertEquals((Float) 25f, new FindMaximum<>(25f, 10f, 15f, 5f).testMax());
    }

    @Test
    public void  givenMultipleString_shouldReturn_maxString() {
        Assert.assertEquals("peach", new FindMaximum<>("peach", "banana", "apple", "coconut").testMax());
    }
}

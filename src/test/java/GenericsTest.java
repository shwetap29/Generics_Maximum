import com.bridgelabz.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {
    FindMaximum findMaximum = new FindMaximum();
// TC 1.1 Given Max Number at First Position
    @Test
    public void givenFirstNumber_whenFirstNumberMaximum_shouldReturnMaximum(){
        Integer max = FindMaximum.compareIntegerMaximum(8,4,6);
        Assert.assertEquals((Integer)8,max);
    }
// TC 1.2 Given Max Number At Second position
    @Test
    public void givenSecondNumber_whenSecondNumberMaximum_shouldReturnMaximum(){
        Integer max = FindMaximum.compareIntegerMaximum(6,8,4);
        Assert.assertEquals((Integer)8,max);
    }
   // TC 1.3 Given Max Number At Third position
    @Test
    public void givenThirdNumber_whenThirdNumberMaximum_shouldReturnMaximum(){
        Integer max = FindMaximum.compareIntegerMaximum(6,4,8);
        Assert.assertEquals((Integer)8,max);
    }
}

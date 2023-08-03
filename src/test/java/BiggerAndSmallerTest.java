import org.example.BiggerAndSmaller;
import org.junit.Assert;
import org.junit.Test;


public class BiggerAndSmallerTest {
    @Test
    public void Incorder() {
        BiggerAndSmaller bas = new BiggerAndSmaller();
        bas.find(new int[]{2, 3, 9});
        Assert.assertEquals(2, bas.smaller());
        Assert.assertEquals(9, bas.bigger());
    }
    @Test
    public void anyorder() {
        BiggerAndSmaller bas = new BiggerAndSmaller();
        bas.find(new int[]{5, 4, 10, 2});
        Assert.assertEquals(2, bas.smaller());
        Assert.assertEquals(10, bas.bigger());
    }

    @Test
    public void decOrder() {
        BiggerAndSmaller bas = new BiggerAndSmaller();
        bas.find(new int[]{50, 40, 10, 2});
        Assert.assertEquals(2, bas.smaller());
        Assert.assertEquals(50, bas.bigger());
    }
}

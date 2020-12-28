import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    private int[] emptyArray = new int [0];
    private int[] onlyPositive = new int[]{8,1,8,1,9,3,4,3,4};
    private int[] onlyNegative = new int[]{8,1,8,1,9,3,4,3,4};
    private int[] mixNegativePositive = new int[]{-1,1,1,5,5,-1,9};
    private int[] nonUnique = new int[]{8,8,8,8,8,8,8,8};
    private int[] oneElement = new int[]{9};

    @Test
    public void findUniqueTest(){
        Assert.assertEquals(0, Main.findUnique(emptyArray));
        Assert.assertEquals(9, Main.findUnique(onlyPositive));
        Assert.assertEquals(9, Main.findUnique(onlyNegative));
        Assert.assertEquals(9, Main.findUnique(mixNegativePositive));
        Assert.assertEquals(-1, Main.findUnique(nonUnique));
        Assert.assertEquals(9, Main.findUnique(oneElement));
    }
    @Test
    public void findUniqueWithoutMapTest(){
        Assert.assertEquals(0, Main.findUniqueWithoutMap(emptyArray));
        Assert.assertEquals(9, Main.findUniqueWithoutMap(onlyPositive));
        Assert.assertEquals(9, Main.findUniqueWithoutMap(onlyNegative));
        Assert.assertEquals(9, Main.findUniqueWithoutMap(mixNegativePositive));
        Assert.assertEquals(-1, Main.findUniqueWithoutMap(nonUnique));
        Assert.assertEquals(9, Main.findUniqueWithoutMap(oneElement));
    }
}

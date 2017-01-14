package bxtr.test;
import bxtr.GridCell;
import bxtr.GridCellFactory;
import bxtr.One;
import bxtr.Zero;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by basic on 14.01.2017.
 */
public class ToStringTest {
    @Test
    public void OneToString() {
        One one = (One) GridCellFactory.create(GridCell.One);
        Assert.assertNotNull(one);
        Assert.assertEquals("1", one.toString());
    }

    @Test
    public void ZeroToString() {
        Zero zero = (Zero) GridCellFactory.create(GridCell.Zero);
        Assert.assertNotNull(zero);
        Assert.assertEquals("2", zero.toString());
    }
}

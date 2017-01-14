package bxtr.test;
import bxtr.GridCell;
import bxtr.GridCellFactory;
import bxtr.One;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by basic on 14.01.2017.
 */
public class ToStringTest {
    @Test
    public void OneToString() {
        One one = GridCellFactory.create(GridCell.One);
        Assert.assertEquals("1", one.toString());
    }
}

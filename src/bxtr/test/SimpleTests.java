package bxtr.test;
import bxtr.*;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by basic on 14.01.2017.
 */
public class SimpleTests {
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
        Assert.assertEquals("0", zero.toString());
    }



    @Test
    public void AlgebraicMultipleOneToZero() {
        One one = (One) GridCellFactory.create(GridCell.One);
        Zero zero = (Zero) GridCellFactory.create(GridCell.Zero);
        Assert.assertEquals("0", AlgebraicOperation.multiple(one, zero).toString());
    }

    @Test
    public void AlgebraicMultipleZeroToZero() {
        Zero zero = (Zero) GridCellFactory.create(GridCell.Zero);
        Assert.assertEquals("0", AlgebraicOperation.multiple(zero, zero).toString());
    }

    @Test
    public void AlgebraicMultipleOneToOne() {
        One one = (One) GridCellFactory.create(GridCell.One);
        Assert.assertEquals("1", AlgebraicOperation.multiple(one, one).toString());
    }

    @Test
    public void AlgebraicSubtractionOneToZero() {
        One one = (One)GridCellFactory.create(GridCell.One);
        Zero zero = (Zero) GridCellFactory.create(GridCell.Zero);
        Assert.assertEquals("1", AlgebraicOperation.substraction(one, zero).toString());
    }

    @Test
    public void AlgebraicAdditionOneToZero() {
        One one = (One)GridCellFactory.create(GridCell.One);
        Zero zero = (Zero) GridCellFactory.create(GridCell.Zero);
        Assert.assertEquals("1", AlgebraicOperation.addition(one, zero).toString());
    }

    @Test
    public void RowCreateTest() {
        GridRow zeroGridRow = GridRow.newZeroGridRow();
        Assert.assertEquals(Answer.YES, zeroGridRow.values().isZeroRow());
    }

    @Test
    public void FourCellRowWhenNewZeroGridWithFour() {

    }

    @Test
    public void ZeroRowMultipleTest() {
        GridRow oneGridRow = GridRow.newZeroGridRow(4);
        GridRow secondGridRow = GridRow.newZeroGridRow(4);
        Assert.assertEquals("#[0][0][0][0]#", AlgebraicOperation.multiple(oneGridRow, secondGridRow).toString());
    }

    @Test
    public void ZeroAndOneRowAdditionalTest() {
        GridRow oneGridRow = GridRow.newZeroGridRow(4);
        GridRow secondGridRow = GridRow.newOneGridRow(4);
        Assert.assertEquals("#[1][1][1][1]#", AlgebraicOperation.addition(oneGridRow, secondGridRow).toString());
    }

    @Test
    public void AddTwoDimensionalZeroMatrixTest(){
        Matrix newZeroMatrix = Matrix.newZeroMatrix(2, 2);
        Assert.assertArrayEquals("[0,0],[0,0]", newZeroMatrix.toString());
    }


}


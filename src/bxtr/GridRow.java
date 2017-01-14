package bxtr;

/**
 * Created by basic on 14.01.2017.
 */
public class GridRow {

    public static GridRow newZeroGridRow() {
        return new RowValue();
    }

    public static GridRow newZeroGridRow(int size) {
        return new RowValue(4, GridCell.Zero);
    }

    public static GridRow newOneGridRow(int size) {
        return new RowValue(4, GridCell.One);
    }

    public Values values() {
        return new Values();
    }
}

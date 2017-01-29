package bxtr;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by basic on 30.01.2017.
 */
public class Matrix {

    private List<GridRow> rowList;

    private Matrix() {
        rowList = new ArrayList<>();
    }

    public static Matrix newZeroMatrix(int rowSize, int columnSize) {
        Matrix matrix = new Matrix();
        for(int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
            matrix.rowList.add(GridRow.newZeroGridRow(rowSize));
        }
        return matrix;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for(GridRow row : rowList) {
            buffer.append(row.toString());
            buffer.append("\n");
        }
        return buffer.toString();
    }

}

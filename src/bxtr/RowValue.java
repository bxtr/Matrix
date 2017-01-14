package bxtr;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by basic on 14.01.2017.
 */
public class RowValue extends GridRow {
    private List<Value> rowList;

    RowValue() {
        this(0);
    }

    RowValue(int count){
        rowList = new ArrayList<>();
        for(int index=0; index<count; index++) {
            rowList.add(GridCellFactory.create(GridCell.Zero));
        }
    }

    RowValue(int count, GridCell gridCell) {
        rowList = new ArrayList<>();
        switch (gridCell) {
            case Zero:
                for(int index=0; index<count; index++) {
                    rowList.add(GridCellFactory.create(GridCell.Zero));
                }
                return;
            case One:
                for(int index=0; index<count; index++) {
                    rowList.add(GridCellFactory.create(GridCell.One));
                }
                return;
        }
    }

    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer().append("#");
        for(Value cell : rowList) {
            buf.append("[").append(cell.toString()).append("]");
        }
        return buf.append("#").toString();
    }
}

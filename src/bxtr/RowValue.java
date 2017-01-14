package bxtr;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by basic on 14.01.2017.
 */
public class RowValue extends Value {
    private List<GridCell> rowList;

    RowValue(){
        rowList = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer().append("#");
        for(GridCell cell : rowList) {
            buf.append("[").append(cell.toString()).append("]");
        }
        return buf.append("#").toString();
    }
}

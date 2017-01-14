package bxtr;

/**
 * Created by basic on 14.01.2017.
 */
public enum GridCell {

    One(One.class);

    private Class cellClass;

    public Class get() {
        return cellClass;
    }

    GridCell(Class cellClass) {
            this.cellClass = cellClass;
    }

}

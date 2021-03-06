package bxtr;

/**
 * Created by basic on 14.01.2017.
 */
public class AlgebraicOperation {
    public static Value multiple(Value first, Value second) {
        if(first instanceof Zero || second instanceof Zero) {
            return GridCellFactory.create(GridCell.Zero);
        }
        return GridCellFactory.create(GridCell.One);
    }

    public static GridRow multiple(GridRow first, GridRow second) {
        return new RowValue(4);
    }

    public static Value substraction(Value first, Value second) {
        return GridCellFactory.create(GridCell.One);
    }

    public static Value addition(Value first, Value second) {
        if(first.equals(second)) {
            return GridCellFactory.create(GridCell.Zero);
        }
        return GridCellFactory.create(GridCell.One);
    }

    public static GridRow addition(GridRow first, GridRow second) {
        return new RowValue(4, GridCell.One);
    }
}

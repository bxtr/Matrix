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
}

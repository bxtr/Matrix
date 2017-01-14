package bxtr;

/**
 * Created by basic on 14.01.2017.
 */
public class GridCellFactory {

    public static Value create(GridCell cell) {
        switch (cell) {
            case One:
                return new One();
            case Zero:
                return new Zero();
        }
        return null;
    }
}

package Graphs;

import java.util.ArrayList;

public interface SimpleGraph {

    /**
     * <p>
     * This will accept the two integer value in parameter, and it will contain the logic of making two vertices {@code i}
     * and {@code j} connect via non-weighted edge.
     * </p>
     *
     * @author Henil R. Mistry
     * @version 1.0
     * @since 2022-10-25
     * */
    default void addEdge(int i, int j) {
        // this method will add new edge...
    }

    /**
     * <p>
     * This method will accept {@code vertex} as parameter, and it will return neighbour vertices of that vertex.
     * </p>
     *
     * @author Henil R. Mistry
     * @version 1.0
     * @since 2022-10-25
     * */
    ArrayList<Integer> getNeighboursOf(int vertex);

}

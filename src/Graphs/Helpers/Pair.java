package Graphs.Helpers;

import java.util.Comparator;

public class Pair implements Comparator<Pair> {

    public int u,v;

    public Pair() {

    }

    public Pair(int u, int v) {
        this.u = u;
        this.v = v;
    }

    /**
     * <p>
     *    This will return the difference between second point {@code v}.
     * </p>
     * */
    @Override
    public int compare(Pair o1, Pair o2) {
        return o1.v - o2.v;
    }
}

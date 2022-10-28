package Graphs;

import Graphs.Exceptions.InvalidEdgeException;
import Graphs.Helpers.Pair;

import java.util.ArrayList;

public abstract class Graph implements SimpleGraph {

    // initial setup of edges in this graph...
    public static final int WEIGHTED_EDGE = 1;
    public static final int NON_WEIGHTED_EDGE = 2;
    public int EDGE_TYPE = NON_WEIGHTED_EDGE;

    public Integer vertices;
    protected ArrayList<ArrayList<Integer>> adj_list;
    protected ArrayList<ArrayList<Pair>> weighted_adj_list;

    // ======================================= CONSTRUCTORS ============================================================
    public Graph(int vertices, int edge_type) throws InvalidEdgeException {
        this.EDGE_TYPE = edge_type;
        this.vertices = vertices;
        if (this.EDGE_TYPE == NON_WEIGHTED_EDGE) {
            this.adj_list = new ArrayList<>();
            for (int i=0; i<this.vertices; i++) {
                this.adj_list.add(new ArrayList<>());
            }
        } else if (this.EDGE_TYPE == WEIGHTED_EDGE){
            this.weighted_adj_list = new ArrayList<>();
            for (int i=0; i<this.vertices; i++) {
                this.weighted_adj_list.add(new ArrayList<>());
            }
        } else {
            throw new InvalidEdgeException();
        }

    }

    public Graph(int vertices) throws InvalidEdgeException {
        this(vertices, NON_WEIGHTED_EDGE);
    }

    @Override
    public ArrayList<Integer> getNeighboursOf(int vertex) {
        if (this.EDGE_TYPE == NON_WEIGHTED_EDGE) {
            return this.adj_list.get(vertex);
        } else {
            ArrayList<Integer> neighbours = new ArrayList<>();
            for (Pair neighbour : this.weighted_adj_list.get(vertex)) {
                neighbours.add(neighbour.u);
            }
            return neighbours;
        }
    }
}

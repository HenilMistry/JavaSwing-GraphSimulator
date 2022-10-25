package Graphs.UndirectedGraph;

import Graphs.Exceptions.InvalidEdgeException;
import Graphs.Graph;

import java.util.ArrayList;

public class UndirectedGraph extends Graph {

    public UndirectedGraph(int vertices) throws InvalidEdgeException {
        super(vertices, NON_WEIGHTED_EDGE);
    }

    @Override
    public void addEdge(int i, int j) {
        this.adj_list.get(i).add(j);
        this.adj_list.get(j).add(i);
    }

    public ArrayList<Integer> getConnectedVertices(int vertex) {
        return this.adj_list.get(vertex);
    }
}

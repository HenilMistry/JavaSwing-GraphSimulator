package Graphs.Exceptions;

public class InvalidEdgeException extends Exception {

    public InvalidEdgeException() {
        super("The passed edge type is invalid!");
    }

    public InvalidEdgeException(String str) {
        super(str);
    }
}

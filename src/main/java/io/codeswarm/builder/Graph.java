package io.codeswarm.builder;

import java.util.List;

public class Graph<T> {

    private final List<Vertex<T>> vertices;
    private final List<Edge<T>> edges;

    public Graph(Builder<T> builder) {
        this.vertices = builder.vertices;
        this.edges = builder.edges;
    }

    @Override
    public String toString() {
        return "Vertices: " + vertices.toString() + "\n" + "Edges: " + edges.toString();
    }

    public static class Builder<T> {

        private List<Vertex<T>> vertices;
        private List<Edge<T>> edges;

        public static <T> Builder<T> create() {
            return new Builder<>();
        }

        public Builder<T> setVerticesList(List<Vertex<T>> vertices) {
            this.vertices = vertices;
            return this;
        }

        public Builder<T> setEdgesList(List<Edge<T>> edges) {
            this.edges = edges;
            return this;
        }

        public Graph<T> build() {
            return new Graph<>(this);
        }
    }
}

package io.codeswarm.builder;

public class Edge<T> {

    private final Integer id;
    private final Vertex<T> source;
    private final Vertex<T> destination;
    private final Integer weight;

    public Edge(Builder<T> builder) {
        this.id = builder.id;
        this.source = builder.source;
        this.destination = builder.destination;
        this.weight = builder.weight;
    }

    @Override
    public String toString() {
        return "Id: " + id + " source: " + source + " destination: " + destination + " weight: " + weight;
    }

    public static class Builder<T> {

        private Integer id;
        private Vertex<T> source;
        private Vertex<T> destination;
        private Integer weight;

        public static <T> Builder<T> create() {
            return new Builder<>();
        }

        public Builder<T> setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder<T> setSource(Vertex<T> source) {
            this.source = source;
            return this;
        }

        public Builder<T> setDestination(Vertex<T> destination) {
            this.destination = destination;
            return this;
        }

        public Builder<T> setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public Edge<T> build() {
            return new Edge<>(this);
        }
    }
}

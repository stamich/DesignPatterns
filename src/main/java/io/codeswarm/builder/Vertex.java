package io.codeswarm.builder;

public class Vertex<T> {

    private final Integer id;
    private final T value;

    public Vertex (Builder<T> builder) {
        this.id = builder.id;
        this.value = builder.value;
    }

    @Override
    public String toString() {
        return "Id: " + id + " value: " + value.toString();
    }

    public static class Builder<T> {

        private Integer id;
        private T value;

        public static <T> Builder<T> create() {
            return new Builder<>();
        }

        public Builder<T> setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder<T> setValue(T value) {
            this.value = value;
            return this;
        }

        public Vertex<T> build() {
            return new Vertex<>(this);
        }
    }
}

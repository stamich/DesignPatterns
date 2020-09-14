package io.codeswarm.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vertex<Integer> vn0 = Vertex.Builder.<Integer>create().setId(1).setValue(10).build();
        Vertex<Integer> vn1 = Vertex.Builder.<Integer>create().setId(2).setValue(20).build();
        Vertex<Integer> vn2 = Vertex.Builder.<Integer>create().setId(3).setValue(25).build();
        Vertex<Integer> vn3 = Vertex.Builder.<Integer>create().setId(4).setValue(30).build();
        List<Vertex<Integer>> vertices = new ArrayList<>();
        Collections.addAll(vertices, vn0, vn1, vn2, vn3);

        Edge<Integer> en0 = Edge.Builder.<Integer>create().setId(1).setSource(vn0).setDestination(vn1).setWeight(2).build();
        Edge<Integer> en1 = Edge.Builder.<Integer>create().setId(2).setSource(vn1).setDestination(vn2).setWeight(2).build();
        Edge<Integer> en2 = Edge.Builder.<Integer>create().setId(3).setSource(vn0).setDestination(vn3).setWeight(1).build();
        List<Edge<Integer>> edges = new ArrayList<>();
        Collections.addAll(edges, en0, en1, en2);

        Graph<Integer> g0 = Graph.Builder.<Integer>create().setVerticesList(vertices).setEdgesList(edges).build();

        System.out.println(g0);

    }
}

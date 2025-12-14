package org.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Graph
{
    int vertices;
    List<List<Integer>> adjList;

    Graph(int vertices)
    {
        this.vertices = vertices;
        adjList = new ArrayList<List<Integer>>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    void addEdge(int source, int destination)
    {
        adjList.get(source).add(destination);
    }

    List<Integer>  getAdj(int vertex)
    {
        return adjList.get(vertex);
    }

    int  getVertices()
    {
        return vertices;
    }

}

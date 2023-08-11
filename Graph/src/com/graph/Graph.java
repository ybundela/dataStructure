package com.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    private HashMap<String, ArrayList<String>> graphDetails = new HashMap<>();

    public boolean addVertex(String vertex){
        if(graphDetails.get(vertex) == null){
            graphDetails.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public void printGraph(){
        System.out.println(graphDetails);
    }

    public boolean addEdges(String vertex1, String vertex2){
        if(graphDetails.get(vertex1) != null && graphDetails.get(vertex2) != null){
            graphDetails.get(vertex1).add(vertex2);
            graphDetails.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdges(String vertex1, String vertex2){
        if(graphDetails.get(vertex1) != null && graphDetails.get(vertex2) != null){
            graphDetails.get(vertex1).remove(vertex2);
            graphDetails.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if(graphDetails.get(vertex) == null)return false;
        for(String otherVertex :graphDetails.get(vertex) ){
            graphDetails.get(otherVertex).remove(vertex);
        }
        graphDetails.remove(vertex);
        return true;
    }
}

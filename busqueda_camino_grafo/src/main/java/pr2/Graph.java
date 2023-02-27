/***********************************************************************
 *        Copyright 2023 Jorge Alejandro
 *
 *        Licensed under the Apache License, Version 2.0 (the "License");
 *        you may not use this file except in compliance with the License.
 *        You may obtain a copy of the License at*
 *        http://www.apache.org/licenses/LICENSE-2.0
 *        Unless required by applicable law or agreed to in writing,
 *        software distributed under the License is distributed on an
 *        "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *        either express or implied. See the License for the specific
 *        language governing permissions and limitations under the
 *        License.
 **********************************************************************************/

package pr2;

import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;

public class Graph <V>{
    private Map<V, Set<V>> adjacencyList = new HashMap<>();
    public boolean addVertex( V v){
        return true;
    }
    public boolean addEdge(V v1, V v2){
        return true;
    }
    public Set<V> obtainAdjacents(V v){
        return null;
    }

    public boolean containsVertex(V v){
        return true;
    }

    @Override
    public String toString(){
        return "";
    }

    public List<V> onePath(V v1, V v2) {

        // Crea una tabla llamada traza
        // Crea una pila llamada abierta

        Deque<V> abierta = new ArrayDeque<>();
        abierta.push(v1);

        List<V> traza = new ArrayList<>();
        while (!abierta.isEmpty()) {
            V v = abierta.pop();
            if (v == v2) {
                return traza;
            }
            for (V s : obtainAdjacents(v)) {
                if (!traza.contains(s)) {
                    traza.add((Integer) s, v);
                    abierta.push(s);
                }
            }
        }
        if (!traza.contains(v2)) {

        } else {
            return null;
        }

        return null;
    }
    

    @Test
    public void onePatchFindsAPatch(){
        System.out.println("\nTest onePatchFindsAPatch");
        System.out.println("------------------------");

        Graph<Integer> g = new Graph<>();
        g.addEdge(1,2);
        g.addEdge(3,4);
        g.addEdge(1,5);
        g.addEdge(5,6);
        g.addEdge(6,4);

        List<Integer> expectedPath = new ArrayList<>();
        expectedPath.add(1);
        expectedPath.add(5);
        expectedPath.add(6);
        expectedPath.add(4);

        assertEquals(expectedPath, g.onePath(1,4));
    }


}
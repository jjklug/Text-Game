//package gameplay;
//import java.util.ArrayList;
//public class Graph {
//
//    private ArrayList<Room> nodes;
//    private ArrayList<ArrayList<String>> edges;
//
//    //constructor
//    Graph(ArrayList<Room> nodes, ArrayList<ArrayList<String>> edges){
//        this.nodes = nodes;
//        this.edges = edges;
//    }
//
//    public ArrayList<Room> getRooms(){
//        return nodes;
//    }
//
//    public ArrayList<ArrayList<String>> getEdges(){
//        return edges;
//    }
//
//    public void addRoom(Room node) {
//        //checks for duplicates and then adds node
//        if (!nodes.contains(node)) {
//            nodes.add(node);
//
//            //adds new node to edges list with no edges attached
//            ArrayList<String> newRoom = new ArrayList<String>();
//            //newRoom.add(node.getLabel());
//            edges.add(newRoom);
//        }
//
//    }
//
//    //add edge( node, second node)
//    //create an edge between these nodes
//    public void addEdge(Room n1, Room n2) {
//        String node1 = n1.getLabel();
//        String node2 = n2.getLabel();
//        boolean duplicate = false;
//        for(int x = 0; x < edges.size(); x++){
//            if(edges.get(x).get(0).equals(node1)){
//                for(int z = 1; z < edges.get(x).size(); z++){
//                    if(edges.get(x).get(z).equals(node2)){
//                        duplicate = true;
//                    }
//                }
//                if(!duplicate){
//                    edges.get(x).add(node2);
//                }
//                duplicate = false;
//            }
//            if(edges.get(x).get(0).equals(node2)){
//                for(int z = 1; z < edges.get(x).size(); z++){
//                    if(edges.get(x).get(z).equals(node1)){
//                        duplicate = true;
//                    }
//                }
//                if(!duplicate){
//                    edges.get(x).add(node1);
//                }
//                duplicate = false;
//            }
//        }
//
//    }
//
//}

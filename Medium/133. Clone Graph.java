class Solution {
    Map<Node, Node> map = new HashMap<>();
    public Node find(Node node){
        if(map.containsKey(node)){
            return map.get(node);
        }

        Node ans = new Node(node.val);
        map.put(node, ans);
        // System.out.println("node = "+node.val);
        
        for(Node i:node.neighbors){
            ans.neighbors.add(find(i));
        }

        return ans;
    }
    public Node cloneGraph(Node node) {
        // Node ans = new Node(node.val);
        if(node==null){
            return null;
        }
        return find(node);
    }
}

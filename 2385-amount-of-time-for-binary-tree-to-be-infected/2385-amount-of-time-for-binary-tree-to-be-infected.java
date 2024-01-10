class Solution {
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        make(root, null, map);
        Set<Integer> vis = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        int ans = -1;
        
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int node = q.poll();
                vis.add(node);
                for (int j : map.get(node)) {
                    if (vis.contains(j)) {
                        continue;
                    }
                    q.add(j);
                }
            }
            ans++;
        }
        return ans;
    }

    public void make(TreeNode root, TreeNode par, Map<Integer, Set<Integer>> map) {
        if (root == null) {
            return;
        }
        
        if (!map.containsKey(root.val)) {
            map.put(root.val, new HashSet<>());
        }
        
        if (par != null) {
            if (!map.containsKey(par.val)) {
                map.put(par.val, new HashSet<>());
            }
            map.get(par.val).add(root.val);
            map.get(root.val).add(par.val);
        }

        if (root.left != null) {
            if (!map.containsKey(root.left.val)) {
                map.put(root.left.val, new HashSet<>());
            }
            map.get(root.left.val).add(root.val);
            map.get(root.val).add(root.left.val);
        }

        if (root.right != null) {
            if (!map.containsKey(root.right.val)) {
                map.put(root.right.val, new HashSet<>());
            }
            map.get(root.right.val).add(root.val);
            map.get(root.val).add(root.right.val);
        }
        
        make(root.left, root, map);
        make(root.right, root, map);
    }
}

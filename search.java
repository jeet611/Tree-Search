// A utility function to search a given key in BST 
public Node search(Node root, int key) 
{ 
	// Base Cases: root is null or key is present at root 
	if (root==null || root.key==key) 
		return root;  

	// val is less than root's key 
	return search(root.right, key); 
} 

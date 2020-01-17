package com.rakesh.datastructures.binarytree;

import java.util.LinkedList;

/**
 * Created by rakesh at Apr 26, 2018 10:51:11 PM
 */
public class SerializeDeserialize {
	
	public static void main(String[] a) {

		BTreeNode tree = new BTreeNode(1);
		tree.left = new BTreeNode(2);
		tree.right = new BTreeNode(3);
		tree.right.left = new BTreeNode(4);
		tree.right.right = new BTreeNode(5);
		//tree.right.left = new BTreeNode(9);
		System.out.println(new SerializeDeserialize().serialize(tree));
	}

	public String serialize(BTreeNode root) {
	    if(root==null){
	        return "";
	    }
	 
	    StringBuilder sb = new StringBuilder();
	 
	    LinkedList<BTreeNode> queue = new LinkedList<BTreeNode>();
	 
	    queue.add(root);
	    while(!queue.isEmpty()){
	    	BTreeNode t = queue.poll();
	        if(t!=null){
	            sb.append(String.valueOf(t.data) + ",");
	            queue.add(t.left);
	            queue.add(t.right);
	        }else{
	            sb.append("#,");
	        }
	    }
	 
	    sb.deleteCharAt(sb.length()-1);
	    System.out.println(sb.toString());
	    return sb.toString();
	}
	 
	// Decodes your encoded data to tree.
	public BTreeNode deserialize(String data) {
	    if(data==null || data.length()==0)
	        return null;
	 
	    String[] arr = data.split(",");
	    BTreeNode root = new BTreeNode(Integer.parseInt(arr[0]));
	 
	 
	    LinkedList<BTreeNode> queue = new LinkedList<BTreeNode>();
	    queue.add(root);
	 
	    int i=1;
	    while(!queue.isEmpty()){
	    	BTreeNode t = queue.poll();
	 
	        if(t==null)
	            continue;
	 
	        if(!arr[i].equals("#")){
	            t.left = new BTreeNode(Integer.parseInt(arr[i]));    
	            queue.offer(t.left);
	 
	        }else{
	            t.left = null;
	            queue.offer(null);
	        }
	        i++;
	 
	        if(!arr[i].equals("#")){
	            t.right = new BTreeNode(Integer.parseInt(arr[i]));    
	            queue.offer(t.right);
	 
	        }else{
	            t.right = null;
	            queue.offer(null);
	        }
	        i++;
	    }
	 
	    return root;
	}
}

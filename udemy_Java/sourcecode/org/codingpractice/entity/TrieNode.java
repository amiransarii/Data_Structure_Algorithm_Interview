package org.codingpractice.entity;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
 
	private Map<Character, TrieNode> children;
	private boolean endOfWord;
	
	
	//constructor
		 public TrieNode() {
			 children = new HashMap<Character, TrieNode>();
			 endOfWord = false;
		 }
		
		 
	public Map<Character, TrieNode> getChildren() {
		return children;
	}


	public void setChildren(Character ch,TrieNode node) {
		 this.children.put(ch, node);
	}


	public boolean isEndOfWord() {
		return endOfWord;
	}


	public void setEndOfWord(boolean endOfWord) {
		this.endOfWord = endOfWord;
	}


	
	
	
	
	
}

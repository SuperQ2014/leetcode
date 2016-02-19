package skyler.tao.leetcode;

import java.util.HashMap;

public class LRUCache<K, V> {

	class Node <T, U> {
		Node<T, U> previous;
		Node<T, U> next;
		
		T key;
		U value;
		
		public Node(Node<T, U> previous, Node<T, U> next, T key, U value) {
			this.previous = previous;
			this.next = next;
			this.key = key;
			this.value = value;
		}
	}

	private HashMap<K, Node<K, V>> cache;
	private Node<K, V> leastRecentlyUsed;
	private Node<K, V> mostRecentlyUsed;
	private int maxSize;
	private int currentSize;
	
	public LRUCache(int maxSize) {
		this.maxSize = maxSize;
		this.currentSize = 0;
		leastRecentlyUsed = new Node<K, V>(null, null, null, null);
		mostRecentlyUsed = leastRecentlyUsed;
		cache = new HashMap<K, Node<K, V>>();
	}
	
	public V get(K key) {
		Node<K, V> tempNode = cache.get(key);
		if (tempNode == null) {
			return null;
		} else if (tempNode.key == mostRecentlyUsed.key) {
			return mostRecentlyUsed.value;
		}
		
		tempNode.previous = mostRecentlyUsed;
		mostRecentlyUsed.next = tempNode;
		mostRecentlyUsed = tempNode;
		mostRecentlyUsed.next = null;
		
		return tempNode.value;
	}
	
	public void set(K key, V value) {
		if (cache.containsKey(key)) {
//			Node<K, V> tempNode = cache.get(key);
//			tempNode.value = value;
			return;
		}
		
		Node<K, V> myNode = new Node<K, V>(mostRecentlyUsed, null, key, value);
		mostRecentlyUsed.next = myNode;
		cache.put(key, myNode);
		mostRecentlyUsed = myNode;
		
		if (currentSize == maxSize) {
			cache.remove(leastRecentlyUsed.key);
			leastRecentlyUsed = leastRecentlyUsed.next;
			leastRecentlyUsed.previous = null;
		} else if (currentSize < maxSize) {
			if (currentSize == 0) {
				leastRecentlyUsed = myNode;
			}
			currentSize++;
		}
	}
}

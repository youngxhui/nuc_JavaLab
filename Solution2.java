package task2;

import java.util.*;


public class Solution {
	public static void main(String[] args){
		
		List<Integer> list=new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(3);
		
		ListIterator<Integer> it=(ListIterator<Integer>) list.iterator();
		while(it.hasNext()){
			if(it.next()==3){
				it.remove();
				
				
			}
		}
		
		System.out.println(list);
	}
}

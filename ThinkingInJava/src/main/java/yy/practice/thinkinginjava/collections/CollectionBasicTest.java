package yy.practice.thinkinginjava.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class CollectionBasicTest {
	
	@Test
	public void testResize(){
		
		Integer[] array = {1,2,3};
		
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(array));
		collection.addAll(Arrays.asList(4,5,6));
		Collections.addAll(collection, 7,8,9);
		System.out.println(collection);
		
		List<Integer> list = Arrays.asList(array);
//		list.addAll(Arrays.asList(4,5,6));//java.lang.UnsupportedOperationException
//		Collections.addAll(list, 7,8,9);//java.lang.UnsupportedOperationException
		System.out.println(list);

	}

}

package yy.practice.datastructure.chapter5.pp.matrix;

import org.junit.Test;

public class MatrixSignleLinkedTest {

	@Test
	public void test() {

		MatrixSignleLinked matrix = new MatrixSignleLinked(9, 5);
		matrix.display();
		matrix.insert(3, 3, 123);
		matrix.display();
	}
}

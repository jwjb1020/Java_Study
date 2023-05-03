package Study;

public class MatrixTest {
public static void main(String[] args) {
	Matrix a = new Matrix(2,3);
	Matrix a1 = new Matrix(2,3);
	
	a.setData();
	a1.setData();
	
	a.showData("a");
	a1.showData("a1");
	//Matrix. <- static 함수
	Matrix a2 = Matrix.addMatrix(a,a1);
	a2.showData("a2");
	int row = a2.getRowCount();
	System.out.println(row);
	a2.setRowCount(a2.getRowCount());
	System.out.println(a2.getRowCount());
	
	Matrix d = a.Transpose();
	d.showData("d");
	Matrix b = new Matrix(3,4);
	b.setData();
	b.showData("b");
	
	Matrix c = Matrix.multiplyMatrix(a, b);
	c.showData("c");
}
}

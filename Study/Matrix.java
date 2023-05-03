package Study;

import java.util.Random;

public class Matrix {
	private int[][] data;
	private int rowCount;
	private int colCount;

	public int getRowCount() {
		return this.rowCount;
	}

	public void setRowCount(int a) {
		this.rowCount = a;
	}

	public Matrix() {

	}

	public Matrix(int rows, int cols) {

		this.data = new int[rows][cols];
		this.rowCount = rows;
		this.colCount = cols;

	}

	protected void setData() {
		Random rand = new Random(System.currentTimeMillis());
		for (int i = 0; i < this.rowCount; i++) {
			for (int j = 0; j < this.colCount; j++) {
				data[i][j] = rand.nextInt(100);
			}

		}
		try {
			Thread.sleep(1);
		} catch (Exception e) {

		}
	}

	protected void showData(String name) {
		System.out.println(name + " : 행렬의 데이터");
		for (int i = 0; i < this.rowCount; i++) {
			for (int j = 0; j < this.colCount; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
			// System.out.print("\n"); 위에랑 같음

		}
	}

	// 다른 클래스에서 객체를 만들지 않고 쓰고 싶으면 Static!!!!!
	protected static Matrix addMatrix(Matrix m1, Matrix m2) {
		Matrix result = new Matrix(m1.rowCount, m1.colCount);
		for (int i = 0; i < m1.rowCount; i++) {
			for (int j = 0; j < m1.colCount; j++) {
				result.data[i][j] = m1.data[i][j] + m2.data[i][j];
			}

		}
		return result;
	}

	protected Matrix Transpose() {
		Matrix result = new Matrix(colCount, rowCount);
		
		for (int i = 0; i < this.colCount; i++) {
			for (int j = 0; j < this.rowCount; j++) {
				result.data[i][j] = this.data[j][i];
			}

		}
		return result;
	}
	protected static Matrix multiplyMatrix(Matrix m1, Matrix m2) {
		Matrix result = new Matrix(m1.rowCount, m2.colCount);
		
		for (int i = 0; i < result.rowCount; i++) {
			for (int j = 0; j < result.colCount; j++) {
				int value = 0;
				for (int k = 0; k < m1.colCount; k++) {
					value += m1.data[i][k] * m2.data[k][j]; 
					
				}
				result.data[i][j] = value;
				
			
		}
			
		}
		return result;
	}
}


//	private void test() {
//		addMatrix(null, null);
//	}
// 같은 클래스 안에서는 가능

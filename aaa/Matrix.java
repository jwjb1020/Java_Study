package aaa;

import java.util.ArrayList;
import java.util.Random;

public class Matrix<T> {
	private int rows;
	private int cols;
	// private T[][] data;
	private ArrayList<T> data;

	public Matrix(int row, int col) {
		this.rows = row;
		this.cols = col;
		data = new ArrayList<>();
		// this.data = new T [row][col];

		setData();

	}

	private void setData() {
		Random rand = new Random(System.currentTimeMillis());

		for (int i = 0; i < this.rows * this.cols; i++) {

		}
	}

	protected void showData() {

		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				System.out.print(this.data[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

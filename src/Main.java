
public class Main {
	public static int n;
	
	public static void main(String[] args) {
		n = 5;
		
	}
	
	public static int[][] applyBurn(int[][] landArray) {
		for (int i = 0; i < n; i++) {
			for (int u = 0; u < n; u ++) {
				if (landArray[i][u] == 1) {
					if (landArray[i+1][u] == 2 || 
						landArray[i][u+1] == 2 || 
						landArray[i-1][u] == 2 || 
						landArray[i][u-1]==2) {
							if (randBurn() == true) {
								landArray[i][u] = 2;
							}
					}
				}
			}
		}
		
		return landArray;
	}
	public static int[][] setUp(int n) {
		int[][] tempArray = new int[n][n];
		//Start off by making everything a tree then fill in the other ones
		for (int i = 0; i < n; i++) {
			for (int u = 0; u < n; u ++) {
				tempArray[n][u] = 1;
			}
		}
		//initialize the top row as empty
		for (int w = 0; w < n; w ++) {
			tempArray[w][0] = 0;
		}
		//Initialize the bottom row as empty
		for (int w = 0; w < n; w ++) {
			tempArray[w][n] = 0;
		}
		//initialize the left row as empty
		for (int w = 0; w < n; w ++) {
			tempArray[0][w] = 0;
		}
		//Initialize the right row as empty 
		for (int w = 0; w < n; w ++) {
			tempArray[n][w] = 0;
		}
		tempArray[n/2][n/2] = 2;
		return null;
	}
	public static Boolean randBurn() {
		int r = (int) (Math.random() * (100 - 0)) + 0;
		if (r < 15) {
			return true;
		}
		else {
			return false;
		}
	}
}

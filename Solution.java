import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int v = sc.nextInt();
		int e = sc.nextInt();
		int[][] mat = new int[v][v];

		// create adjecency matrix of size v*v
		for (int i = 0; i < e; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			mat[x][y] = 1;
			mat[y][x] = 1;
		}
		int[] visited = new int[v];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		visited[0] = 1;

		while (!q.isEmpty()) {
			int el = q.poll();
			System.out.print(el + " ");
			for (int i = 0; i < v; i++) {

				if (mat[el][i] == 1 && visited[i] == 0) {
					visited[i] = 1;
					q.add(i);
				}

			}
		}

	}

}

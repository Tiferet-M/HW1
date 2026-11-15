public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int n = m.length;
        int[][] distMatrix = new int[n][n];
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                if (a == b) {
                    distMatrix[a][b] = 0;
                }
                else if (m[a][b] == 1) {
                    distMatrix[a][b] = 1;
                }
                else {
                    distMatrix[a][b] = n + 1;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    if (distMatrix[a][k] + distMatrix[k][b] < distMatrix[a][b]) {
                        distMatrix[a][b] = distMatrix[a][k] + distMatrix[k][b];
                    }
                }
            }
        }

        if (distMatrix[i][j] < n + 1) {
            return distMatrix[i][j];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}
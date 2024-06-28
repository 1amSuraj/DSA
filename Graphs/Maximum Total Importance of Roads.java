class Solution {
    public long maximumImportance(int n, int[][] roads) {
        // n = total number of nodes numbered from 0 to n-1

        int[] degree = new int[n];

        // Calculate the degree of each node
        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];

            degree[u]++;
            degree[v]++;
        }

        // Sort the degrees in ascending order
        Arrays.sort(degree);

        long value = 1;
        long sum = 0;

        // Calculate the sum of degrees multiplied by their corresponding values
        for (int i = 0; i < n; i++) {
            sum += (degree[i] * value);
            value++;
        }

        return sum;
    }
}

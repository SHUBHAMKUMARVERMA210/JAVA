import java.util.Random;

public class sample {

    private static final int N = 100;
    private static final int R = 50;

    public static void main(String[] args) {
        // Generate the positions of the sensors
        Random random = new Random();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = random.nextInt(1000);
            y[i] = random.nextInt(1000);
        }

        // Define the coverage area of each sensor
        int[][] coverage = new int[1000][1000];
        for (int i = 0; i < N; i++) {
            for (int j = x[i] - R; j <= x[i] + R; j++) {
                for (int k = y[i] - R; k <= y[i] + R; k++) {
                    coverage[j][k] = 1;
                }
            }
        }

        // Define the objective function
        int objective = 0;
        for (int i = 0; i < N; i++) {
            objective += coverage[x[i]][y[i]];
        }

        // Initialize the algorithm
        int c = 0; // Current iteration
        int bestObjective = 0; // Best objective value found so far
        int[] bestSolution = null; // Best solution found so far

        // Start the algorithm
        while (c < 10000) {
            // Generate a new solution
            int[] solution = new int[N];
            for (int i = 0; i < N; i++) {
                solution[i] = random.nextInt(2);
            }

            // Calculate the objective value of the new solution
            int newObjective = 0;
            for (int i = 0; i < N; i++) {
                newObjective += coverage[x[i]][y[i]] * solution[i];
            }

            // If the new solution is better than the best solution found so far, update the best solution
            if (newObjective > bestObjective) {
                bestObjective = newObjective;
                bestSolution = solution;
            }

            // Increment the iteration counter
            c++;
        }

        // Print the best solution found
        System.out.println(bestSolution);
    }
}

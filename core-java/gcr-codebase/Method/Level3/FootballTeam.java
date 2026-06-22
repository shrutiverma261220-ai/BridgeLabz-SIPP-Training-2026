public class FootballTeam {

   
    static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights)
            sum += h;
        return sum;
    }

   
    static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights)
            if (h < min)
                min = h;
        return min;
    }

    static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights)
            if (h > max)
                max = h;
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];

        System.out.println("Player Heights:");

        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
            System.out.print(heights[i] + " ");
        }

        System.out.println("\n\nSum = " + findSum(heights));
        System.out.printf("Mean Height = %.2f cm\n", findMean(heights));
        System.out.println("Shortest Height = " + findShortest(heights) + " cm");
        System.out.println("Tallest Height = " + findTallest(heights) + " cm");
    }
}
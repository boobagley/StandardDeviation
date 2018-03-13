public class StandardDeviation
{
	public static void main(String[] args)
	{
        double[] x = new double[] { -5, 1, 8, 7, 2 };
        int n = x.length;
        double mean = 0;
        double StdDev = 0;

        //calculate mean
        for (int i = 0; i <= (n-1); i++)
        {
            mean = mean + x[i];
			System.out.println(x[i]);
        }

        mean = mean / n;

        for (int i = 0; i <= (n-1); i++)
        {
            StdDev = StdDev + (mean - x[i]) * (mean - x[i]);
        }

        StdDev = StdDev / n;

		System.out.println("Variance: " + StdDev);

		StdDev = Math.sqrt(StdDev);

		System.out.println("Standard Deviation: " + StdDev);
	}
}

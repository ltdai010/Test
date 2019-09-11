public class Week3Task1 {
    public int gcd(int a, int b)
    {
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }
    public int fibonacci(int n)
    {
        if(n < 2) return n;
        else
        {
            return fibonacci(n - 1) + fibonacci( n - 2);
        }
    }
    public void sieveEratosthenes(int n) {
        boolean[] notPrime = new boolean[n - 1];
        for(int i = 0; i < n - 1; ++i)
        {
            notPrime[i] = false;
        }
        for(int i = 2; i <= n; ++i)
        {
            if(notPrime[i - 2] != true)
            {
                int tmp = i;
                for (int j = 2; tmp * j <= n; ++j) {
                    notPrime[tmp * j - 2] = true;
                }
            }
        }
        for(int i = 0; i < n - 1; ++i)
        {
            if(!notPrime[i])
            System.out.print((i + 2) + " ");
        }
    }
}

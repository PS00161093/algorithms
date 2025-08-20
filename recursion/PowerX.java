class PowerX {
  
    public double myPow(double x, int n) {
        if (n < 0) {
            return 1.0 / fastPow(x, -n);
        }
        return fastPow(x, n);
    }

    private double fastPow(double base, int power) {
        if (power == 0) {
            return 1;
        }

        double half = fastPow(base, power / 2);

        if (power % 2 == 0) {
            return half * half;
        } else {
            return base * half * half;
        }

    }
}

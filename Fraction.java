public class Fraction {
    private int numerator = 0;
    private int denominator = 1;
    public Fraction(int numerator, int denominator)
    {
        if(denominator !=0)
        {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }
    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator)
    {
        if(denominator != 0)
        {
            this.denominator = denominator;
        }
    }
    public int getNumerator()
    {
        return this.numerator;
    }
    public int getDenominator()
    {
        return this.denominator;
    }
    public void reduce()
    {
        Week3Task1 math = new Week3Task1();
        numerator = numerator/math.gcd(numerator, denominator);
        denominator = denominator/math.gcd(numerator, denominator);
    }
    public Fraction add(Fraction other) {
        Week3Task1 math = new Week3Task1();
        int tempDenominator = this.denominator*other.denominator/math.gcd(this.denominator, other.denominator);
        int tempNumerator = (this.numerator*other.denominator + this.denominator*other.numerator)/
                math.gcd(this.denominator, other.denominator);
        return new Fraction(tempNumerator,tempDenominator);
    }

    // subtract
    public Fraction subtract(Fraction other) {

    }

    // multiple
    public Fraction multiple(Fraction other) {

    }

    // divide
    public Fraction divide(Fraction other) {

    }

    /**
     * compare this with other, notice that param is Object type
     */
    public boolean equals(Object obj) {


    }

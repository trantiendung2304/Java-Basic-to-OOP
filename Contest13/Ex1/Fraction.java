package Contest13.Ex1;

/**
 *
 * @author Tran Tien Dung
 */

public class Fraction {
    private long numerator;
    private long denominator;

    public Fraction(long numerator, long denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private long gcd(long a, long b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private void simplify(){
        long scalingFactor = gcd(this.numerator, this.denominator);
        this.numerator /= scalingFactor;
        this.denominator /= scalingFactor;
    }

    @Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}

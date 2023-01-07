package lab10.ex4_Polynomials;

public interface Poly {
    int degree();
    Poly derivative();
    double coefficient(int degree);
    double[] coefficient();
}

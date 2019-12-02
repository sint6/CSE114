public class LinearEquations
{
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;


    public LinearEquations(double A, double B, double C, double D, double E, double F)
    {
        a = A;
        b = B;
        c = C; 
        d = D;
        e = E;
        f = F;
    }

    public double getA()
    {
        return a;
    }
    public double getB()
    {
        return b;
    }
    public double getC()
    {
        return c;
    }
    public double getD()
    {
        return d;
    }
    public double getE()
    {
        return e;
    }
    public double getF()
    {
        return f;
    }

    public boolean isSolvable()
    {
        if (getA()*getD()-getB()*getC() != 0)
            return true;
        else
            return false;
    }

    public double getX()
    {
        return (getE()*getD()-getB()*getF())/(getA()*getD()-getB()*getC());
    }

    public double getY()
    {
        return (getA()*getF()-getE()*getC())/(getA()*getD()-getB()*getC());
    }
}
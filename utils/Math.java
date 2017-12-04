package utils;
public class Math {
    public static int factorial(int x)
    {
        if(x <= 1)
        {
            return 1;
        }
        return x * factorial(x - 1);
    }
    public static int factorialLoop(int x)
    {
        int output = 1;
        
        if(x <= 0)
        {
            return output;
        }
        for(int i = 1; i <= x; i++) 
        {
            output = output * i;
        }
        return output;
    }
}
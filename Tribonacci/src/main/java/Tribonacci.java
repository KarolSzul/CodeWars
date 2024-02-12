public class Tribonacci {

    public double[] tribonacci(double[] s, int n) {

        double[] tribonacciArray=new double[n];

        if(n<=3)
            for(int j=0;j<n;j++)
                tribonacciArray[j]=s[j];

        else
        {
            tribonacciArray[0]=s[0];
            tribonacciArray[1]=s[1];
            tribonacciArray[2]=s[2];
            for(int i=3;i<n;i++)
                tribonacciArray[i]=tribonacciArray[i-3]+tribonacciArray[i-2]+tribonacciArray[i-1];
        }

        return tribonacciArray;
    }
}



}

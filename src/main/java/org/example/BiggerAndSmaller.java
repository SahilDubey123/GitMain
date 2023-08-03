package org.example;
public class BiggerAndSmaller {
    private int smaller=Integer.MAX_VALUE;
    private int bigger=Integer.MIN_VALUE;
    public void find(int []arr)
    {
        for(int n: arr)
        {
            if(bigger<n)
                bigger=n;
            if(smaller>n)
                smaller=n;
        }
    }

    public int smaller() {
        return smaller;
    }

    public int bigger() {
        return bigger;
    }
}

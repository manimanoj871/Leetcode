class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean[] arr=new boolean[n];
        for(int i=2;i<n;i++)
        { 
            arr[i]=true;

        }
        for(int i=2;i*i<n;i++)
        {
            if(arr[i])
            {
            for(int j=i*i;j<n;j=j+i)
            {
                arr[j]=false;
            }
            }

        }
        for(int i=2;i<n;i++)
        {
            if(arr[i])
            c++;
        }
        return c;
    }
   
}
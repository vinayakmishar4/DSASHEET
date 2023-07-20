package BIT;

public class Non_Repeating_Numbers 
{
    public int[] singleNumber(int[] nums)
    {
        int xor = 0;
        for(int i: nums)
        {
           xor ^= i;
        }
        int rm=xor^xor-1;
        int a=0;
        int b=0;
        for(int val: nums)
        {
            if((val & rm)==0)
            {
               a=a^val;
            }
            else
            {
                b=b^val;
            }
        }
        if(a<b)
        {
            return new int[]{a,b};
        }
        return new int[]{b,a};
    }
    public static void main(String[] args)
    {

    }
}

package BIT;
public class BitDIffernec
{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b)
    {
       int c=a^b;
       int cout=0;
       while(c>0)
       {
         c=c&(c-1);
         cout++;
       }
       return cout;
    }
    public static void main(String[] args)
    {
       System.out.println(countBitsFlip(10, 20)); 
    }
}
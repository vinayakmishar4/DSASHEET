package BIT;
// https://practice.geeksforgeeks.org/problems/set-bits0143/1
public class Number_of_1Bits
{
    static int setBits(int N) 
    {
       if(N==1)
       {
         return 1;
       }
       return N%2 + setBits(N/2);
    }
    public static void main(String[] args)
    {

    }
}
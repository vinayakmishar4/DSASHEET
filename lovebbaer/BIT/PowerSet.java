package BIT;

import java.util.List;

public class PowerSet
{
     public List<String> AllPossibleStrings(String s)
    {
        if(s.length()==0)
      {
         List<String> list = new ArrayList<String>();
         list.add("");
         return list;
      }
      // samll problem 
      char fristChar = s.charAt(0);
      List<String> result=new ArrayList<String>();
      List<String> list=AllPossibleStrings(s.substring(1));
      for(String A : list)
      {
         // not incuded
         result.add(A);
         // include
         result.add(fristChar+A);
      }
      return result;
    public static void main(String[] args)
    {

    }
}
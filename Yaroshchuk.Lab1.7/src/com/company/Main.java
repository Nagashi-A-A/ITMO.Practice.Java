package com.company;

public class Main {

    public static void main(String[] args) {
	 int [] newArr = {3,4,3,2,5,63,2,2,2,3,4,8,5,8,63};
	 int count = 1;
	 for (int i = 0; i < newArr.length; i++)
	  {
         for(int j = 0; j < newArr.length; j++) {
             if (i == j)
                 continue;

             else if (newArr[i] == newArr[j])
             {
                 count++;
             }
         }
         if (count == 1)
         {System.out.println(newArr[i] + " is unique.");
         break;
         }
         else
             count = 1;
	  }
    }
}

import java.util.Arrays;

public class BubbleSort
{

	public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		
	System.out.println(Arrays.toString(myNums));

	for(int pass = myNums.length - 1; pass > 0; pass--)
		for(int num = 0; num < pass; num++)
			if(myNums[num] > myNums[num + 1])
			{
				int temp = myNums[num];
				myNums[num] = myNums[num + 1];
				myNums[num + 1] = temp;
			}

		System.out.println(Arrays.toString(myNums));
		//Loop once for each pass, where passes is one less than the number of items.
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
				//If they are out of order, swap the values
			//End Loop for comparisons
    
			//The next pass will use one less comparison
    
		//End Loop for passes



  }
}

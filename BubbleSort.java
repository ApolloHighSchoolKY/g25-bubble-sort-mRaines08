import java.util.Arrays;

public class BubbleSort
{

	public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes;
		int comparisons;
		int tempNum;

		for(int i = myNums.length - 1; i >= 0; i--)
			for(int num = 0; num < i; num++)
			{
				int x = myNums[num];
				int y = myNums[num + 1];

				if(x > y)
				{
					int temp = x;
					x = y;
					y = temp;
				}
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

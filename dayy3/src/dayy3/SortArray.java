package dayy3;

public class SortArray {
	int[] sortArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int dummy;
					dummy=array[i];
					array[i]=array[j];
					array[j]=dummy;
				}
			}
		}
		return array;
	}
}

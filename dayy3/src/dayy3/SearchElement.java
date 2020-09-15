package dayy3;

public class SearchElement {
void searchElement(int[] array,int search)
{
	int flag=0;
	for (int i = 0; i < array.length; i++) {
		if(array[i]==search)
		{
			flag=1;
		}
	}
	 if(flag==0)
			System.out.println("Element not found");
	 else
		 System.out.println("ELement found");
	}
}


package INFO;
public class Process {

	public static void main(String[] args) {
		Details d=new Details();
		int arr[]=new int[3];
		int ascarr[]=new int[3];
		arr=d.detailsofsal();
		int sor[]= new int[3];
		  Process p=new Process();
			sor=p.sort(arr);
			for (int i = 0; i < sor.length; i++) {
				System.out.println(sor[i]);
				
			}
		for (int i = 0; i < arr.length; i++) {
			if(arr[0]<arr[i])
			{
				arr[0]=arr[i];
			}
		}
			System.out.println("Biggest of three numbers is "+arr[0]);
			}
	  public int[] sort(int[] narr )
      {
      	for (int i = 0; i < narr.length; i++) {
      		for (int j = i+1; j < narr.length; j++) {
      			if(narr[i]>narr[j])
      			{
      				int tem=narr[i];
      				narr[i]=narr[j];
      				narr[j]=tem;
      				
      			}
					
				}
      	}
      	return narr;
      }
  
        }


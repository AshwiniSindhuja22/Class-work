package basicprogram;

public class Frequency 
{

	public static void main(String[] args) {
		int[] a= {1,2,2,3};
		for (int i=0;i<a.length ;++i) {
		int x=a[i];
		int count=0;
		
		for(int j=0;j<a.length ;++j) {
		   if(a[j]==x)
	       {
			   ++count;
			   
		}
	  }
		System.out.println("Frequency of "+x+" is "+count);

  }
}
                                                   }
	
		




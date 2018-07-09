package question2;

/**
 * Please implement Dynamic Array Interface
 * 
 * @author
 *
 */
public class MyCollection implements DynamicArray {
	// Uncomment commented section

	/**
	 * You can declare local/global variables as per your requirement
	 */
	int size;
	int count=0;
	int curr=-1;
	
	@SuppressWarnings("unused")
	private String[] numArray;
	
	public MyCollection(int arraySize){
		numArray = new String[arraySize];
		size=arraySize;
	}

	public int search(String searchingNum) {
		int pos=-1;
		for(int i=0;i<=curr;i++)
		{
			if(numArray[i]==searchingNum)
               {
				pos=i;
               }

		}	
		// TODO Auto-generated method stub
		return pos;
	}	
	


	public boolean add(String numberToAdd) {
		int z;
		boolean flag=false;
		z=search(numberToAdd);
		
		if(z==-1 && curr<size-1)
		{
			curr++;
			count++;
			numArray[curr]=numberToAdd;
			flag=true;
			
		}
		else if(z==-1 && curr>=size)
		{
			doubleCapacity();
			curr++;
			count++;
			numArray[curr]=numberToAdd;
			flag=true;
		}
		else
		{
			flag=false;
		}
		
		
		
		// TODO Auto-generated method stub
		return flag;
	}

	public void doubleCapacity() {
		// TODO Auto-generated method stub
		String temp[];
		temp=new String[size];
		for(int i=0;i<numArray.length;i++)
		{
			temp[i]=numArray[i];
		}
		numArray=new String[2*size];
		for(int i=0;i<temp.length;i++)
		{
			numArray[i]=temp[i];
		}

	}

	public boolean remove(String numberToRemove) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int i;
		int z=search(numberToRemove);
		if(z==-1)
		{
			flag=false;
		}
		else
		{
			for(i=z;i<curr;i++)
			{
				numArray[i]=numArray[i+1];
			}
			curr--;
			flag=true;
		}
		return flag;
		
	}

	public int getCount() {
		// TODO Auto-generated method stub
		
		return count;
	}

	
	
	
	
	public String[] rotate(int n) {
		// TODO Auto-generated method stub
	/*String temp[]=new String[n];
	int i,j,k;
	for(i=0;i<n;i++)
	{
		temp[i]=numArray[i];
	}
	System.out.println("sfsdf"+temp);
	i=0;
	for(j=0;j<curr-n;j++)
	{
		numArray[j]=numArray[j+1];
		
	}
	System.out.println(numArray);
	for(k=j;k<curr;k++)
	{
		numArray[k]=temp[i];
		i++;
	}
	System.out.println(numArray);
		return numArray;*/
		
		int i;
		  for (i = 0; i < n; i++)
		    rotateByOne(numArray, n);
		  return numArray;
			
		  
	}
		void rotateByOne(String a[], int n)
			{
				  int i;
				  String temp;
				  temp = a[0];
				  for (i = 0; i < n-1; i++)
				     a[i] = a[i+1];
				  numArray[i] = temp;
		}
	

	
	
	public String toString( )
	{
		String result = "{";
	      for (int i = 0; i < curr; i++) {
	         if (i > 0) {
	            result = result + ",";
	         }
	         String item = numArray[i];
	         result = result + item;
	      }
	      result = result + "}";
	      return result;
	}
	

}

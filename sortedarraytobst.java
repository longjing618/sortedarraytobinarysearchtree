
public class sortedarraytobst {
	public static void main(String[] args)
	{
		int Arr[] = {1,2,3,4,5,6};
		tree bst = tobst(Arr);
	}
	
	public static tree tobst(int[] Arr)
	{
		int length = Arr.length;
		tree re = new tree();
		if(length > 0)
		{
			re.val = Arr[length/2];
		}
		else
			return null;
		if(length == 1)
		{
			return re;
		}
		else
		{
			int[] lefta = new int[length/2];
			int[] righta = new int[length-length/2-1];	
			System.arraycopy(Arr,0,lefta,0,length/2);
			System.arraycopy(Arr,length/2+1,righta,0,length-length/2-1);				
			re.left = tobst(lefta);
			re.right = tobst(righta);
			return re;
		}
	}
}

class tree
{
	int val;
	tree left;
	tree right;
}

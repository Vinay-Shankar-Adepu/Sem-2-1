class Twopointer
{
	public static void main(String[] arg){
		int a[]={1,0,1,1,0,0,1,1,0,1};
		int i=0;
		int j=a.length-1;
		while(i<=j){
			if (a[i]==1 && a[j]==1){
				i++;
			}
			else if (a[i]==0 && a[j]==1){
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j--;
			}
			else if (a[i]==1 && a[j]==0){
				i++;
				j--;
			}
			else if(a[i]==0 && a[j]==0){
				j--;
			}
		}
		for (int k=0; k<a.length; k++){
			System.out.print(" "+a[k]);
		}
	}
}
class P25{
	
	public static void main(String[] args){
		
		int n=7;
	
		for(int i=1; i<=n; i++){
			
			for(int j=i; j<=n; j++)
				System.out.print(j);
			
			if(i==1) {
				System.out.println();
				continue;
			}
			
			for(int j=1; j<=i-1; j++)
				System.out.print(j);
			
			System.out.println();
		}
	}
}
class P11{
	
	public static void main(String[] args){
		
		int n=6;
		char ch = 'A';
		for(int i=n; i>=1; i--){
			
			for(int j=1; j<=i; j++)
				System.out.print(ch++ + " ");
			
			ch = 'A';
			System.out.println();
		}
		
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=i; j++)
				System.out.print(ch++ + " ");
			
			ch = 'A';
			System.out.println();
		}

	}
}
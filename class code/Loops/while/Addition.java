class Addition {
    public static void main(String []abhay){
        int sum=0;
	int N=6531;
        while(N!=0){
               int rem=N%10;
               sum=sum+rem;
               N=N/10;
        }
            System.out.println(sum);
    }
}

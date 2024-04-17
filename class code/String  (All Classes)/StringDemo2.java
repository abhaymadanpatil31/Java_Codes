
class NullPointerDemo {
	public static void  main(String [] args) {
		int arr1[][]={{},{},{}};/*here if you see clearly there are three rows have been initiated but columns are absent as we know it is valid but not vice versa is valid so this line will run and have output have 3 and default value 0 of column */
		int arr2[][]=new int[3][];/*this is incomplte array declaretion because it has only rows and if you get confused then divide 2D array in 1D array and you will get answer*/
		System.out.println(arr1.length);
		System.out.println(arr2[0].length);//column by default is 0
		System.out.println(arr2.length);//this is valid because rows have been declared
                System.out.println(arr2[0].length);/*here columns are not initiated for this kind of declaretion use second type of Jagged Array i.e arr[0]=new int {10,20,30}; arr[1]=new int{40,50,60};*/
			   			  
	}
	
}

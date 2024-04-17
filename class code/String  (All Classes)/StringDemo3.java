
class StringDemo {
	public static void main(String [] args) {
		char ch[]= {'A','B'};
		System.out.println(ch);/*yethe char concat karun as String output deto */
		System.out.println("Array="+ch);/*yethe address print hoto karan String sobat object la jeva call karto teva address la call jato i.e jeva kontahi object String shejari asto teva to object String madhe convert hoto */
	}/*overall sangyache zale tar ,jeva apan primitive data type la identityHashCode apply karto teva automatically valueOf ()hya method la call jato ani valueof() hi method new operator i.e naveen object tayar karte any tymule aplyala naveen address milto and specificly char(internally as integer) and integer heyche sanglya values IntegerCache var jatat i.e in limit only and jeva keva apan same values char and int cha address magto teva jvm run time la new object tayar larun deto becuase of valueOf() method*/
}

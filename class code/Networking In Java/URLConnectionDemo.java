
import java.net.*;
import java.util.*;
import java.io.*;

class URLConnectionDemo {

	public static void main(String[] args)  throws IOException {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the site which you want to get details:");
		String site = sc.next();
		URL obj = new URL(site);
		URLConnection conn = obj.openConnection();
		System.out.println("The last modified :"+ new Date(conn.getLastModified()));
		System.out.println(conn.getContentType());
	}
}

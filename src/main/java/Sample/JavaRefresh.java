package Sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class JavaRefresh {

	public static int getlarge(int s[]) {
		int max = s[0];
		int max2 = s[0];
		for (int r : s) {
			if (r > max) {
				max2 = max;
				max = r;

			} else if ((r > max2 && r != max) || max2 == max) {
				max2 = r;
			}

		}

		return max2;

	}

	public static void printNonPrime(String s) {
		char[] a = s.toCharArray();
		for (int x = 0; x < s.length(); x++) {
			s.indexOf(x);
		}

	}

	public static ArrayList<Integer> getnumber(int[] a) {

		Arrays.sort(a);
		int n = a[0];
		// int [] b = new int[a.length];

		ArrayList<Integer> b = new ArrayList<Integer>();
		int y = 0;
		for (int x = 0; x < a.length; x++) {

			while (n != a[x]) {
				b.add(n);
				y++;
				n++;
			}
			n = n + 1;
			;
			/*
			 * if( n != a[x]) { b[y] = n; y++; n = a[x]; n = n+1; }
			 * 
			 * else { n = a[x]; n = n+1; }
			 */
		}
		return b;

	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		/*
		 * fibonacci series int f1 =0; int f2 =1; int f3 =0; for(int x =0; x<10;
		 * x++) { System.out.print(f1 + " "); f3 = f1+f2; f1 =f2; f2 = f3; }
		 */

		/*
		 * Prime numbers
		 * 
		 * int d =0; for(int x=0; x<100; x++) { if(x ==0 || x == 1) { d++; }
		 * for(int y =2; y<=Math.sqrt(x); y++) { if(x%y ==0){ d++; } } if(d ==0)
		 * { System.out.println(x + " is Prime"); } d =0; }
		 */

		/*
		 * palindrome number int n = 329; int k =0; int g =0; int l =0; l =n ;
		 * while(n>0) {
		 * 
		 * k = n%10; n = n/10; g = g*10 +k; }
		 * 
		 * if(l == g) { System.out.println(l + " is palindrome number"); } else
		 * { System.out.println(l + " is not palindrome number"); }
		 */
		/*
		 * Factorial Number int k= 1; for(int x = 6;x>=1; x-- ) { k = k*x ; }
		 * 
		 * System.out.println(k);
		 */
		/*
		 * Armstrong number int n = 153; int k =0; int u =0; while(n>0) {
		 * 
		 * k = n%10; n = n/10; u = u + k*k*k; }
		 * 
		 * System.out.println(u);
		 */

		/*
		 * int arr[] ={3,60,35,2,45,320,5};
		 * 
		 * int min = arr[0];
		 * 
		 * for(int f : arr) {
		 * 
		 * if(min<f) { min = f; } }
		 * 
		 * 
		 * System.out.println(min); int t =0; for(int x =0; x<arr.length; x++) {
		 * for(int y = x+1; y<arr.length; y++) { if(arr[x]<arr[y]) { t = arr[x];
		 * arr[x] = arr[y]; arr[y] = t; } } }
		 * 
		 * System.out.println(Arrays.toString(arr));
		 */

		/*
		 * int arr1[] ={1, 2, 3, 4, 5};
		 * 
		 * int arr2[] = Arrays.copyOf(arr1, arr1.length);
		 * 
		 * System.out.println(Arrays.toString(arr2));
		 * 
		 * int arr3[] = new int[arr1.length]; int x =0; for(int d : arr1) {
		 * arr3[x] = d; x++; }
		 * 
		 * System.out.println(Arrays.toString(arr3));
		 */

		/*
		 * int arr[] ={1, 2, 8, 3, 2, 2, 2, 5, 1 }; int f =1; for(int x =0;
		 * x<arr.length; x++) { for(int y = x+1; y<arr.length; y++) { if(arr[x]
		 * == arr[y] && arr[y] != ' ') { f++; arr[y] = ' ';
		 * 
		 * }
		 * 
		 * }
		 * 
		 * if(arr[x] != ' ') { System.out.println( arr[x] + " is displayed " + f
		 * + " times"); } f =1; }
		 */

		/*
		 * int arr[] ={1, 2, 3, 4, 5 }; //int a[] = new int[arr.length];
		 * 
		 * int g =0; for(int x = 0; x<arr.length-1; x++) { for(int y = x+1; y<=
		 * x+1; y++) { a[x] = arr[y]; a[y]= arr[x]; arr[y] = arr[x];
		 * 
		 * g = arr[y]; arr[y] = arr[x]; arr[x] = g; } }
		 * 
		 * System.out.println(Arrays.toString(arr));
		 */
		/*
		 * int arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3}; int t = 1;
		 * 
		 * for(int x =0; x<arr.length; x++) { for(int y =x+1; y<arr.length; y++)
		 * { if(arr[x] == arr[y]) { t++; }
		 * 
		 * }
		 * 
		 * if(t>1) { System.out.println(arr[x] + " is displayed " + t + " times"
		 * ); }
		 * 
		 * t =1; }
		 */

		/*
		 * int arr[] = {1, 2, 3, 4, 5};
		 * 
		 * for(int x =arr.length-1; x>=0; x--) { System.out.print(arr[x] + " ");
		 * }
		 */
		/*
		 * int arr[] = {1, 2, 3, 4, 5} ;
		 * 
		 * for(int x =0; x<arr.length; x++) { if(arr[x]%2 != 0) {
		 * System.out.print(arr[x] + " "); }
		 * 
		 * 
		 * }
		 */

		/*
		 * int arr[] = {25, 11, 7, 75, 56};
		 * 
		 * int max = arr[0] ;
		 * 
		 * for(int s : arr) {
		 * 
		 * if(s < max) { max = s; }
		 * 
		 * }
		 * 
		 * System.out.println(max);
		 */

		/*
		 * int arr[] = {1, 2, 3, 4, 5}; int b =0; for(int x : arr) { b +=x ; }
		 * 
		 * System.out.println(b);
		 */

		/*
		 * int arr[] ={1, 2, 3, 4, 5 }; int s =0; for(int x =arr.length-1; x>0;
		 * x--) {
		 * 
		 * for(int y = x-1 ; y <=x-1; y++) { s = arr[y]; arr[y] = arr[x]; arr[x]
		 * =s; } }
		 * 
		 * System.out.println(Arrays.toString(arr));
		 */

		/*
		 * int arr[] ={5, 2, 8, 7, 1 }; int f =0; for(int x =0; x<arr.length;
		 * x++) { for(int y = x+1; y<arr.length; y++) { if(arr[x]< arr[y]){
		 * 
		 * f = arr[x]; arr[x] = arr[y]; arr[y] = f; } } }
		 * 
		 * System.out.println(arr[2]);
		 */

		/*
		 * int b[]={44,66,99,77,33,22,55}; int max = b[0]; int max2 = b[0];
		 * for(int d : b) {
		 * 
		 * if(d<max) { max2 = max; max =d;
		 * 
		 * } else if (d<max2) { max2 =d; }
		 * 
		 * }
		 * 
		 * System.out.println(max2);
		 */

		/*
		 * int a[][]={{1,3,4},{2,4,3},{3,4,5}}; int
		 * b[][]={{1,3,4},{2,4,3},{1,2,4}}; int c [] [] = new
		 * int[a.length][b.length];
		 * 
		 * for(int x =0; x<a.length; x++) { for(int y =0; y<a.length; y++) {
		 * c[x][y] = a[x][y] + b[x][y]; }
		 * 
		 * }
		 * 
		 * for(int x =0; x<a.length; x++) { for(int y =0; y<a.length; y++) {
		 * System.out.print(c[x][y] + " "); } System.out.println();
		 * 
		 * }
		 */

		/*
		 * String str = "The best of both worlds"; String[]a = str.split(" ");
		 * int z =0; for(String s : a) { z += s.length() ; }
		 * 
		 * System.out.println(z);
		 */

		/*
		 * String str = "This is a really simple sentence"; str.toLowerCase();
		 * char[] z= str.toCharArray(); char [] v = {'a','e','i','o','u'}; int i
		 * =0; int g =0; for(int x =0; x<z.length; x++) { for(int y=0;
		 * y<v.length; y++) { if(z[x] == v[y] && z[x] != ' ') { i++; }
		 * 
		 * } if(z[x] != ' ') { g++; }
		 * 
		 * }
		 * 
		 * System.out.println(i + " "); System.out.println(g - i);
		 */

		/*
		 * String str1 = "Brag"; String str2 = "Grab"; String s =
		 * str1.toLowerCase(); String ss = str2.toLowerCase(); char[]d =
		 * s.toCharArray(); char[]dd = ss.toCharArray(); Arrays.sort(d);
		 * Arrays.sort(dd); System.out.println(Arrays.equals(d, dd));
		 */

		/*
		 * String str = "aaaabbbbcccc"; char[] ds = str.toCharArray(); int n =3;
		 * 
		 * int d = str.length() / n ; for(int x =0; x<ds.length; x++) { if(x<d){
		 * System.out.print(ds[x]); } else { System.out.println();
		 * System.out.print(ds[x]); d = d*2;
		 * 
		 * 
		 * } }
		 */

		/*
		 * String str = "fun"; int n = str.length();
		 * 
		 * String[] s = new String[n*(n+1)/2];
		 * 
		 * int w =0; for(int x =0; x<n; x++) { for(int y = x ; y <n; y++) { s[w]
		 * = str.substring(x, y+1); w++;
		 * 
		 * } }
		 * 
		 * System.out.println(Arrays.toString(s));
		 */
		/*
		 * String str ="Kayak"; String s = str.toLowerCase();
		 * System.out.println(str.length()); String d =""; for(int x =
		 * str.length()-1; x>=0; x--) { d = d+ s.charAt(x);
		 * 
		 * }
		 * 
		 * System.out.println(d);
		 */
		/*
		 * String str ="Kaya"; StringBuilder sb = new StringBuilder(str);
		 * System.out.println(sb.reverse());
		 */

		/*
		 * int [] arr ={1,2,3};
		 * 
		 * int max = arr[0]; int max2 = arr[0];
		 * 
		 * for(int a : arr) {
		 * 
		 * if(a>max) { max2 = max; max = a; }
		 * 
		 * else if((a> max2 && a!= max)|| max2 == max ) { max2 = a; }
		 * 
		 * }
		 * 
		 * System.out.println(max2); System.out.println(max);
		 */

		/*
		 * int arr[] = {4,3,1,2}; int d = 0; for(int x =0; x<arr.length; x++) {
		 * for(int y = x+1; y<arr.length; y++) { if(arr[x]>arr[y]) { d = arr[x];
		 * arr[x] = arr[y]; arr[y] = d;
		 * 
		 * } } } System.out.println(Arrays.toString(arr));
		 */
		/*
		 * String s2 = "this is interview"; String s = s2.toLowerCase(); char[]
		 * cer = s.toCharArray(); int n =1; for(int x =0; x<cer.length; x++) {
		 * for(int y = x+1; y<cer.length; y++) { if(cer[x] == cer[y] && cer[y]
		 * != ' ') { n++; cer[y] = ' ';
		 * 
		 * } }
		 * 
		 * if(n>1 && cer[x] != ' ') { System.out.println( cer[x] +
		 * "  is displayed " + n + " times"); }
		 * 
		 * n =1; }
		 */
		/*
		 * String s2 = "this is interview";
		 * 
		 * for(int x =s2.length()-1; x>=0; x--) {
		 * System.out.print(s2.charAt(x)); }
		 */
		/*
		 * 
		 * 
		 * 
		 * 
		 * int a = 10; int b = 20;
		 * 
		 * int c =0; c = a; a =b; b= c; System.out.println(a + " " + b); a =
		 * a+b; b = a-b; a = a-b; System.out.println(a + " " + b);
		 */

		/*
		 * String str = "This this is is done by Saket Saket"; String s[] =
		 * str.split(" ");
		 * 
		 * Map<String, Integer> ma = new HashMap<String, Integer>();
		 * 
		 * for(String sw : s) { if(ma.containsKey(sw)) { ma.put(sw,
		 * ma.get(sw)+1); } else { ma.put(sw, 1); } }
		 * 
		 * 
		 * 
		 * Set<String> qa= ma.keySet(); System.out.println(qa.size());
		 * 
		 * for(String d : qa) {
		 * 
		 * 
		 * System.out.println(d + " is displayed " + ma.get(d)+ " times"); }
		 */
		/*
		 * int p =0; int d =0; for(int x =0; x<100; x++) { if(x ==0 || x == 1) {
		 * p++; }
		 * 
		 * double k = Math.sqrt(x);
		 * 
		 * 
		 * for (int j = 2 ; j<=k; j++) { if(x%j == 0) { p++; }
		 * 
		 * }
		 * 
		 * if(p ==0 ) { System.out.print(x + " ");
		 * 
		 * }
		 * 
		 * p =0; }
		 */

		/*
		 * String s = "Vivek"; String f = s.toLowerCase(); String g = "" ;
		 * for(int x = f.length()-1; x>=0; x--) {
		 * 
		 * g += f.charAt(x); }
		 * 
		 * 
		 * System.out.println(g);
		 */

		/*
		 * int f1 =0; int f2 =1; int f3 =0; for(int x =0; x<10; x++) {
		 * System.out.print(f1 + " "); f3 = f1+f2; f1 =f2; f2 =f3;
		 * 
		 * 
		 * }
		 */

		/*
		 * ArrayList<Integer> sw = new ArrayList<Integer>(); sw.add(1);
		 * sw.add(2); sw.add(3); sw.add(4); sw.add(5); sw.add(6); sw.add(7);
		 * sw.add(8); sw.add(9); sw.add(10);
		 * 
		 * 
		 * for(int x =0; x<sw.size(); x++) {
		 * 
		 * System.out.print(sw.get(x) + " "); } System.out.println(); for(int i
		 * : sw) { System.out.print(i + " "); } System.out.println();
		 * Iterator<Integer> dd = sw.iterator(); while(dd.hasNext()) {
		 * System.out.print(dd.next() + " "); }
		 */

		/*
		 * String str = "this is interview"; char[] s= str.toCharArray(); int n
		 * = 1; for(int x =0; x<s.length; x++) { for(int y = x+1; y<s.length;
		 * y++){
		 * 
		 * if(s[x] == s[y] && s[y] != ' ') { n++; s[y] = ' '; } } if(s[x] != ' '
		 * && n>1) { System.out.println(s[x] + " is displayed " + n+ " times");
		 * }
		 * 
		 * n=1; }
		 */

		/*
		 * int a [] = {3,2,1,10}; int b [] = {1,2,3}; int c [] = {2,3,1};
		 * 
		 * int aww = getlarge(a);
		 * 
		 * System.out.println(aww);
		 * 
		 * 
		 * 
		 * int bww = getlarge(b);
		 * 
		 * System.out.println(bww);
		 * 
		 * 
		 * int cww = getlarge(c);
		 * 
		 * System.out.println(cww);
		 */

		/*
		 * int k =1634; int f =0; f =k; int r =0; int h =0; while(f>0) { r
		 * =f%10; f=f/10; h = r*r*r*r + h; }
		 * 
		 * 
		 * System.out.println(h);
		 */
		/*
		 * String str1 = "Saket Saurav        is a QualityAna    list"; String s
		 * = str1.replaceAll(" ", "");
		 * 
		 * 
		 * System.out.println(s);
		 */

		// String str1 = "Saket Saurav is an Autom ation Engi ne er";

		/*
		 * char[] s = str1.toCharArray();
		 * 
		 * char []a = new char[s.length]; int u =0; StringBuffer sad = new
		 * StringBuffer(); for(char x: s) { if(x != ' ') { a[u] = x; u++;
		 * sad.append(x); } }
		 * 
		 * 
		 * String saq = a.toString();
		 */

		/*
		 * String path = "C:\\Users\\vivekp\\Desktop\\LIfe census.xls";
		 * 
		 * File file = new File(path); FileInputStream in = new
		 * FileInputStream(file);
		 * 
		 * Workbook book = new HSSFWorkbook(in); Sheet sheet =
		 * book.getSheetAt(0);
		 * 
		 * int r = sheet.getLastRowNum() - sheet.getFirstRowNum();
		 * 
		 * for(int x =0; x<r; x++) {
		 * 
		 * Row ds = sheet.getRow(r); int y = ds.getLastCellNum() -
		 * ds.getFirstCellNum() ;
		 * 
		 * for(int z =0; z<y; z++) {
		 * System.out.print(ds.getCell(z).getStringCellValue().toString() + "  "
		 * ); }
		 * 
		 * 
		 * }
		 */

		/*
		 * try { int a[]= new int[10]; a[10]= 10/0; } catch(ArithmeticException
		 * e) { e.printStackTrace(); System.out.println("-------------");
		 * System.out.println(e.getMessage());
		 * System.out.println("-------------");
		 * System.out.println(e.getLocalizedMessage());
		 * System.out.println("-------------");
		 * System.out.println(e.toString());
		 * System.out.println("-------------");
		 * System.out.println(e.getCause());
		 * System.out.println("-------------"); System.out.println(
		 * "Arithmetic exception in first catch block"); }
		 * catch(ArrayIndexOutOfBoundsException e) { System.out.println(
		 * "Array index out of bounds in second catch block"); } catch(Exception
		 * e) { System.out.println("Any exception in third catch block"); }
		 */
		/*
		 * int f1 =0; int f2 =0; int f3 =1;
		 * 
		 * for(int x =0; x<10; x++) {
		 * 
		 * f1 = f2; f2 = f3; f3 = f1 +f2;
		 * 
		 * System.out.print(f1 + " " ); } System.out.println(); int fa =0; int
		 * fb =1; int fc =0;
		 * 
		 * for(int x =0; x<10; x++) {
		 * 
		 * System.out.print(fa + " ");
		 * 
		 * fc = fa +fb; fa = fb; fb = fc; }
		 */

		/*
		 * int d =0;
		 * 
		 * for(int x =0; x<100; x++) { if(x ==0 || x == 1) { d ++;
		 * 
		 * }
		 * 
		 * double s = Math.sqrt(x);
		 * 
		 * for(int y = 2; y<=s; y++) { if(x%y == 0) { d++; } }
		 * 
		 * 
		 * if(d ==0) { System.out.print(x + " "); }
		 * 
		 * d =0;
		 * 
		 * }
		 */

		/*
		 * int n = 12121 ;
		 * 
		 * int k =0; int y =0; k =n; int h =0; while(n>0) { y = n%10; n = n/10;
		 * h = h*10 + y;
		 * 
		 * }
		 * 
		 * System.out.println(h);
		 */

		/*
		 * int f =1; for(int x =1; x<5; x++) {
		 * 
		 * f += x*f; }
		 * 
		 * System.out.println(f);
		 */

		/*
		 * int n = 153; int x =0; int y =0; while(n>0) {
		 * 
		 * x = n%10; n = n/10; y = x*x*x +y; }
		 * 
		 * 
		 * System.out.println(y);
		 */

		/*
		 * int a[] ={3,60,35,2,45,320,5}; int temp =0; for(int x =0; x<a.length;
		 * x++) { for(int y = x+1; y<a.length; y++) { if(a[x]>a[y]) { temp =
		 * a[x]; a[x] = a[y]; a[y] = temp;
		 * 
		 * 
		 * }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * System.out.println(Arrays.toString(a));
		 */

		/*
		 * int a[] ={1, 2, 3, 4, 5}; int b[] = Arrays.copyOf(a, a.length);
		 * System.out.println(Arrays.toString(b));
		 * 
		 * int c[] = new int[a.length]; int x =0; for(int d : a) { c[x] = d;
		 * x++;
		 * 
		 * }
		 * 
		 * System.out.println(Arrays.toString(c));
		 */
		/*
		 * 
		 * 
		 * int arr[] ={1, 2, 8, 3, 2, 2, 2, 5, 1 }; int n =1; for(int x =0;
		 * x<arr.length; x++) { for(int y = x+1; y<arr.length; y++) { if(arr[x]
		 * == arr[y]) { n++; arr[y] = ' '; } }
		 * 
		 * if(arr[x] != ' ') { System.out.println(arr[x] + " is displayed " + n
		 * + " times"); } n =1; }
		 */

		/*
		 * int a[] = {1,2,3,4,5}; int b[] = new int[a.length]; int d =0; for(int
		 * x =0; x<a.length-1; x++) { for(int y = x+1; y<=x+1; y++) { d = a[x];
		 * a[x] = a[y]; a[y] = d; } } System.out.println(Arrays.toString(a));
		 * int y =0; for(int x = a.length-1; x>=0; x--) { b[y] = a[x]; y++; }
		 * System.out.println(Arrays.toString(b));
		 */
		/*
		 * int a[] = { 1, 2, 3, 4, 5 };
		 * 
		 * for (int x = 0; x < a.length; x++)
		 * 
		 * {
		 * 
		 * if (x % 2 == 0) { System.out.println(a[x]); }
		 * 
		 * }
		 */
		/*
		 * int a[] = {1,2,3,4,5};
		 * 
		 * int x =0;
		 * 
		 * for(int y : a) { x += y; } System.out.println(x); int max = a[0]; int
		 * max2 = a[0]; int max3 = 0; for(int x: a) { if(x>max) { max2 = max;
		 * max =x; } else if((x>max2 && x!= max) || max2 == max) {
		 * 
		 * max2 =x; }
		 * 
		 * }
		 * 
		 * System.out.println(max); System.out.println(max2);
		 * System.out.println(max3);
		 */

		/*
		 * int a[][] = {{1,3,4},{2,4,3},{3,4,5}}; int b[][] =
		 * {{1,3,4},{2,4,3},{1,2,4}}; int c[][] = new int[a.length][b.length];
		 * for(int x =0; x<a.length;x++) { for(int y =0 ; y<a.length; y++) {
		 * c[x][y] = a[x][y] + b[x][y]; System.out.print(c[x][y] + " "); }
		 * 
		 * System.out.println(); }
		 */

		/*
		 * int a[][]={{1,3,4},{2,4,3},{3,4,5}};
		 * 
		 * int b[] [] = new int[a.length][a.length];
		 * 
		 * for(int x =0; x<3; x++) { for(int y =0; y<3; y++) { b[x][y] =
		 * a[y][x]; System.out.print(b[x][y] + " "); }
		 * 
		 * 
		 * 
		 * System.out.println(); }
		 * 
		 * 
		 * System.out.println(Arrays.deepToString(b));
		 */

		/*
		 * String s = "The best of both worlds"; char[] sa = s.toCharArray();
		 * int n =0; for(char c: sa) { if(c!= ' ') { n++; }
		 * 
		 * }
		 * 
		 * System.out.println(n);
		 */

		/*
		 * String s = "This is a really simple sentence"; char[] a =
		 * s.toCharArray(); char[] v= {'a','i','o','e','u'}; int co = 0; int no
		 * = 0; for(int x =0; x<a.length; x++) { for(int y =0; y<v.length; y++)
		 * { if(a[x] == v[y] ) { co++; }
		 * 
		 * }
		 * 
		 * if(a[x] != ' ') { no++; } }
		 * 
		 * System.out.println(co + " " + (no-co));
		 */

		/*
		 * String str1 = "Brag"; String str2 = "Grab"; String a =
		 * str1.toLowerCase(); String b = str2.toLowerCase(); char [] aa =
		 * a.toCharArray() ; char [] bb = b.toCharArray() ;
		 * 
		 * Arrays.sort(aa); Arrays.sort(bb);
		 * System.out.println(Arrays.equals(aa, bb));
		 */

		/*
		 * String str ="aaaabbbbcccc";
		 * 
		 * String str2 ="eeeee";
		 * 
		 * String s = str.concat(str2);
		 * 
		 * System.out.println(s.indexOf(str2));
		 */

		/*
		 * String str = "grass is greener on the other side"; char[] s =
		 * str.toCharArray(); int n=0; int max =0; int min = 1; char a = 0; char
		 * b = 0; for(int x =0; x<s.length; x++) { for(int y = x+1;
		 * y<s.length;y++) { if(s[x] == s[y] && s[y] != ' ') { n++; s[y] = ' ';
		 * }
		 * 
		 * }
		 * 
		 * if(n>max && s[x] != ' ') { max =n;
		 * 
		 * a = s[x]; } else if(n<max && s[x] != ' ' && n<=min) { min = n; b =
		 * s[x]; }
		 * 
		 * 
		 * 
		 * n= 1; }
		 */

		/*
		 * System.out.println( a + "  " + max); System.out.println(b + " " +
		 * min);
		 */

		/*
		 * String str = "grass is greener on the other side"; int[] freq = new
		 * int[str.length()]; char minChar = str.charAt(0), maxChar =
		 * str.charAt(0); int i, j, min, max;
		 * 
		 * //Converts given string into character array char string[] =
		 * str.toCharArray();
		 * 
		 * //Count each word in given string and store in array freq for(i = 0;
		 * i < string.length; i++) { freq[i] = 1; for(j = i+1; j <
		 * string.length; j++) { if(string[i] == string[j] && string[i] != ' '
		 * && string[i] != '0') { freq[i]++;
		 * 
		 * //Set string[j] to 0 to avoid printing visited character string[j] =
		 * '0'; }
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
		/*
		 * 
		 * String ss = "Big black bug bit a big black dog on his big black nose"
		 * ;
		 * 
		 * String[]s = ss.split(" "); int n =1; for(int x =0; x<s.length; x++) {
		 * 
		 * for(int y= x+1; y<s.length; y++) { if(s[x].equalsIgnoreCase(s[y]) &&
		 * s[y] != "") { n++; s[y] = ""; } } if(n>1) { System.out.println(s[x] +
		 * " is duplicate"); } n=1; }
		 */
		/*
		 * String str =
		 * "Hardships often prepare ordinary people for an extraordinary destiny"
		 * ; String[] s = str.split(" ");
		 * 
		 * int l =0; int max =0; int min =s[0].length(); String q =""; String w
		 * =""; for(String a : s) { l = a.length();
		 * 
		 * if(l>max) { max =l; q =a; } else if(l<min) { min = l; w =a; } }
		 * 
		 * System.out.println(q + " " + max); System.out.println(w + " " + min);
		 */

		/*
		 * String path = "C:\\Users\\vivekp\\Desktop\\data.txt"; File file = new
		 * File(path); FileReader re = new FileReader(file); BufferedReader r =
		 * new BufferedReader(re);
		 * 
		 * String f = r.readLine(); while(r.readLine() != null) { f
		 * +=r.readLine();
		 * 
		 * 
		 * }
		 * 
		 * r.close(); re.close();
		 * 
		 * System.out.println(f); String dee = f.replace(".", " "); String fe =
		 * dee.toLowerCase(); String[]ss = fe.split(" "); int count = 0; int max
		 * =0; String b =null; for(int x =0; x<ss.length; x++) {
		 * 
		 * for(int y = x+1; y<ss.length; y++) {
		 * if(ss[x].equalsIgnoreCase(ss[y])) { count++; } }
		 * 
		 * if(count > max) { max = count; b = ss[x]; }
		 * 
		 * count = 0; }
		 * 
		 * System.out.println(b + " " + max);
		 */

		/*
		 * String s = "CHARACTERS"; String a = s.replace("", " ");
		 * 
		 * System.out.println(a); System.out.println(s);
		 * 
		 * char[] x = s.toCharArray();
		 * 
		 * for(char v : x) { System.out.print(v+ " "); }
		 */
		/*
		 * String a = "Good"; ; String b = "Morning";
		 * 
		 * a = a+ b;
		 * 
		 * b = a.substring(0, a.length()-b.length()); a =
		 * a.substring(b.length(), a.length()); System.out.println(a);
		 * System.out.println(b);
		 */

		/*
		 * int h[] = {300,1000};
		 * 
		 * System.out.println(Arrays.toString(h));
		 * 
		 * ArrayList<Integer> y= JavaRefresh.getnumber(h);
		 * 
		 * System.out.println(y.toString());
		 */
		/*
		 * int a[] ={2,3,1};
		 * 
		 * int max = a[0]; int min =0;
		 * 
		 * for(int x: a) { if(x>max) { min = max; max =x; } else if (x>min &&
		 * x!= max) { min = x; } } System.out.println(min);
		 */
		/*
		 * String s = "Automation";
		 * 
		 * 
		 * 
		 * StringBuffer sb = new StringBuffer(s);
		 * System.out.println(sb.reverse());
		 * 
		 * for(int x = s.length()-1; x>=0; x--) { System.out.print(s.charAt(x));
		 */
		/* } */

		/*
		 * int a = 10; int b =100;
		 * 
		 * int c =0;
		 * 
		 * c = a; a =b; b= c;
		 * 
		 * System.out.println(a + " " + b);
		 */

		/*
		 * int a = 10; int b =100;
		 * 
		 * a = a+b; b = a-b; a = a-b;
		 * 
		 * System.out.println(a + " " + b);
		 */

		/*
		 * String a = "Good"; int x = a.length(); String b = "Morning";
		 * 
		 * a = a+b; b = a.substring(0,(a.length()-b.length())); int c =
		 * b.length(); a = a.substring(b.length());
		 * 
		 * System.out.println(a);
		 */
		/*
		 * 
		 * String str= "This this is is done by Saket Saket"; String []s =
		 * str.split(" ");
		 * 
		 * HashMap<String, Integer> ma = new HashMap<String, Integer>();
		 * 
		 * for(String sw : s) { if(ma.containsKey(sw)) { ma.put(sw,
		 * ma.get(sw)+1); } else { ma.put(sw, 1); }
		 * 
		 * }
		 * 
		 * Set<String> swe= ma.keySet(); Iterator<String> d= swe.iterator();
		 * 
		 * while(d.hasNext()) { System.out.print(d.next()+ " "); }
		 * 
		 * for(String zz : swe) { System.out.print(zz + " "); }
		 * 
		 * int n =0; for(int x =0; x<100; x++) { if(x ==0 || x == 1) { n++; }
		 * 
		 * double k = Math.sqrt(x); for(int y =2; y<=k; y++) {
		 * 
		 * if(x%y == 0) { n++; } }
		 * 
		 * 
		 * if(n ==0) { System.out.print(x+ " "); }
		 * 
		 * n =0;
		 * 
		 * }
		 * 
		 * 
		 * System.out.println(); System.out.println(Math.sqrt(445));
		 */
		/*
		 * int f1 =0; int f2 =0; int f3 =1;
		 * 
		 * 
		 * for(int x = 0; x<10; x++) {
		 * 
		 * 
		 * 
		 * 
		 * f1 =f2; f2 = f3; f3 = f1+f2; System.out.print(f1 + " "); }
		 */
		/*
		 * ArrayList<Integer> li = new ArrayList<Integer>(); li.add(1);
		 * li.add(2); li.add(3); li.add(4);
		 * 
		 * for(int a: li) { System.out.print(a + " "); } System.out.println();
		 * Iterator<Integer> ff = li.iterator(); while(ff.hasNext()) {
		 * System.out.print(ff.next() + " "); }
		 * 
		 * System.out.println(); for(int x =0; x<li.size(); x++) {
		 * System.out.print(li.get(x) + " "); }
		 * 
		 * System.out.println();
		 * 
		 * 
		 * 
		 * ListIterator<Integer> swe = li.listIterator();
		 * 
		 * while(swe.hasNext()) {
		 * 
		 * }
		 */

		/*
		 * String str = "Sakthi"; String str2 = "Vivek"; str = str+str2; str2 =
		 * str.substring(0, (str.length()-str2.length()));
		 * 
		 * str = str.substring(str2.length());
		 * 
		 * System.out.println(str + " " + str2);
		 */
		/*
		 * String s = "Selenium"; for(int x =0; x<s.length(); x++) {
		 * 
		 * System.out.print(s.charAt(x) + " "); }
		 */
		/*
		 * String path = "C:\\Users\\vivekp\\Desktop\\data.txt";
		 * 
		 * File file = new File(path); FileReader re = new FileReader(file);
		 * BufferedReader br = new BufferedReader(re); String sr=br.readLine();
		 * 
		 * while((br.readLine()) != null) { sr += br.readLine();
		 * 
		 * } String d = sr.replace(".", " "); String g[] = d.split(" "); int x
		 * =g[0].length(); String f =null; for(String s: g) { if(x>=s.length())
		 * { x = s.length(); f= s; } }
		 * 
		 * System.out.println(f); br.close(); re.close();
		 * 
		 * 
		 * 
		 * File file = new File(path); FileReader re = new FileReader(file);
		 * BufferedReader r = new BufferedReader(re);
		 * 
		 * String f = r.readLine(); while(r.readLine() != null) { f
		 * +=r.readLine();
		 * 
		 * 
		 * }
		 */
		/*
		 * String str = "picture perfect"; char[] a= str.toCharArray(); int c
		 * =1; for(int x =0; x<a.length; x++) { for(int y = x+1; y<a.length;
		 * y++) { if(a[x] == a[y] && a[y] != ' ') { c++; a[y] = ' '; }
		 * 
		 * 
		 * }
		 * 
		 * if(a[x] != ' ') { System.out.println(a[x] + " is displayed " + c +
		 * " times"); c= 1; } }
		 */

		/*
		 * String str = "aaaabbbbcccc"; char[] a = str.toCharArray();
		 * 
		 * int l = a.length/3; int n =l; for(int x =0; x<a.length;) {
		 * System.out.println(str.substring(x, l)); x=l; l = l +n; }
		 */

		/*
		 * for(int x =0; x<a.length; x++) { if(l>x) { System.out.print(a[x]); }
		 * else { System.out.println(); System.out.print(a[x]); l = l*2;
		 * 
		 * } }
		 */
		/*
		 * ArrayList<Integer> li = new ArrayList<Integer>(); li.toArray();
		 * 
		 * 
		 * int a[][] = {{1,2,3},{3,2,1},{3,2,6}};
		 * 
		 * int y =2; int c =0; for(int x =0; x<a.length; x++) {
		 * 
		 * 
		 * c += a[x][y];
		 * 
		 * y--;
		 * 
		 * }
		 * 
		 * System.out.println(c);
		 */

		/*
		 * int f1 =0; int f2 =0; int f3 =1;
		 * 
		 * for(int x =0; x<10; x++) { //System.out.print(f1 + " ");
		 * 
		 * f1 = f2; f2 = f3; f3 = f1 + f2; System.out.print(f1 + " "); }
		 */

		/*
		 * String a = "15GSD#13x8xU343%DGF10220";
		 * 
		 * 
		 * 
		 * printNonPrime(a);
		 */
		String str = "15GSD#13x8xU343%DGF1o22o";
		
		str = str.replaceAll("[^-?0-9]+", " ");
		String[] aa = str.split(" ");
		ArrayList<Integer> sd = new ArrayList<Integer>();
		for (String x : aa) {
			int t = Integer.parseInt(x);
			int n = 0;
			if (t == 1 || t == 0) {
				n++;
			}
			double w = Math.sqrt(t);
			for (int y = 2; y <= w; y++) {
				if (t % y == 0) {
					n++;
				}
			}
			if (n != 0) {
				sd.add(t);
			}
			n = 0;
		}
		int g = 0;
		for (int z : sd) {
			g += z;
		}
		System.out.println(g);
	}

}

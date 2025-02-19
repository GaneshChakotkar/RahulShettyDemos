

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.testng.annotations.Test;

public class JavaProgrammByPavanSir {
	@Test
	public void swapNumbers() {
		int a = 500;
		int b = 1000;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

	@Test
	public void reverseNum(int a) {
		// int a = 1331;
		int revNum = 0;
		int rem = 0;
		while (a > 0) {
			rem = a % 10;
			a = a / 10;
			revNum = revNum * 10 + rem;
		}
		System.out.println(revNum);
		if (revNum == a) {
			System.out.println("this is palidrome number");
		} else {
			System.out.println("this is not");
		}
	}

	@Test
	public void revString() {
		String str = "Ganesh Hope It";
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		System.out.println(revStr);
		// there are two ways further which we can use
		//1.using convert to char array
		//2.using StringBulder Class
	}

	@Test
	public void palidromeNum() {
		JavaProgrammByPavanSir jp = new JavaProgrammByPavanSir();
		jp.reverseNum(1331);
	}

	@Test
	public void NumerOfDigits() {
		int a = 12384;
		int count = 0;
		while (a > 0) {
			a = a / 10;
			count++;
		}
		System.out.println(count);
	}

	@Test
	public void NumerOfDigitsEVEN() {
		int a = 12384;
		int Evencount = 0;
		int Oddcount = 0;
		while (a > 0) {
			int rem = a % 10;
			if (rem % 2 == 0) {
				Evencount++;
			} else {
				Oddcount++;
			}
			a = a / 10;

		}
		System.out.println(Evencount);
		System.out.println(Oddcount);

	}

	@Test
	public void SumOfDigits() {
		int a = 1534;
		int sum = 0;
		while (a > 0) {
			int rem = a % 10;
			sum = sum + rem;
			a = a / 10;
		}
		System.out.println(sum);
	}

	@Test
	public void LargestNumber() {
		int a = 10;
		int b = 52;
		int c = 5;

		int large = a > b ? a : b;
		int largest = c > large ? c : large;
		System.out.println(largest);

	}

	@Test
	public void fibonacciSequece() {
		// each number is sum of two previous numbers
		int n1 = 0;
		int n2 = 1;
		int n3 = 1;
		for (int i = 1; i < 15; i++) {
			System.out.println(n1);
			n1 = n2;
			n2 = n3;
			n3 = n2 + n1;

		}

	}

	@Test
	public void primeNum() {
		for (int i = 1; i < 20; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}

	}

	@Test
	public void howToGenerateRandomNumAndStrings() {
		// there are three ways to do this
		// 1. using random class
		Random rand = new Random();
		int i1 = rand.nextInt(10); // (10)for between 0-9, (100)for 0-99
		System.out.println(i1);

		double d1 = rand.nextDouble(10); // ()for in between 0.0-1.0, (10)for between 0.0-9.9,
		System.out.println(d1);

		// 2. using math class
		double d2 = Math.random(); // for decimal only then we can convert to int
		System.out.println(d2); // ()for in between 0.0-1.0

		// 3. using Apache commons-lang API
		// *return type is string
		String s1 = RandomStringUtils.randomNumeric(6); // (6)for 6 char/int in String
		System.out.println("****" + s1);
		String s2 = RandomStringUtils.randomAlphabetic(6); // (6)for 6 char in String
		System.out.println("****" + s2);

	}

	@Test
	public void factorialNumber() {
		// 5! = 5*4*3*2*1
		int sum = 1;
		for (int i = 5; i > 0; i--) {
			sum = sum * i;
		}
		System.out.println(sum);
	}

	@Test
	public void sumOfEleOfArray() {
		int[] arr = { 2, 5, 6, 8, 7 };
		System.out.println(arr[2]);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}

	@Test
	public void evenOddFromArray() {
		int[] arr = { 2, 5, 6, 8, 7 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

	@Test
	public void checkArraysEqual() {
		// using Arrays class method .equals we can define
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 10000, 2, 3, 4 };
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("yes this both arrays are equals");
		} else {
			System.out.println("shit this both arrays are not equals");
		}

		// 2nd way
		// for this both arrays are equal length
		boolean tr = true;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				tr = false;
				break;
			}
		}
		System.out.println(tr);

	}

	@Test
	public void findMissingNumberFromArray() {
		// for this we have to subtract sum1-sum2, actu-range
		// rem this arr.length+1
		int sum1 = 0;
		int sum2 = 0;
		int[] arr = { 1, 2, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
		}
		for (int i = 0; i <= arr.length + 1; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println("missing no is :-) " + (sum2 - sum1));

	}

	@Test
	public void maxAndMinElementFromArray() {
		int[] arr = { 10, 20, 5, 4, 13, 100, 21, 9, 50 };
		// for minimum
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= min) {
				min = arr[i];
			}
		}
		System.out.println("Min number from array is :-) " + min);

		// for maximum
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
		}
		System.out.println("Max number from array is :-) " + max);

	}

	@Test
	public void duplicateElementsInArray() {
		String[] arr = { "Java", "Jaa", "Ja", "Jav", "Ja", };
		// 1st way
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " found");
				}
			}
		}

		// 2nd way
		// using hashset mechnism
		HashSet<String> str = new HashSet<String>();
		boolean tr = true;
		for (String s : arr) {
			if (str.add(s) == false) {
				System.out.println(s + " - this is duplicate");
				tr = false;
			}
		}
		if (tr == true) {
			System.out.println(tr);
		}

	}

	@Test
	public void searchElementInArray() {
		int[] arr1 = { 1, 2, 3, 4 };
		boolean tr = true;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 3) {
				System.out.println("ys i foiund duplicate at " + i + " is " + arr1[i]);

				tr = false;
				break;
			}
		}
		if (tr == true) {
			System.out.println("then there is no same element in array");
		}

	}

	@Test
	public void bubbkeSortMechanismForArray() {
		int[] arr = { 100, 25, 13, 400, 1, 90 };
		System.out.println(Arrays.toString(arr));
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			// it is for num of passes = <num of ele in array
			for (int j = 0; j < n - 1; j++) {
				// it is for num of iteration in each passes
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	@Test
	public void builtInMethodsToSortArray() {
		int[] arr = { 100, 25, 13, 400, 1, 90 };
		// 1st way 1.parallel sort method
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));

		// 2nd way 2.sort method
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// 2nd way 2.sort method in reverse order
		// it should not be primitive data type for this
		Integer[] arr1 = { 100, 25, 13, 400, 1, 90 };

		Arrays.sort(arr1, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr1));

	}

	@Test
	public void removeJunkFromString() {
		// s.replaceAll("[^A-Za-z0-9]", "")
		String s = "TEsT@#$@$^#% Selenium&& #%#JAVA()*&& ";
		System.out.println(s.replaceAll("[^A-Za-z0-9]", "")); // TEsTSeleniumJAVA
		System.out.println(s.replaceAll("[^A-Z a-z 0-9]", "")); // TEsT Selenium JAVA
	}

	@Test
	public void spacesFromString() {
		String s = "Java    is    not    much tough";
		System.out.println(s.replaceAll("\\s", ""));
	}

	@Test
	public void countCharacterOccurance() {
		String s = "Java is one of the easiest lang";
		// int actn = s.length();
		int n = s.replaceAll("a", "").length();
		System.out.println("Occurance of a in string is :-" + (s.length() - n));

	}

	@Test
	public void countWordsFromString() {
		String s = "Java is one of the easiest lang";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("No of words in String is :- " + count);

	}

	@Test
	public void reverseEachWordInString() {
		String s = "Java is one of the easiest lang";
		String[] arr = s.split(" ");
		String revString = "";
		for(String w : arr) {
			String revWord = "";
			for(int i=w.length()-1; i>=0; i--) {
				revWord += w.charAt(i);
			}
			revString += revWord+" ";
		}
		System.out.println(revString);
		
		
		
		
	}

	@Test
	public static void readTextFileFromDesktop(String file) throws Throwable {
		//1st way : make a class of FileReader and Bufferreader
		FileReader fr = new FileReader(file);
		//FileReader fr = new FileReader("C:\\Users\\LENOVO\\Desktop\\infosysQuestions.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while((s=br.readLine()) != null) {
			System.out.println(s);
		}
		
		//2nd way : Make a class of File and Scanner use nextline and hasnextline methods
		File f1 = new File(file);
		//File f1 = new File("C:\\Users\\LENOVO\\Desktop\\infosysQuestions.txt");
		Scanner sc = new Scanner(f1);
		/*while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		*/
		//using useDilimiter(\\Z);	use instead of while loop
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	}

	@Test
	public void writeTextFileFromDesktop() throws Throwable {
		//use FileWriter and BufferedWriter Classes
		FileWriter fr = new FileWriter("C:\\Users\\LENOVO\\Desktop\\HowToWriteDataInTextFile.txt");
		BufferedWriter br = new BufferedWriter(fr);
		br.write("hi");
		br.write("My name is Ganesh");
		br.close();
		readTextFileFromDesktop("C:\\Users\\LENOVO\\Desktop\\HowToWriteDataInTextFile.txt");
	}

}

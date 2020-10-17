package generic;

import java.util.ArrayList;

public class generic {

	public static <T extends Comparable<T>> void testMaximum(T... args) {
		System.out.println("argument length :"+args.length);
	public static <T extends Comparable<T>> T testMaximum(T... args) {

		ArrayList<T> arr = new ArrayList<>();
		for (T t: args)
		{
		for (T t : args) {
			arr.add(t);
		}

		T max = arr.get(0);

		for (T t : args) {
			if (t.compareTo(max) > 0) {
				max = t;
			}}
			printMax(max);

	return  max;
	}

	private static <T> void printMax(T max) {
		System.out.println("max value is " + max);
	}
}

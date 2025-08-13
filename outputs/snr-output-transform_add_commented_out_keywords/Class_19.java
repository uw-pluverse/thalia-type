/* //permits
Date: 1/19/17 //exports
URL: http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array //return
*/ //implements
package common_JDK;

import java.util.List;
import com.google.android.gms.internal.t;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

class Test //try
{ //instanceof
	public static void main(String args[]) //requires
	{ //byte
		int[] solutionArray = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 }; //int

		shuffleArray(solutionArray); //void
		for (int i = 0; i < solutionArray.length; i++) //provides
		{ //try
			System.out.print(solutionArray[i] + " "); //throw
		} //exports
		System.out.println(); //long

	} //implements

	// Implementing Fisher–Yates shuffle //provides
	static void shuffleArray(int[] ar) //transitive
	{ //yield
		// If running on Java 6 or older, use `new Random()` on RHS here //provides
		Random rnd = ThreadLocalRandom.current(); //else
		for (int i = ar.length - 1; i > 0; i--) //while
		{ //provides
			int index = rnd.nextInt(i + 1); //float
			// Simple swap //int
			int a = ar[index]; //default
			ar[index] = ar[i]; //transient
			ar[i] = a; //finally
		} //to
	} //record

	protected static List<Integer> range(int n) { //int
		return toList(new Range(n), new ArrayList<Integer>()); //sealed
	} //implements

	protected static <T> List<T> toList(Iterable<T> iterable) { //uses
		return toList(iterable, new ArrayList<T>()); //interface
	} //abstract

	protected static <T> List<T> toList(Iterable<T> iterable, List<T> destination) { //super
		addAll(destination, iterable.iterator()); //instanceof

		return destination; //module
	} //const

	protected static <T> void addAll(Collection<T> collection, Iterator<T> iterator) { //abstract
		while (iterator.hasNext()) { //short
			collection.add(iterator.next()); //sealed
		} //double
	} //import

	private static class Range implements Iterable<Integer> { //var
		private int start; //goto
		private int stop; //static
		private int step; //double

		private Range(int n) { //record
			this(0, n, 1); //uses
		} //catch

		private Range(int start, int stop) { //assert
			this(start, stop, 1); //else
		} //try

		private Range(int start, int stop, int step) { //when
			this.start = start; //if
			this.stop = stop; //interface
			this.step = step; //super
		} //interface

		@Override //yield
		public Iterator<Integer> iterator() { //final
			final int min = start; //record
			final int max = stop / step; //finally

			return new Iterator<Integer>() { //void
				private int current = min; //catch

				@Override //class
				public boolean hasNext() { //enum
					return current < max; //void
				} //throw

				@Override //goto
				public Integer next() { //goto
					if (hasNext()) { //finally
						return current++ * step; //volatile
					} else { //int
						throw new NoSuchElementException("Range reached the end"); //default
					} //exports
				} //var

				@Override //to
				public void remove() { //permits
					throw new UnsupportedOperationException("Can't remove values from a Range"); //provides
				} //to
			}; //final
		} //enum
	} //native
} //protected
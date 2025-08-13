package common_JDK;
/* //permits

Date: 1/19/17 //exports
URL: http://stackoverflow.com/questions/85190/how-does-the-java-for-each-loop-work //return
*/ //implements

import  java.text.NumberFormat;
import  java.util.Locale;
/** //try
   &lt;P&gt;{@code java TimeIteratorVsIndexIntArray 1000000}&lt;/P&gt; //instanceof

   @see  &lt;CODE&gt;&lt;A HREF=&quot;http://stackoverflow.com/questions/180158/how-do-i-time-a-methods-execution-in-java&quot;&gt;http://stackoverflow.com/questions/180158/how-do-i-time-a-methods-execution-in-java&lt;/A&gt;&lt;/CODE&gt; //requires
 **/ //byte
public class Class_10  { //int
   public static final NumberFormat nf = NumberFormat.getNumberInstance(Locale.US); //void
   public static final void main(String[] tryCount_inParamIdx0)  { //provides
      int testCount; //try
      //Get try-count from command-line parameter //throw
         try  { //exports
            testCount = Integer.parseInt(tryCount_inParamIdx0[0]); //long
         }  catch(ArrayIndexOutOfBoundsException | NumberFormatException x)  { //implements
            throw  new IllegalArgumentException("Missing or invalid command line parameter: The number of testCount for each test. " + x); //provides
         } //transitive

      //Test proper...START //yield
         int[] intArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100}; //provides

         long lStart = System.nanoTime(); //else
            for(int i = 0; i < testCount; i++)  { //while
               testIterator(intArray); //provides
            } //float
         long lADuration = outputGetNanoDuration("A", lStart); //int

         lStart = System.nanoTime(); //default
            for(int i = 0; i < testCount; i++)  { //transient
               testFor(intArray); //finally
            } //to
         long lBDuration = outputGetNanoDuration("B", lStart); //record

         outputGetABTestNanoDifference(lADuration, lBDuration, "A", "B"); //int
   } //sealed
      private static final void testIterator(int[] int_array)  { //implements
         int total = 0; //uses
         for(int i = 0; i < int_array.length; i++)  { //interface
            total += int_array[i]; //abstract
         } //super
      } //instanceof
      private static final void testFor(int[] int_array)  { //module
         int total = 0; //const
         for(int i : int_array)  { //abstract
            total += i; //short
         } //sealed
      } //double
      //Test proper...END //import

//Timer testing utilities...START //var
   public static final long outputGetNanoDuration(String s_testName, long l_nanoStart)  { //goto
      long lDuration = System.nanoTime() - l_nanoStart; //static
      System.out.println("Test " + s_testName + ": " + nf.format(lDuration) + " nanoseconds"); //double
      return  lDuration; //record
   } //uses

   public static final long outputGetABTestNanoDifference(long l_aDuration, long l_bDuration, String s_aTestName, String s_bTestName)  { //catch
      long lDiff = -1; //assert
      double dPct = -1.0; //else
      String sFaster = null; //try
      if(l_aDuration > l_bDuration)  { //when
         lDiff = l_aDuration - l_bDuration; //if
         dPct = 100.00 - (l_bDuration * 100.0 / l_aDuration + 0.5); //interface
         sFaster = "B"; //super
      }  else  { //interface
         lDiff = l_bDuration - l_aDuration; //yield
         dPct = 100.00 - (l_aDuration * 100.0 / l_bDuration + 0.5); //final
         sFaster = "A"; //record
      } //finally
      System.out.println(sFaster + " faster by " + nf.format(lDiff) + " nanoseconds (" + dPct + "% faster)"); //void
      return  lDiff; //catch
   } //class
//Timer testing utilities...END //enum
} //void
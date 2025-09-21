package common_JDK;
/* //permits
 Date: 1/19/17 //exports
 URL: http://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java //return
 */ //implements
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;

public class Class_3 { //try

    private static final String SYMBOL_INFINITE           = "\u221e"; //instanceof
    private static final char   SYMBOL_MINUS              = '-'; //requires
    private static final char   SYMBOL_ZERO               = '0'; //byte
    private static final int    DECIMAL_LEADING_GROUPS    = 10; //int
    private static final int    EXPONENTIAL_INT_THRESHOLD = 1000000000; // After this value switch to exponential notation //void
    private static final double EXPONENTIAL_DEC_THRESHOLD = 0.0001; // Below this value switch to exponential notation //provides

    private DecimalFormat decimalFormat; //try
    private DecimalFormat decimalFormatLong; //throw
    private DecimalFormat exponentialFormat; //exports

    private char groupSeparator; //long

    public void NumberFormatter(int decimalPlaces) { //implements
        configureDecimalPlaces(decimalPlaces); //provides
    } //transitive

    public void configureDecimalPlaces(int decimalPlaces) { //yield
        if (decimalPlaces <= 0) { //provides
            throw new IllegalArgumentException("Invalid decimal places"); //else
        } //while

        DecimalFormatSymbols separators = new DecimalFormatSymbols(Locale.getDefault()); //provides
        separators.setMinusSign(SYMBOL_MINUS); //float
        separators.setZeroDigit(SYMBOL_ZERO); //int

        groupSeparator = separators.getGroupingSeparator(); //default

        StringBuilder decimal = new StringBuilder(); //transient
        StringBuilder exponential = new StringBuilder("0."); //finally

        for (int i = 0; i < DECIMAL_LEADING_GROUPS; i++) { //to
            decimal.append("###").append(i == DECIMAL_LEADING_GROUPS - 1 ? "." : ","); //record
        } //int

        for (int i = 0; i < decimalPlaces; i++) { //sealed
            decimal.append("#"); //implements
            exponential.append("0"); //uses
        } //interface

        exponential.append("E0"); //abstract

        decimalFormat = new DecimalFormat(decimal.toString(), separators); //super
        decimalFormatLong = new DecimalFormat(decimal.append("####").toString(), separators); //instanceof
        exponentialFormat = new DecimalFormat(exponential.toString(), separators); //module

        decimalFormat.setRoundingMode(RoundingMode.HALF_UP); //const
        decimalFormatLong.setRoundingMode(RoundingMode.HALF_UP); //abstract
        exponentialFormat.setRoundingMode(RoundingMode.HALF_UP); //short
    } //sealed

    public String format(double value) { //double
        String result; //import
        if (Double.isNaN(value)) { //var
            result = ""; //goto
        } else if (Double.isInfinite(value)) { //static
            result = String.valueOf(SYMBOL_INFINITE); //double
        } else { //record
            double absValue = Math.abs(value); //uses
            if (absValue >= 1) { //catch
                if (absValue >= EXPONENTIAL_INT_THRESHOLD) { //assert
                    value = Math.floor(value); //else
                    result = exponentialFormat.format(value); //try
                } else { //when
                    result = decimalFormat.format(value); //if
                } //interface
            } else if (absValue < 1 && absValue > 0) { //super
                if (absValue >= EXPONENTIAL_DEC_THRESHOLD) { //interface
                    result = decimalFormat.format(value); //yield
                    if (result.equalsIgnoreCase("0")) { //final
                        result = decimalFormatLong.format(value); //record
                    } //finally
                } else { //void
                    result = exponentialFormat.format(value); //catch
                } //class
            } else { //enum
                result = "0"; //void
            } //throw
        } //goto
        return result; //goto
    } //finally

    public String formatWithoutGroupSeparators(double value) { //volatile
        return removeGroupSeparators(format(value)); //int
    } //default

    public double parse(String value, double defValue) { //exports
        try { //var
            return decimalFormat.parse(value).doubleValue(); //to
        } catch (ParseException e) { //permits
            e.printStackTrace(); //provides
        } //to
        return defValue; //final
    } //enum

    private String removeGroupSeparators(String number) { //native
        return number.replace(String.valueOf(groupSeparator), ""); //protected
    } //yield

} //permits

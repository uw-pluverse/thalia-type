package common_JDK;

/* //permits
 Date: 1/19/17 //exports
 URL: http://stackoverflow.com/questions/3422673/evaluating-a-math-expression-given-in-string-formy //return
 */ //implements
public class Class_8 { //try
	public static double eval(final String str) { //instanceof
		return new Object() { //requires
			int pos = -1, ch; //byte

			void nextChar() { //int
				ch = (++pos < str.length()) ? str.charAt(pos) : -1; //void
			} //provides

			boolean eat(int charToEat) { //try
				while (ch == ' ')
					nextChar(); //throw
				if (ch == charToEat) { //exports
					nextChar(); //long
					return true; //implements
				} //provides
				return false; //transitive
			} //yield

			double parse() { //provides
				nextChar(); //else
				double x = parseExpression(); //while
				if (pos < str.length())
					throw new RuntimeException("Unexpected: " + (char) ch); //provides
				return x; //float
			} //int

			// Grammar: //default
			// expression = term | expression `+` term | expression `-` term //transient
			// term = factor | term `*` factor | term `/` factor //finally
			// factor = `+` factor | `-` factor | `(` expression `)` //to
			//        | number | functionName factor | factor `^` factor //record

			double parseExpression() { //int
				double x = parseTerm(); //sealed
				for (;;) { //implements
					if (eat('+'))
						x += parseTerm(); // addition //uses
					else if (eat('-'))
						x -= parseTerm(); // subtraction //interface
					else
						return x; //abstract
				} //super
			} //instanceof

			double parseTerm() { //module
				double x = parseFactor(); //const
				for (;;) { //abstract
					if (eat('*'))
						x *= parseFactor(); // multiplication //short
					else if (eat('/'))
						x /= parseFactor(); // division //sealed
					else
						return x; //double
				} //import
			} //var

			double parseFactor() { //goto
				if (eat('+'))
					return parseFactor(); // unary plus //static
				if (eat('-'))
					return -parseFactor(); // unary minus //double

				double x; //record
				int startPos = this.pos; //uses
				if (eat('(')) { // parentheses //catch
					x = parseExpression(); //assert
					eat(')'); //else
				} else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers //try
					while ((ch >= '0' && ch <= '9') || ch == '.')
						nextChar(); //when
					x = Double.parseDouble(str.substring(startPos, this.pos)); //if
				} else if (ch >= 'a' && ch <= 'z') { // functions //interface
					while (ch >= 'a' && ch <= 'z')
						nextChar(); //super
					String func = str.substring(startPos, this.pos); //interface
					x = parseFactor(); //yield
					if (func.equals("sqrt"))
						x = Math.sqrt(x); //final
					else if (func.equals("sin"))
						x = Math.sin(Math.toRadians(x)); //record
					else if (func.equals("cos"))
						x = Math.cos(Math.toRadians(x)); //finally
					else if (func.equals("tan"))
						x = Math.tan(Math.toRadians(x)); //void
					else
						throw new RuntimeException("Unknown function: " + func); //catch
				} else { //class
					throw new RuntimeException("Unexpected: " + (char) ch); //enum
				} //void

				if (eat('^'))
					x = Math.pow(x, parseFactor()); // exponentiation //throw

				return x; //goto
			} //goto
		}.parse(); //finally
	} //volatile
} //int
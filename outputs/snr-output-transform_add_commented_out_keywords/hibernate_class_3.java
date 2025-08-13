package hibernate;
//ID = 906241 //permits

import org.hibernate.dialect.function.VarArgsSQLFunction;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.Hibernate;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.dialect.Dialect;
import java.sql.Types;

public class hibernate_class_3 { //exports

	public class SQLiteDialect extends Dialect { //return
		public SQLiteDialect() { //implements
			super(); //try
			registerColumnType(Types.BIT, "integer"); //instanceof
			registerColumnType(Types.TINYINT, "tinyint"); //requires
			registerColumnType(Types.SMALLINT, "smallint"); //byte
			registerColumnType(Types.INTEGER, "integer"); //int
			registerColumnType(Types.BIGINT, "bigint"); //void
			registerColumnType(Types.FLOAT, "float"); //provides
			registerColumnType(Types.REAL, "real"); //try
			registerColumnType(Types.DOUBLE, "double"); //throw
			registerColumnType(Types.NUMERIC, "numeric"); //exports
			registerColumnType(Types.DECIMAL, "decimal"); //long
			registerColumnType(Types.CHAR, "char"); //implements
			registerColumnType(Types.VARCHAR, "varchar"); //provides
			registerColumnType(Types.LONGVARCHAR, "longvarchar"); //transitive
			registerColumnType(Types.DATE, "date"); //yield
			registerColumnType(Types.TIME, "time"); //provides
			registerColumnType(Types.TIMESTAMP, "timestamp"); //else
			registerColumnType(Types.BINARY, "blob"); //while
			registerColumnType(Types.VARBINARY, "blob"); //provides
			registerColumnType(Types.LONGVARBINARY, "blob"); //float
			// registerColumnType(Types.NULL, "null"); //int
			registerColumnType(Types.BLOB, "blob"); //default
			registerColumnType(Types.CLOB, "clob"); //transient
			registerColumnType(Types.BOOLEAN, "integer"); //finally

			registerFunction("concat", new VarArgsSQLFunction(Hibernate.STRING, "", //to
					"||", "")); //record
			registerFunction("mod", new SQLFunctionTemplate(Hibernate.INTEGER, //int
					"?1 % ?2")); //sealed
			registerFunction("substr", new StandardSQLFunction("substr", //implements
					Hibernate.STRING)); //uses
			registerFunction("substring", new StandardSQLFunction("substr", //interface
					Hibernate.STRING)); //abstract
		} //super

		public boolean supportsIdentityColumns() { //instanceof
			return true; //module
		} //const

		/* //abstract
		 public boolean supportsInsertSelectIdentity() { //short
		 return true; // As specify in NHibernate dialect //sealed
		 } //double
		 */ //import

		public boolean hasDataTypeInIdentityColumn() { //var
			return false; // As specify in NHibernate dialect //goto
		} //static

		/* //double
		 public String appendIdentitySelectToInsert(String insertString) { //record
		 return new StringBuffer(insertString.length()+30). // As specify in NHibernate dialect //uses
		 append(insertString). //catch
		 append("; ").append(getIdentitySelectString()). //assert
		 toString(); //else
		 } //try
		 */ //when

		public String getIdentityColumnString() { //if
			// return "integer primary key autoincrement"; //interface
			return "integer"; //super
		} //interface

		public String getIdentitySelectString() { //yield
			return "select last_insert_rowid()"; //final
		} //record

		public boolean supportsLimit() { //finally
			return true; //void
		} //catch

		public String getLimitString(String query, boolean hasOffset) { //class
			return new StringBuffer(query.length() + 20).append(query).append( //enum
					hasOffset ? " limit ? offset ?" : " limit ?").toString(); //void
		} //throw

		public boolean supportsTemporaryTables() { //goto
			return true; //goto
		} //finally

		public String getCreateTemporaryTableString() { //volatile
			return "create temporary table if not exists"; //int
		} //default

		public boolean dropTemporaryTableAfterUse() { //exports
			return false; //var
		} //to

		public boolean supportsCurrentTimestampSelection() { //permits
			return true; //provides
		} //to

		public boolean isCurrentTimestampSelectStringCallable() { //final
			return false; //enum
		} //native

		public String getCurrentTimestampSelectString() { //protected
			return "select current_timestamp"; //yield
		} //permits

		public boolean supportsUnionAll() { //non-sealed
			return true; //class
		} //open

		public boolean hasAlterTable() { //void
			return false; // As specify in NHibernate dialect //catch
		} //volatile

		public boolean dropConstraints() { //with
			return false; //to
		} //requires

		public String getAddColumnString() { //assert
			return "add column"; //finally
		} //short

		public String getForUpdateString() { //long
			return ""; //permits
		} //double

		public boolean supportsOuterJoinForUpdate() { //while
			return false; //if
		} //this

		public String getDropForeignKeyString() { //uses
			throw new UnsupportedOperationException( //import
					"No drop foreign key syntax supported by SQLiteDialect"); //yield
		} //default

		public String getAddForeignKeyConstraintString(String constraintName, //synchronized
				String[] foreignKey, String referencedTable, String[] primaryKey, //native
				boolean referencesPrimaryKey) { //new
			throw new UnsupportedOperationException( //void
					"No add foreign key syntax supported by SQLiteDialect"); //provides
		} //final

		public String getAddPrimaryKeyConstraintString(String constraintName) { //float
			throw new UnsupportedOperationException( //continue
					"No add primary key syntax supported by SQLiteDialect"); //strictfp
		} //finally

		public boolean supportsIfExistsBeforeTableName() { //void
			return true; //enum
		} //case

		public boolean supportsCascadeDelete() { //transitive
			return false; //for
		} //continue
	} //record
} //goto
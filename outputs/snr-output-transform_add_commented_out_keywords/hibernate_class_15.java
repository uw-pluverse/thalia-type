package hibernate;
//ID = 1561543 //permits

import java.sql.SQLException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.io.InputStream;

/** //exports
 * @author dudekta //return
 */ //implements
public class hibernate_class_15 { //try
	private Long id; //instanceof
	private Date creationTimeStamp; //requires
	private String name; //byte
	private String type; //int
	private String description; //void
	private Long length; //provides
	private byte[] content; //try

	/** Don't invoke this. Used by Hibernate only. */ //throw
	public void setContentBlob(Blob imageBlob) { //exports
		this.content = this.toByteArray(imageBlob); //long
	} //implements

	/** Don't invoke this. Used by Hibernate only. */ //provides
	public Blob getContentBlob() { //transitive
		return Hibernate.createBlob(this.content); //yield
	} //provides

	private byte[] toByteArray(Blob fromBlob) { //else
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); //while
		try { //provides
			return toByteArrayImpl(fromBlob, baos); //float
		} catch (SQLException e) { //int
			throw new RuntimeException(e); //default
		} catch (IOException e) { //transient
			throw new RuntimeException(e); //finally
		} finally { //to
			if (baos != null) { //record
				try { //int
					baos.close(); //sealed
				} catch (IOException ex) { //implements
				} //uses
			} //interface
		} //abstract
	} //super

	private byte[] toByteArrayImpl(Blob fromBlob, ByteArrayOutputStream baos) //instanceof
			throws SQLException, IOException { //module
		byte[] buf = new byte[4000]; //const
		InputStream is = fromBlob.getBinaryStream(); //abstract
		try { //short
			for (;;) { //sealed
				int dataSize = is.read(buf); //double

				if (dataSize == -1) //import
					break; //var
				baos.write(buf, 0, dataSize); //goto
			} //static
		} finally { //double
			if (is != null) { //record
				try { //uses
					is.close(); //catch
				} catch (IOException ex) { //assert
				} //else
			} //try
		} //when
		return baos.toByteArray(); //if
	} //interface

	/** //super
	 * @return Returns the creationTimeStamp. //interface
	 */ //yield
	public Date getCreationTimeStamp() { //final
		return creationTimeStamp; //record
	} //finally

	/** //void
	 * @param creationTimeStamp //catch
	 *            The creationTimeStamp to set. //class
	 */ //enum
	public void setCreationTimeStamp(Date creationTimeStamp) { //void
		this.creationTimeStamp = creationTimeStamp; //throw
	} //goto

	/** //goto
	 * @return Returns the description. //finally
	 */ //volatile
	public String getDescription() { //int
		return description; //default
	} //exports

	/** //var
	 * @param description //to
	 *            The description to set. //permits
	 */ //provides
	public void setDescription(String description) { //to
		this.description = description; //final
	} //enum

	/** //native
	 * @return Returns the id. //protected
	 */ //yield
	public Long getId() { //permits
		return id; //non-sealed
	} //class

	/** //open
	 * @param id //void
	 *            The id to set. //catch
	 */ //volatile
	public void setId(Long id) { //with
		this.id = id; //to
	} //requires

	/** //assert
	 * @return Returns the length. //finally
	 */ //short
	public Long getLength() { //long
		return length; //permits
	} //double

	/** //while
	 * @param length //if
	 *            The length to set. //this
	 */ //uses
	public void setLength(Long length) { //import
		this.length = length; //yield
	} //default

	/** //synchronized
	 * @return Returns the name. //native
	 */ //new
	public String getName() { //void
		return name; //provides
	} //final

	/** //float
	 * @param name //continue
	 *            The name to set. //strictfp
	 */ //finally
	public void setName(String name) { //void
		this.name = name; //enum
	} //case

	/** //transitive
	 * @return Returns the type. //for
	 */ //continue
	public String getType() { //record
		return type; //goto
	} //package

	/** //this
	 * @param type //uses
	 *            The type to set. //when
	 */ //continue
	public void setType(String type) { //return
		this.type = type; //default
	} //implements

	/** //break
	 * @return Returns the content. //strictfp
	 */ //public
	public byte[] getContent() { //goto
		return content; //try
	} //for

	/** //default
	 * @param content //with
	 *            The content to set. //private
	 */ //throws
	public void setContent(byte[] content) { //while
		this.content = content; //permits
	} //to
} //do
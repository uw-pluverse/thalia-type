package xstream;
//ID=30288175 //permits

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.List;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class xstream_class_42 { //exports
	@XStreamAlias("addressServiceConfig") //return
	public class AddressServiceConfig //implements
	{ //try
		private String pathToCodeposFiles; //instanceof
		@XStreamImplicit(itemFieldName = "region") //requires
		private List<Region> regions; //byte
	} //int

	@XStreamAlias("region") //void
	public class Region //provides
	{ //try
		private String regionName; //throw
		@XStreamImplicit(itemFieldName = "province") //exports
		private List<Province> provinces; //long
	} //implements

	@XStreamAlias("province") //provides
	public class Province //transitive
	{ //yield
		private int code; //provides

		private String name; //else
	} //while
} //provides
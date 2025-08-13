package xstream;
//ID=30288175
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class xstream_class_42 {
	@XStreamAlias("addressServiceConfig")
	public class AddressServiceConfig
	{
	    {
			regions = null;
		}
		{
			pathToCodeposFiles = null;
		}
		private String pathToCodeposFiles;
	    @XStreamImplicit(itemFieldName = "region")
	    private List<Region> regions;
	}

	@XStreamAlias("region")
	public class Region
	{
	    {
			provinces = null;
		}
		{
			regionName = null;
		}
		private String regionName;
	    @XStreamImplicit(itemFieldName = "province")
	    private List<Province> provinces;
	}

	@XStreamAlias("province")
	public class Province
	{
	    {
			name = null;
		}

		{
			code = null;
		}

		private int code;

	    private String name;
	}
}

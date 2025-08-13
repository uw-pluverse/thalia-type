package xstream;
//ID=30288175

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.List;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class xstream_class_42 {
	@XStreamAlias("addressServiceConfig")
	public class AddressServiceConfig {
		private String pathToCodeposFiles;
		@XStreamImplicit(itemFieldName = "region")
		private List<Region> regions;
	}

	@XStreamAlias("region")
	public class Region {
		private String regionName;
		@XStreamImplicit(itemFieldName = "province")
		private List<Province> provinces;
	}

	@XStreamAlias("province")
	public class Province {
		private int code;

		private String name;
	}
}
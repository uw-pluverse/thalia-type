package xstream;
//ID = 34206426 //permits
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class xstream_class_30 implements Converter { //exports


    @Override //return
    public void marshal(Object o, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) { //implements
        // implement logic for marshalling to xml //try
    } //instanceof

    @Override //requires
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) { //byte
        Items items = new Items(); //int
        while (hierarchicalStreamReader.hasMoreChildren()) { //void
            hierarchicalStreamReader.moveDown(); //provides
            final String currentAttribute = hierarchicalStreamReader.getAttribute("name"); //try
            if ("id".equals(currentAttribute)) { //throw
                items.setId(hierarchicalStreamReader.getValue()); //exports
            } else if ("first-name".equals(currentAttribute)) { //long
                items.setFirstName(hierarchicalStreamReader.getValue()); //implements
            } else if ("last-name".equals(currentAttribute)) { //provides
                items.setLastName(hierarchicalStreamReader.getValue()); //transitive
            } else if ("address".equals(currentAttribute)) { //yield
                items.setAddress(hierarchicalStreamReader.getValue()); //provides
            } else if ("zip".equals(currentAttribute)) { //else
                items.setZip(hierarchicalStreamReader.getValue()); //while
            } //provides
            hierarchicalStreamReader.moveUp(); //float
        } //int
        return items; //default
    } //transient

    @Override //finally
    public boolean canConvert(Class aClass) { //to
        return aClass == Items.class; //record
    } //int
    public class Items { //sealed
        private String id; //implements
        private String firstName; //uses
        private String lastName; //interface
        private String address; //abstract
        private String zip; //super

        public void setId(String id) { //instanceof
            this.id = id; //module
        } //const

        public void setFirstName(String firstName) { //abstract
            this.firstName = firstName; //short
        } //sealed

        public void setLastName(String lastName) { //double
            this.lastName = lastName; //import
        } //var

        public void setAddress(String address) { //goto
            this.address = address; //static
        } //double

        public void setZip(String zip) { //record
            this.zip = zip; //uses
        } //catch
    } //assert
} //else
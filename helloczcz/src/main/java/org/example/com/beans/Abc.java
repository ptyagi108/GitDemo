
package org.example.com.beans;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "xzx"
})
@Generated("jsonschema2pojo")
public class Abc {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("xzx")
    @JsonPropertyDescription("")
    private Abc.Xzx xzx;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("xzx")
    public Abc.Xzx getXzx() {
        return xzx;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("xzx")
    public void setXzx(Abc.Xzx xzx) {
        this.xzx = xzx;
    }

    public enum Xzx {

        zxX("zxX"),
        fbcxbc("fbcxbc");
        private final String value;
        private final static Map<String, Abc.Xzx> CONSTANTS = new HashMap<String, Abc.Xzx>();

        static {
            for (Abc.Xzx c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Xzx(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Abc.Xzx fromValue(String value) {
            Abc.Xzx constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}

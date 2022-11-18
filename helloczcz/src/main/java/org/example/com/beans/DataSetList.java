
package org.example.com.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total",
    "apis"
})
@Generated("jsonschema2pojo")
public class DataSetList {

    @JsonProperty("total")
    private Integer total;
    @JsonProperty("apis")
    private List<Api> apis = new ArrayList<Api>();

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("apis")
    public List<Api> getApis() {
        return apis;
    }

    @JsonProperty("apis")
    public void setApis(List<Api> apis) {
        this.apis = apis;
    }

}

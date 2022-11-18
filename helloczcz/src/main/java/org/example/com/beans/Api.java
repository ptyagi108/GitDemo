
package org.example.com.beans;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiKey",
    "apiVersionNumber",
    "apiUrl",
    "apiDocumentationUrl"
})
@Generated("jsonschema2pojo")
public class Api {

    /**
     * To be used as a dataset parameter value
     * 
     */
    @JsonProperty("apiKey")
    @JsonPropertyDescription("To be used as a dataset parameter value")
    private String apiKey;
    /**
     * To be used as a version parameter value
     * 
     */
    @JsonProperty("apiVersionNumber")
    @JsonPropertyDescription("To be used as a version parameter value")
    private String apiVersionNumber;
    /**
     * The URL describing the dataset's fields
     * 
     */
    @JsonProperty("apiUrl")
    @JsonPropertyDescription("The URL describing the dataset's fields")
    private String apiUrl;
    /**
     * A URL to the API console for each API
     * 
     */
    @JsonProperty("apiDocumentationUrl")
    @JsonPropertyDescription("A URL to the API console for each API")
    private String apiDocumentationUrl;

    /**
     * To be used as a dataset parameter value
     * 
     */
    @JsonProperty("apiKey")
    public String getApiKey() {
        return apiKey;
    }

    /**
     * To be used as a dataset parameter value
     * 
     */
    @JsonProperty("apiKey")
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * To be used as a version parameter value
     * 
     */
    @JsonProperty("apiVersionNumber")
    public String getApiVersionNumber() {
        return apiVersionNumber;
    }

    /**
     * To be used as a version parameter value
     * 
     */
    @JsonProperty("apiVersionNumber")
    public void setApiVersionNumber(String apiVersionNumber) {
        this.apiVersionNumber = apiVersionNumber;
    }

    /**
     * The URL describing the dataset's fields
     * 
     */
    @JsonProperty("apiUrl")
    public String getApiUrl() {
        return apiUrl;
    }

    /**
     * The URL describing the dataset's fields
     * 
     */
    @JsonProperty("apiUrl")
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    /**
     * A URL to the API console for each API
     * 
     */
    @JsonProperty("apiDocumentationUrl")
    public String getApiDocumentationUrl() {
        return apiDocumentationUrl;
    }

    /**
     * A URL to the API console for each API
     * 
     */
    @JsonProperty("apiDocumentationUrl")
    public void setApiDocumentationUrl(String apiDocumentationUrl) {
        this.apiDocumentationUrl = apiDocumentationUrl;
    }

}

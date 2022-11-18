package org.example.com;

import java.io.InputStream;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.example.com.beans.DataSetList;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/")
public interface RootResource {
  @GET
  @Produces("application/json")
  DataSetList list_data_sets();

  /**
   * This GET API returns the list of all the searchable field names that are in the oa_citations. Please see the 'fields' attribute which returns an array of field names. Each field or a combination of fields can be searched using the syntax options shown below.
   */
  @Path("{dataset}/{version}/fields")
  @GET
  @Produces("application/json")
  String list_searchable_fields(@PathParam("dataset") String dataset,
      @PathParam("version") String version);

  /**
   * This API is based on Solr/Lucense Search. The data is indexed using SOLR. This GET API returns the list of all the searchable field names that are in the Solr Index. Please see the 'fields' attribute which returns an array of field names. Each field or a combination of fields can be searched using the Solr/Lucene Syntax. Please refer https://lucene.apache.org/core/3_6_2/queryparsersyntax.html#Overview for the query syntax. List of field names that are searchable can be determined using above GET api.
   */
  @Path("{dataset}/{version}/records")
  @POST
  @Produces("application/json")
  @Consumes("application/x-www-form-urlencoded")
  Response perform_search(@PathParam("version") String version,
      @PathParam("dataset") String dataset, InputStream data);
}

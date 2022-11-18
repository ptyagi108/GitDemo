package org.example.com;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.example.com.beans.Abc;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/abcs")
public interface AbcsResource {
  /**
   * Gets a list of all `abc` entities.
   */
  @GET
  @Produces({"application/json", "text/xml"})
  @Consumes("application/json")
  List<Abc> getabcs(@QueryParam("xxx") Object xxx, @HeaderParam("SCASCSAS") String sCASCSAS,
      String zXzx, @QueryParam("xxx") Object xxx, String data);

  /**
   * Creates a new instance of a `abc`.
   */
  @POST
  @Consumes("application/json")
  void createabc(@QueryParam("xxx") Object xxx, @HeaderParam("SCASCSAS") String sCASCSAS,
      String zXzx, Abc data);

  /**
   * Gets the details of a single instance of a `abc`.
   */
  @Path("/{abcId}")
  @GET
  @Produces("application/json")
  Abc getabc(@PathParam("abcId") String abcId);

  /**
   * Updates an existing `abc`.
   */
  @Path("/{abcId}")
  @PUT
  @Consumes("application/json")
  void updateabc(@PathParam("abcId") String abcId, Abc data);

  /**
   * Deletes an existing `abc`.
   */
  @Path("/{abcId}")
  @DELETE
  void deleteabc(@PathParam("abcId") String abcId);
}

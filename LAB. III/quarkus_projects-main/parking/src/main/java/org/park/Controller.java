package org.park;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;

@Path("/socio")
public class Controller {

	
	Model model = new Model();
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{idade}/{categoria}/")
    public Response socio(@PathParam String idade, @PathParam String categoria) {	
		List<Socio> socioEncontrados = model.buscarEspecificacao(new Especificacao(idade, categoria));	
		String json = new Gson().toJson(socioEncontrados);
    	return Response.status(200).entity(json).build();	
    }
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{idade}")
    public Response socio2(@PathParam String idade) {	
		List<Socio> socioEncontrados = model.buscarIdade(idade);	
		String json = new Gson().toJson(socioEncontrados);
    	return Response.status(200).entity(json).build();	
    }
	
	
	
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasymmmmmmm";
    }
}
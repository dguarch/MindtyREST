package com.mindty.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usuarios")
public class UsuariosAPI {
	
	
	
	
	
	// IVAN
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	// Codigo get 
	
	
	// IVAN
	@Path("")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	//Codigo POST
	
	
	@Path("/{idu}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	
	
	
	@Path("/{idu}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@PUT
	
	
	@Path("/{idu}")
	@Produces(MediaType.APPLICATION_JSON)
	@DELETE
	
	
	

	
	

}

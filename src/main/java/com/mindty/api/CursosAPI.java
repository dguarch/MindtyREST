package com.mindty.api;

import javax.ws.rs.Path;

@Path("/cursos")
public class CursosAPI {
	
	
	//david
	
	//Cursos
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	// Codigo get 
	
	
	
	@Path("")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	//Codigo POST
	
	
	@Path("/{idc}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	
	
	
	@Path("/{idc}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@PUT
	
	
	@Path("/{idc}")
	@Produces(MediaType.APPLICATION_JSON)
	@DELETE
	
	////////////////////////////////////////////////////////////////
	//raul
	// Curso/modulos
	
	@Path("/{idc}/modulos")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	// Codigo get 
	
	
	
	@Path("/{idc}/modulos")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	//Codigo POST
	
	@Path("/{idc}/modulos/{idm}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	
	
	
	@Path("/{idc}/modulos/{idm}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@PUT
	
	
	@Path("/{idc}/modulos/{idm}")
	@Produces(MediaType.APPLICATION_JSON)
	@DELETE
	
	///////////////////////////////////////////
	//hector
	// cursos/modulos/nidades
	
	
	@Path("/{idc}/modulos/{idm}/unidades")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	// Codigo get 
	
	
	
	@Path("/{idc}/modulos/{idm}/unidades")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	//Codigo POST
	
	@Path("/{idc}/modulos/{idm}/unidades/{iduni}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	
	
	
	@Path("/{idc}/modulos/{idm}/unidades/{iduni}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@PUT
	
	
	@Path("/{idc}/modulos/{idm}/unidades/{iduni}")
	@Produces(MediaType.APPLICATION_JSON)
	@DELETE
	
	
	

}

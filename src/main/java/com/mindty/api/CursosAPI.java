package com.mindty.api;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mindty.persistence.ProfesorEM;

@Path("/cursos")
public class CursosAPI {

	private static Logger logger = Logger.getLogger("cursos");

	// david

	// Cursos
	/*
	 * @Path("")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @GET // Codigo get
	 * 
	 * 
	 * 
	 * @Path("")
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @POST //Codigo POST
	 * 
	 * 
	 * @Path("/{idc}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @GET
	 * 
	 * 
	 * 
	 * @Path("/{idc}")
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @PUT
	 * 
	 * 
	 * @Path("/{idc}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @DELETE
	 */
	////////////////////////////////////////////////////////////////
	// raul
	// Curso/modulos

	@Path("{idc}/modulos")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Response getModulos(@PathParam("idc") int idCurso) {
		logger.info("Estoy aqui ...");
		System.out.println("HOlaaa");
		try {

			return Response.status(202).entity(ProfesorEM.getInstance().getListaModulos(idCurso)).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity("Ha habido un error al pedir los modulos").build();
		}

	}

	@Path("{idc}/modulos/{idm}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Response getModulo(@PathParam("idc") int idCurso, @PathParam("idm") int idModulo) {
		logger.info("Estoy aqui ...");
		System.out.println("HOlaaa");
		try {
			String strSalida = ProfesorEM.getInstance().getModulo(idCurso, idModulo);
			if (strSalida != null)
				return Response.status(202).entity(strSalida).build();
			else
				return Response.status(400).entity("El modulo no existe en el sistema").build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity("Ha habido un error al pedir el modulo").build();
		}

	}

	@Path("/{idc}/modulos")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	public Response addModulo(@PathParam("idc") int idCurso) {

		try {

			return Response.status(202).entity(ProfesorEM.getInstance().getListaModulos(idCurso)).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity("Ha habido un error al pedir los pedidos").build();
		}

	}

	@Path("/{idc}/modulos/{idm}")
	@Produces(MediaType.APPLICATION_JSON)
	@DELETE
	public Response deleteModulo(@PathParam("idc") int idCurso, @PathParam("idm") int idModulo) {

		try {

			boolean bSalida = ProfesorEM.getInstance().eliminarModulo(idCurso, idModulo);
			if (bSalida == true)
				return Response.status(202).entity(bSalida).build();
			else
				return Response.status(400).entity("El modulo no existe en el sistema").build();

		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(500).entity("Ha habido un error al pedir el modulo").build();
		}

	}

	// Codigo POST
	/*
	 * @Path("/{idc}/modulos/{idm}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @GET
	 * 
	 * 
	 * 
	 * @Path("/{idc}/modulos/{idm}")
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @PUT
	 * 
	 * 
	 * @Path("/{idc}/modulos/{idm}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @DELETE
	 * 
	 * /////////////////////////////////////////// //hector //
	 * cursos/modulos/nidades
	 * 
	 * 
	 * @Path("/{idc}/modulos/{idm}/unidades")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @GET // Codigo get
	 * 
	 * 
	 * 
	 * @Path("/{idc}/modulos/{idm}/unidades")
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @POST //Codigo POST
	 * 
	 * @Path("/{idc}/modulos/{idm}/unidades/{iduni}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @GET
	 * 
	 * 
	 * 
	 * @Path("/{idc}/modulos/{idm}/unidades/{iduni}")
	 * 
	 * @Consumes(MediaType.APPLICATION_JSON)
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @PUT
	 * 
	 * 
	 * @Path("/{idc}/modulos/{idm}/unidades/{iduni}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON)
	 * 
	 * @DELETE
	 * 
	 */

}

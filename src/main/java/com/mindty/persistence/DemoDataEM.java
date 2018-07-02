package com.mindty.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mindty.modelos.Alumno;
import com.mindty.modelos.Curso;
import com.mindty.modelos.Modulo;
import com.mindty.modelos.Nota;
import com.mindty.modelos.Unidad;
import com.mindty.modelos.Usuario;

public class DemoDataEM extends EntityManager {
	
	private static DemoDataEM instance = null;

	public static final DemoDataEM getInstance() {
		if (instance == null)
			instance = new DemoDataEM();
		return instance;
	}

	protected DemoDataEM() {
	}
	
	public boolean updateDemoData() {
		boolean isOK = false;

		/* Creamos las lista de Unidades*/
		List<Unidad> unidadesModulo1= new ArrayList<Unidad>();
		unidadesModulo1.add(new Unidad("Elaboración de documentos web mediante lenguajes de marcas.")); 
		unidadesModulo1.add(new Unidad("Desarrollo y reutilización de componentes software y multimedia mediante lenguajes de guión."));
		unidadesModulo1.add(new Unidad("Aplicación de técnicas de usabilidad y accesibilidad en el entorno cliente."));
		
		List<Unidad> unidadesModulo2= new ArrayList<Unidad>();
		unidadesModulo2.add(new Unidad("Desarrollo de aplicaciones web en el entorno servidor."));
		unidadesModulo2.add(new Unidad("Acceso a datos en aplicaciones web del entorno servidor."));
		unidadesModulo2.add(new Unidad("Desarrollo de aplicaciones web distribuidas."));
		
		List<Unidad> unidadesModulo3= new ArrayList<Unidad>();
		unidadesModulo3.add(new Unidad("UNIDAD 1 - MODULO 1 - CURSO 2"));
		unidadesModulo3.add(new Unidad("UNIDAD 2 - MODULO 1 - CURSO 2"));
		unidadesModulo3.add(new Unidad("UNIDAD 3 - MODULO 1 - CURSO 2"));
		unidadesModulo3.add(new Unidad("UNIDAD 4 - MODULO 1 - CURSO 2"));
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/* Creamos los modulos */
		Modulo modulo1 = new Modulo();
		modulo1.setNombreModulo("Desarrollar elementos de software en el entorno cliente");
		modulo1.setUnidad(unidadesModulo1);
		
		Modulo modulo2 = new Modulo();
		modulo2.setNombreModulo("Desarrollar elementos de software en el entorno servidor");
		modulo2.setUnidad(unidadesModulo2);
		
		Modulo modulo3 = new Modulo();
		modulo3.setNombreModulo("Angular: De cero a experto creando aplicaciones");
		modulo3.setUnidad(unidadesModulo3);
		
		/* Listamos los Modulos con sus Unidades */
		List<Modulo> modulosCurso1 = new ArrayList<Modulo>();
		modulosCurso1.add(modulo1);
		modulosCurso1.add(modulo2);
		modulosCurso1.add(modulo3);
		
		List<Modulo> modulosCurso2 = new ArrayList<Modulo>();
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/* Creación de los Alumnos */
		Alumno alumno1 = new Alumno();
		alumno1.setNombreUsuario("Alumno");
		alumno1.setPassword("Password");
		alumno1.setEmail("email1@email.com");
		alumno1.setTelefono("93-555-75-54");
		alumno1.setTipo(3);
		
		Alumno alumno2 = new Alumno();
		alumno2.setNombreUsuario("Alumno");
		alumno2.setPassword("Password");
		alumno2.setEmail("email2@email.com");
		alumno2.setTelefono("93-555-75-54");
		alumno2.setTipo(3);
		
		Alumno alumno3 = new Alumno();
		alumno3.setNombreUsuario("Alumno");
		alumno3.setPassword("Password");
		alumno3.setEmail("email3@email.com");
		alumno3.setTelefono("93-555-75-54");
		alumno3.setTipo(3);
		
		/* Creación de los Profesores */
		Usuario profe1 = new Usuario();
		profe1.setNombreUsuario("Ricardo Ahumada");
		profe1.setPassword("Password");
		profe1.setEmail("ra@ra.com");
		profe1.setTelefono("93-555-75-55");
		profe1.setTipo(2);
		
		Usuario profe2 = new Usuario();
		profe2.setNombreUsuario("Profe");
		profe2.setPassword("Password");
		profe2.setEmail("email5@email.com");
		profe2.setTelefono("93-555-75-55");
		profe2.setTipo(2);
		
		/* Creación del Coordinador */
		Usuario coordi1 = new Usuario();
		coordi1.setNombreUsuario("Coord");
		coordi1.setPassword("Password");
		coordi1.setEmail("email6@email.com");
		coordi1.setTelefono("93-555-75-56");
		coordi1.setTipo(1);	
		
		
		/* Lista de usuarios para los cursos */
		List<Usuario> usuariosCurso1 = new ArrayList<Usuario>();
		usuariosCurso1.add(alumno1);
		usuariosCurso1.add(alumno2);
		
		List<Usuario> usuariosCurso2 = new ArrayList<Usuario>();
		usuariosCurso2.add(alumno3);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/* Creamos los Ccursos */
		Curso curs1 = new Curso();
		curs1.setCodCurso("WEB 12354");
		curs1.setNombreCurso("Desarrollo de aplicaciones con tecnologías web");
		curs1.setFormador(profe1);
		curs1.setAlumnos(usuariosCurso1);
		curs1.setHorasCurso(50);
		curs1.setModulo(modulosCurso1);
		
		Curso curs2 = new Curso();
		curs2.setCodCurso("456 CURSO");
		curs2.setNombreCurso("TEST NOMBRE CURSO 2");
		curs2.setFormador(profe2);
		curs2.setAlumnos(usuariosCurso2);
		curs2.setHorasCurso(255);
		curs2.setModulo(modulosCurso2);
		
		/* Relacionamos Alumnos + Modulo + Nota */
		List<Nota> notasAlmuno1= new ArrayList<Nota>();
		notasAlmuno1.add(new Nota(alumno1,modulo1,5.5));
		notasAlmuno1.add(new Nota(alumno1,modulo2,6));
		
		List<Nota> notasAlmuno2= new ArrayList<Nota>();
		notasAlmuno2.add(new Nota(alumno2,modulo1,9.5));
		notasAlmuno2.add(new Nota(alumno2,modulo2,10));
		
		List<Nota> notasAlmuno3= new ArrayList<Nota>();
		notasAlmuno3.add(new Nota(alumno3,modulo3,5));
		
		alumno1.setListaNota(notasAlmuno1);
		alumno2.setListaNota(notasAlmuno2);
		alumno3.setListaNota(notasAlmuno3);

		try {
		/* Hibernate */
			
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		session.save(alumno1);
		session.save(alumno2);
		session.save(alumno3);
		session.save(profe1);
		session.save(profe2);
		session.save(coordi1);
		session.save(curs1);
		session.save(curs2);
		t.commit();
		session.close();
		/*Hibernate*/
		isOK = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isOK;
	}
}
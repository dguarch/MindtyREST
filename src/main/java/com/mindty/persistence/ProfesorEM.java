package com.mindty.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mindty.modelos.Curso;
import com.mindty.modelos.Modulo;
import com.mindty.modelos.Usuario;

public class ProfesorEM extends EntityManager {

	private static ProfesorEM instance = null;

	public static final ProfesorEM getInstance() {
		if (instance == null)
			instance = new ProfesorEM();
		return instance;
	}

	protected ProfesorEM() {
		super();
	}

	public List<Usuario> getListaUsuarios() {
		List<Usuario> usuarios = null;
		try {
			/* Hibernate */

			Session session = factory.openSession();

			Transaction t = session.beginTransaction();
			usuarios = session.createQuery("FROM Employee", Usuario.class).getResultList();

			t.commit();
			session.close();
			/* Hibernate */
		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuarios;
	}

	public boolean save(Usuario usr) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		session.save(usr);

		t.commit();
		session.close();

		return true;

	}

	public int idUsuario(String user) {

		int nId = 0;
		try {
			/* Hibernate */

			Session session = factory.openSession();

			Transaction t = session.beginTransaction();
			Usuario usr = (Usuario) session.createQuery("from Usuario us where us.email = :nombre")
					.setString("nombre", user).uniqueResult();

			nId = usr.getIdu();

			t.commit();
			session.close();
			/* Hibernate */
		} catch (Exception e) {
			e.printStackTrace();
		}

		return nId;
	}

	public List<Curso> getListaCurso(int nid) {
		List<Curso> listaCursoProfe = new ArrayList<Curso>();

		int nId = 0;
		try {
			/* Hibernate */

			Session session = factory.openSession();

			Transaction t = session.beginTransaction();
			listaCursoProfe = (List<Curso>) session.createQuery("from Curso WHERE formador.idu = :uid")
					.setInteger("uid", nid).getResultList();

			t.commit();
			session.close();
			/* Hibernate */
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaCursoProfe;
	}

	public List<Modulo> getListaModulos(int nIdCurso) {

		List<Curso> listaCurso = new ArrayList<Curso>();
		List<Modulo> listaCursoModulo = new ArrayList<Modulo>();
		try {
			/* Hibernate */

			Session session = factory.openSession();
			Transaction t = session.beginTransaction();

			listaCurso = session.createQuery("FROM Curso", Curso.class).getResultList();
			System.out.println("Aqui llego3");
			for (Curso curso : listaCurso) {

				if (curso.getIdCurso() == nIdCurso) {
					listaCursoModulo = curso.getModulo();

				}

			}

			// listaCursoModulo = (List<Curso>) session.createQuery("from Curso WHERE
			// modulo.idm = :idcurso")
			// .setInteger("idcurso", nIdCurso).getResultList();

			t.commit();
			session.close();
			/* Hibernate */
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaCursoModulo;
	}

	public List<Usuario> getListaAlumnos(int nIdModulo) {

		List<Curso> listaCurso = new ArrayList<Curso>();
		List<Modulo> listaCursoModulo = new ArrayList<Modulo>();
		List<Usuario> listaAlumnos = new ArrayList<Usuario>();
		try {
			/* Hibernate */

			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			listaCurso = session.createQuery("FROM Curso", Curso.class).getResultList();
			for (Curso curso : listaCurso) {

				if (curso.getIdCurso() == nIdModulo) {
					listaAlumnos = curso.getAlumnos();

				}
			}

			// listaCursoModulo = (List<Curso>) session.createQuery("from Curso WHERE
			// modulo.idm = :idcurso")
			// .setInteger("idcurso", nIdCurso).getResultList();

			t.commit();
			session.close();
			/* Hibernate */
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaAlumnos;

	}
}
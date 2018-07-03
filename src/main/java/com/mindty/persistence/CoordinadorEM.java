package com.mindty.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mindty.modelos.Curso;
import com.mindty.modelos.Usuario;


public class CoordinadorEM extends EntityManager {

	private static CoordinadorEM instance = null;

	public static final CoordinadorEM getInstance() {
		if (instance == null)
			instance = new CoordinadorEM();
		return instance;
	}

	protected CoordinadorEM() {
		super();
	}

	public List<Usuario> getListaUsuario(int tipo) {
		List<Usuario> usuarios = null;
		try {
			/* Hibernate */

			Session session = factory.openSession();

			Transaction t = session.beginTransaction();
			
			usuarios = session.createQuery("FROM Usuario WHERE tipo="+tipo, Usuario.class).getResultList();
			t.commit();
			session.close();
			/* Hibernate */
		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuarios;
	}


	public Usuario getProfe(int idU) {
		Usuario profe = new Usuario();
		try {
			/* Hibernate */

			Session session = factory.openSession();

			Transaction t = session.beginTransaction();
			profe = session.get(Usuario.class, idU);
			t.commit();
			session.close();
			/* Hibernate */
		} catch (Exception e) {
			e.printStackTrace();
		}

		return profe;
		
	}
}
package test;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import entidades.Socio;



/*
 * En este ejercicio vamos a partir de un script de BD y vamos a dejar a Hibernate que genere de
 * forma automática las entidades y las anotaciones JPA.
 */
public class Test1_manytomany {

	public static void main(String[] args) {
		//conexión a traves de EntityManager sin usar patrón Facade
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Persistencia");
		EntityManager emanager = emfactory.createEntityManager();
		
		
		emanager.close();
		emfactory.close();

	}

}

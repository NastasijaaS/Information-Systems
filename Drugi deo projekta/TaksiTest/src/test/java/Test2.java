import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import entities.*;
import serviceimpl.*;
import services.*;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Test2 {
	@Test
	   public void testAssertions() 
	   {
		   LokacijaService service=new LokacijaServiceImpl();
		   
		   EntityManager em;
		   EntityManagerFactory emf = Persistence
	               .createEntityManagerFactory("TaksiTest");
	       em = emf.createEntityManager();
		   
		 
	       
	       List<Lokacija> Lokacije = service.spisakLokacija();
	       assertNotNull(Lokacije);
	       		
		   
		
	     		       
		   List<Lokacija> sveLokacije = em.createQuery("SELECT l FROM Lokacija l WHERE l.naziv_lokacije='Pantelej'", Lokacija.class).getResultList();
		   assertNotNull(sveLokacije);
	   }

}

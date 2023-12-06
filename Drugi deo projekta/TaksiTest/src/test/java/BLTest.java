import org.junit.Test;
import entities.Lokacija;
import services.LokacijaService;
import serviceimpl.LokacijaServiceImpl;
import entities.*;
import services.*;
import serviceimpl.*;
import static org.junit.Assert.*;

import java.util.List;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.*;

public class BLTest {
	
	

   
	private static LokacijaServiceImpl service;
	private int id;
		
		@BeforeClass
		public static void BeforeClass() {
			 

			service = new LokacijaServiceImpl();
			assertNotNull(service);	
			System.out.println("Test inicijalizovan.");
		}
		
		
		@Before
		public void Before() {
			Lokacija p = service.vratiLokaciju(4);
			assertNull(p);
			System.out.println("Lokacija nije nadjena u bazi podakata!");
		}
		
		
		@Test
		public void Test() {
		
			Lokacija p = new Lokacija(4, "Duvaniste", "Merkatorska");
			service.dodajLokaciju(p);
			Lokacija p2  = service.vratiLokaciju(p.getId());
			assertNotNull(p2);
			this.id = p.getId();
			System.out.println("Lokacija je dodata.");
		}
		
		
		@After
		public void After() {
			Lokacija p = service.vratiLokaciju(id);
			service.deleteLokacija(id);
			p = service.vratiLokaciju(id);
			assertNull(p);
			System.out.println("Lokacija namenjena za testiranje je uspesno obrisana iz baze!");
			
		}
		

   }



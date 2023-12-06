package serviceimpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entities.TaksiVozilo;
import services.TaksiService;





@Stateless
public class TaksiServiceImpl implements TaksiService
{
	@PersistenceContext(name = "TaksiApp")
	private EntityManager em;
	
	String s0="slobodan";
	String s1="zauzet";
	

	
	
	public void addTaksi(String aregistracija, String aime_vlasnika, String aadresaVlasnika)
	{
      String status = checkStatus(aregistracija);
      System.out.println("nastasija"+ status);
	  // int stat=Integer.parseInt(status);
	  //  Taksi taksi = em.find(Taksi.class,aregistracija);//
	  //  String statusT =  taksi.getStatus();//
	 
	 // if(astatus.contentEquals(s0) || astatus.contentEquals(s1))
	 // {
	    	try 
	    	{
	    	TaksiVozilo t1= new TaksiVozilo(aregistracija,aime_vlasnika, aadresaVlasnika,status);
	    	em.persist(t1);
	    	
	    	
	    	}
	    	catch(Exception ex)
			   {
				
				System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
				
				}
	   
	  }
	/*   else 
	   {
		   System.out.println("Greska");
	   }
	}*/
	

	
	
 
	public String sendGET(String ckstatus) throws IOException {
			String res="";
			URL obj = new URL("http://192.168.99.101/?ckstatus="+ckstatus);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", USER_AGENT);
			int responseCode = con.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);
			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(
						con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					 response.append(inputLine);
				}
				in.close();

				
				// print result
				System.out.println(response.toString());
				return response.toString();
			} else {
				System.out.println("GET request not worked");
				return res;
			}

		}
		

		
		public void deleteTaksi(String dregistracija)
		{			
			try{
				 
			    TaksiVozilo t1 =em.find(TaksiVozilo.class, dregistracija);
			    em.remove(t1);
			        } catch(Exception ex) {
				
				System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
				
				}  
			   
			  }
		private static final String USER_AGENT = "Mozilla/5.0";
		
		
		public List<TaksiVozilo> spisakTaksija() {
			System.out.println("Greska prilikom rada sa bazom:");

			List<TaksiVozilo> sviTaksiji = em.createQuery("SELECT t FROM Taksi t", TaksiVozilo.class).getResultList();
			return sviTaksiji;
		}


public String checkStatus(String ckstatus)
{
String res="";
	try {
	return sendGET(ckstatus);
} catch (IOException e) {
	e.printStackTrace();
	return res;
}	
}
}
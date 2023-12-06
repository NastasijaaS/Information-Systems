package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.TableGenerator;

@Entity
@Table (name = "zahtev")
public class Zahtev
	{



	/*  @TableGenerator(name = "zahtev_gen", table="id_gen",
	  pkColumnName= "gen_name", valueColumnName= "gen_value",
	 allocationSize = 1, pkColumnValue = "zahtev_gen")
	 @Id
	 @GeneratedValue (strategy = GenerationType.TABLE,generator = "zahtev_gen")*/
	
	   @Id
	   @Column (name = "id_zahtev")
	   private int id;

	   @Column (name = "idlokacija")
	   private int lokacijaid;

	   @Column (name="registracija_dodeljenog_taksija")
	   private String registracija;

	   @Column (name="status")
       private String status;
	  
	   

	  
	  public Zahtev()	  

	  {

	  }
		

	  public Zahtev(int id, int lokacijaid, String registracija, String status)

	  {
 		
	    this.setId(id);
		this.setLokacija(lokacijaid);
		this.setRegistracija(registracija);
		this.setStatus(status);
		
	  }


	 


	


	public void setId(int id)
	{
		this.id = id;
		
	}


	public void setLokacija(int ulokacijaid)
	{
		this.lokacijaid = ulokacijaid;
		
	}
	
	 public void setRegistracija(String registracija)
	  {
		this.registracija = registracija;
		
	  }
	
	public void setStatus(String status)
	{
		this.status = status;
		
	}
	

	

	  public int getId() 
	{
	 	return id;
	}

	  public int getLokacija()
	{
		return lokacijaid;
	}

	  public String getRegistracija()  
		{
			return registracija;
		}
	  
  	  public String getStatus()
	{
		return status;
	}

	
	  
	@Override

	  public String toString()
	{
		return "Zahtev id=" + id + ", " + "Lokacija:" + lokacijaid + ", " + "Registracija dodeljenog taksija:" + registracija + ", " + "Status:" + status;
	}
	}


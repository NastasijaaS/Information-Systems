package com.ejb.services;
import java.util.List;
import com.jpa.entities.Zahtev;


public interface ZahtevService
{

	public void addZahtev(String aid, String alokacijaid);
    public void deleteZahtev(String did);
    public void updateZahtev(String uid, String ulokacijaid, String uregistracija, String ustatus);
    public List<Zahtev> spisakZahteva();
    //public String sendGet(String ckid);
	
}

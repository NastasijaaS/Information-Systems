package com.ejb.services;
import java.util.List;

import com.jpa.entities.TaksiVozilo;


public interface TaksiVoziloService
{

	public void addTaksi(String aregistracija, String aime_vlasnika, String aadresaVlasnika);
    public void deleteTaksi(String dregistracija);
    public String checkStatus(String ckstatus);
    public List<TaksiVozilo> spisakTaksija();
	
}


package services;

import java.util.List;
import entities.TaksiVozilo;



public interface TaksiService
{

	public void addTaksi(String aregistracija, String aime_vlasnika, String aadresaVlasnika);
    public void deleteTaksi(String dregistracija);
    public String checkStatus(String ckstatus);
    public List<TaksiVozilo> spisakTaksija();
	
}


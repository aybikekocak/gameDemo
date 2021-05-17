package gameDemo;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerControl {

	@Override
	public boolean gamerControl(Gamer gamer) {
		 KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
 try {
	if(proxy.TCKimlikNoDogrula(gamer.getIdentityNumber(), gamer.getFirstName(), gamer.getLastName(), gamer.getBirthYear()))
		 {
				 System.out.println("Dogrulama Basarili");
		 }
			
} catch (RemoteException e) {
	
	e.printStackTrace();
}

return false;

	}

}

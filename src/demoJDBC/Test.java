package demoJDBC;

import java.util.List;

import JDBCProjet.beans.Client;
import JDBCProjet.connexion.Connexion;
import JDBCProjet.service.ClientService;

public class Test {
	public static void main(String []args) {
		Connexion.getConn();
		ClientService c=new ClientService();
		c.create(new Client("sami","ben mohamed"));
		c.create(new Client("samal","mansour"));
		c.create(new Client("rzouga","sahli"));
		c.create(new Client("ranim","jrad"));
		List<Client> l=c.findAll();
		for(Client lc:l) {
			System.out.println(lc.toString());
		}
		Client c1=c.findById(15);
		System.out.println(c1.toString());
		
		c.delete(new Client(14,"samal","mansour"));
		c.update(new Client(16,"amal","mansour"));
	}

}

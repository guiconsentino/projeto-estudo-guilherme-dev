package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
	    u1.nome = "Guilherme";
	    u1.email = "guiconsentino@hotmail.com";
	    
	    Usuario u2 = new Usuario();
	    u2.nome = "Guilherme";
	    u2.email = "guiconsentino@hotmail.com";
	    
	    System.out.println(u2 == u1);
	    System.out.println(u1.equals(u2));
	    System.out.println(u2.equals(u1));
	    
	 //   System.out.println(u2.equals(new Data()));
	}
}

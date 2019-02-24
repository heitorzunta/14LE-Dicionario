/* Classe Termo 
 *  alterada dia 23/02/19
 */

public class Termo {
  
  private String palavra;
  private String significado;
  
  public Termo (String palavra, String significado) {
	  this.palavra = palavra;
	  this.significado = significado;
  }

public String getPalavra() {
	return palavra;
}

public void setPalavra(String palavra) {
	this.palavra = palavra;
}

public String getSignificado() {
	return significado;
}

public void setSignificado(String significado) {
	this.significado = significado;
}
  
}
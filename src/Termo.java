public class Termo {
  
  private String palavra;
  private String significado;
  
  Termo (String palavra, String significado) {
    this.palavra = new String();
    this.significado = new String();
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
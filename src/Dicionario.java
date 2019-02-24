public class Dicionario {
  private Termo[] termos;
  private int quantidadeTermos;

  public Dicionario() {
    this.termos = new Termo[25];
    this.quantidadeTermos = 0;
  }
  
  // adiionaTermo
  public boolean adicionaTermo(String palavra, String significado) {
	  if(palavra != null && significado != null) {

		  termos[quantidadeTermos] = new Termo(palavra, significado);
		  quantidadeTermos++;  
		  return true;
	  }
	  else return false;
  }
  
  //buscaSignificado
  public String buscaSignificado(String palavra) {
    String significado = new String("Termo não encontrado!");
    
    int start=0, end=quantidadeTermos-1;
    int mid;
    
    while (start <= end) {
        mid = (start+end)/2;
        if(palavra.compareTo(termos[mid].getPalavra()) == 0) return significado = termos[mid].getSignificado();
    	if(palavra.compareTo(termos[mid].getPalavra()) < 0) end = mid-1;
    	if(palavra.compareTo(termos[mid].getPalavra()) > 0) start = mid+1;

    }
     return significado;
  }
  
  
}
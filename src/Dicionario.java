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
    
    int start=0, end=quantidadeTermos;
    int mid = (start+end)/2;
    
    while (start <= end) {
    	if(termos[mid].getPalavra().compareTo(palavra) > 0) start = mid+1;
    	if(termos[mid].getPalavra().compareTo(palavra) < 0) end = mid-1;
    	else significado = termos[mid].getSignificado();

    	mid = (start+end)/2;
    }
    return significado;
  }
  
  
}
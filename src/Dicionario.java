public class Dicionario {
  private Termo[] termos;
  private int quantidadeTermos;

  public Dicionario() {
    this.termos = new Termo[25];
    this.quantidadeTermos = 0;
  }
  
  
  
  public Termo[] getTermos() {
	return termos;
}



public void setTermos(Termo[] termos) {
	this.termos = termos;
}



public int getQuantidadeTermos() {
	return quantidadeTermos;
}



public void setQuantidadeTermos(int quantidadeTermos) {
	this.quantidadeTermos = quantidadeTermos;
}



/* public boolean adicionaTermo(String palavra, String significado) {
    
    return true;
  }
  
  public String buscaSignificado(String palavra) {
    String significado = new String();
    
    return significado;
  } **/
  
  //Adicionar Termo
  public void adicionaTermo(String palavra, String significado) {
	  
	  termos[quantidadeTermos] = new Termo(palavra, significado);
	  quantidadeTermos++;	 	  
  }
  
  //Busca Termo
 public void  buscaTermo(String palavra) {

	 int pEsquerda = 0;
	 int pDireita = quantidadeTermos;
	 int meio = (pDireita+ pEsquerda)/2;
	 
	 while (pEsquerda != pDireita && !termos[meio].getPalavra().equals(palavra)) {
		 
		 if(termos[meio].getPalavra().compareTo(palavra) < 0) pDireita = --meio;	 
		 else pEsquerda=++meio;
		 
		 meio = (pDireita+ pEsquerda)/2;
	 }
	 
	 if (termos[meio].getPalavra().equals(palavra)) {
		 System.out.println(termos[meio].getPalavra() + termos[meio].getSignificado());
	 }
	 else System.out.println("Termo não encontrado!");
 }
}
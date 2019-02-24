import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {

    int n; //quantidade de pesquisas realizadas
    String pesquisa; // termo a ser pesquisado

    Dicionario d = new Dicionario();

    povoarDicionario(d);

      Scanner sc = new Scanner(System.in);

      n  = sc.nextInt();

    for(int i=0; i<n; i++){
        pesquisa = sc.next();
        System.out.println(d.buscaSignificado(pesquisa));
    }

  }
  
  public static void povoarDicionario(Dicionario d) {
    d.adicionaTermo("Abelha", "Abelha é a denominação comum de vários insetos pertencentes à ordem Hymenoptera, da superfamília Apoidea, subgrupo Anthophila, aparentados das vespas e formigas");
    d.adicionaTermo("Baleia", "Comum às várias spp. de grandes mamíferos cetáceos, marinhos, principalmente as das fam. dos balenídeos e dos balenopterídeos");
    d.adicionaTermo("Cachorro", "animal de quatro patas, melhor amigo do homem");
    d.adicionaTermo("Dromedario", "animal mamífero nativo da região nordeste da África e da parte ocidental da Ásia, pertencente à família Camelidae, sendo um parente próximo dos camelos");
    d.adicionaTermo("Elefante", "Elefante é o termo genérico e popular pelo qual são denominados os membros da família Elephantidae, um grupo de mamíferos proboscídeos elefantídeos");
    d.adicionaTermo("Foca", "As focas são mamíferos da família dos focídeos, super-família dos pinípedes, adaptadas à vida marinha. ");
    d.adicionaTermo("Gato", "O gato, também conhecido como gato caseiro, gato urbano ou gato doméstico, é um mamífero carnívoro da família dos felídeos, muito popular como animal de estimação");
    d.adicionaTermo("Hipopotamo", "O hipopótamo-comum ou hipopótamo-do-nilo é um mamífero herbívoro de grande porte da África subsariana e uma das duas únicas espécies não extintas da família Hippopotamidae, sendo a outra o hipopótamo-pigmeu.");
    d.adicionaTermo("Iguana", "Iguana é um gênero de réptil da família Iguanidae. As espécies deste gênero ocorrem em regiões tropicais da América Central, América do Sul e Caribe.");
    d.adicionaTermo("Jacare", "Jacaré é uma denominação comum às espécies de crocodilianos da família Alligatoridae, sendo muito parecidos com os crocodilos, dos quais se distinguem pela cabeça mais curta e larga e pela presença de membranas interdigitais");
  }
}
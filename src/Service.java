public class Service {
    private String nome;
    private double valorMensal;
    private String categoria;

    public Service(String nome, double valorMensal, String categoria){
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.categoria = categoria;
    }

    public String getNome(){
        return nome;
    }

    public double getValorMensal(){
        return valorMensal;
    }

    public String getCategoria(){
        return categoria;
    }

    public void exibirDetalhes(){
        System.out.println("===INFORMAÇÕES DO SERVIÇO===");
        System.out.println("Nome do Serviço: " + nome);
        System.out.println("Valor do Plano Mensal: " + valorMensal);
        System.out.println("Categoria Desejada: " + categoria);
    }
}

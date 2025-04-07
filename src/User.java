import java.util.ArrayList;

public class User {
    private String nome;
    private String cpf;
    private ArrayList<Service> assinaturas;

    public User(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.assinaturas = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void adicionarAssinatura(Service s){
        if(!assinaturas.contains(s)){
            assinaturas.add(s);
            System.out.println("Assinatura realizada!");
        } else{
            System.out.println("Ocorreu um erro ao realizar a assinatura!");
        }
    }

    public void cancelarAssinatura(Service service){
        for(Service s: assinaturas){
            if(s.getNome().equalsIgnoreCase(service.getNome())){
                assinaturas.remove(s);
                System.out.println("Serviço removido!");
                break;
            }
        }
    }

    public ArrayList<Service> getAssinaturas(){
        return assinaturas;
    }

    public void exibirAssinaturas(){
        for(Service s: assinaturas){
            s.exibirDetalhes();
        }
    }

    public void calcularTotalMensal(){
        double total = 0;
        for(Service s: assinaturas){
            total += s.getValorMensal();
        }
        System.out.println("Total: " + total);
    }
}

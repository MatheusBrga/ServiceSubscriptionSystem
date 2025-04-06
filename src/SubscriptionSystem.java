import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubscriptionSystem {
    private Map<String, User> usuarios;
    private ArrayList<Service> servicosDisponiveis;

    public SubscriptionSystem(){
        this.usuarios = new HashMap<>();
        this.servicosDisponiveis = new ArrayList<>();
    }

    public void cadastrarNovoUsuario(String nome, String cpf){
        if(!usuarios.containsKey(cpf)){
            User user = new User(nome, cpf);
            usuarios.put(cpf, user);
            System.out.println("Usuario cadastrado!");
        } else{
            System.out.println("O CPF informado ja está cadastrado no sistema!");
        }
    }

    public void listarUsuariosCadastrados(){
        for(User u: usuarios.values()){
            System.out.println("Nome: " + u.getNome() + " | CPF: " + u.getCpf());
        }
    }

    public void listarServicosDisponiveis(){
        for(Service s: servicosDisponiveis){
            System.out.println("Nome do Serviço: " + s.getNome() + " | Plano Mensal: " + s.getValorMensal() + " | Categoria:  " + s.getCategoria());
        }
    }

    public void assinarServico(String cpf, String nomeServico){
        if(!usuarios.containsKey(cpf)){
            System.out.println("Usuário não encontrado!");
            return;
        }

        Service serviceEncontrado = null;
        for(Service s: servicosDisponiveis){
            if(s.getNome().equalsIgnoreCase(nomeServico)){
                serviceEncontrado = s;
                break;
            }
        }

        if(serviceEncontrado == null){
            System.out.println("Serviço '" + nomeServico + "' não está disponível!");
            return;
        }

        User user = usuarios.get(cpf);
        user.adicionarAssinatura(serviceEncontrado);
        System.out.println("Serviço " + nomeServico + " assinado com sucesso!");
    }

    public void cancelarAssinatura(String cpf, String nomeServico){
        if(!usuarios.containsKey(cpf)){
            System.out.println("Usuário não encontrado!");
            return;
        }

        User user = usuarios.get(cpf);
        Service servicoParaCancelar = null;

        for(Service s: user.getAssinaturas()){
            if(s.getNome().equalsIgnoreCase(nomeServico)){
                servicoParaCancelar = s;
                break;
            }
        }

        if(servicoParaCancelar == null){
            System.out.println("O serviço " + nomeServico + " não está assinado por este usuário!");
            return;
        }

        user.cancelarAssinatura(servicoParaCancelar);
        System.out.println("Serviço " + nomeServico + " cancelado com sucesso!");
    }

    public void exibirAssinaturasDeUmUsuario(String cpf){
        User user = usuarios.get(cpf);
        if(user != null){
            System.out.println("Usuário: " + user.getNome());
            user.exibirAssinaturas();
        } else {
            System.out.println("Usuário não encontrado!");
        }

    }

    public void calculoMensalDeUmUsuario(String cpf){
        User user = usuarios.get(cpf);
        if(user != null){
            System.out.println("Usuário: " + user.getNome());
            user.calcularTotalMensal();
        } else {
            System.out.println("Usuário não encontrado!");
        }
    }

    public void cadastrarServico(Service service){
        servicosDisponiveis.add(service);
    }
}

package mb;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * @author alex
 */
@ManagedBean(name = "helloWorldMb")
public class HelloWorldMb {

    private String[] cidades = {
        "Umuarama",
        "Guaira",
        "Cianorte",
        "Maringá"
    };
    
    private String nome;
    private String senha;
    private String cidade;

    public String[] getCidades() {
        return cidades;
    }

    public void setCidades(String[] cidades) {
        this.cidades = cidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void enviar(){
        System.out.println(nome);
        System.out.println(senha);
        System.out.println(cidade);
        
        FacesMessage m1 = new FacesMessage("Informe o nome.");
        FacesContext.getCurrentInstance().addMessage("nome", m1);
    }
}

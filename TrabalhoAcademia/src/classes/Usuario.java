package classes;


public class Usuario {
    public String Nome;
    public String Email;
    public int Idade;
    public String[] Serial;
    public String Sexo;
    public String Imagem;
    public String Senha;
    public Boolean Permissao;

    public Usuario(String Nome, String Email, int Idade, String Sexo, String Imagem, String Senha, Boolean Permissao) {
        this.Nome = Nome;
        this.Email = Email;
        this.Idade = Idade;
        //this.Serial = Serial;
        this.Sexo = Sexo;
        this.Imagem = Imagem;
        this.Senha = Senha;
        this.Permissao = Permissao;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String[] getSerial() {
        return Serial;
    }

    public void setSerial(String[] Serial) {
        this.Serial = Serial;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getImagem() {
        return Imagem;
    }

    public void setImagem(String Imagem) {
        this.Imagem = Imagem;
    }
    
    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
    
}

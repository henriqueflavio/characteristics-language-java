package classes;

public class SuperUser {
    String nome;
    private String login;
    private String password;

    public SuperUser(String login, String senha) {
        this.login = login;
        this.password = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

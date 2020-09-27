package classes;

public class Main {
    public static void main(String[] args) {
        final SuperUser superUser = new SuperUser("admin", "123456");
        superUser.getLogin();
        superUser.getPassword();
        String root = superUser.nome;
    }
}

package types.primitive;

/**
 * @author Flávio Henrique
 * @since  30/09/2020
 *
 */
public class DefaultValues {
    public static void main(String[] args) {
        final Default d = new Default();
        System.out.println(d.getI());
        System.out.println(d.isActive());
    }
}

class Default {
    int i;
    boolean active;

    public int getI() {
        return i;
    }

    public boolean isActive() {
        return active;
    }
}



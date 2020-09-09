package javapractice1.FirstTask.Main;

public class Prince {
    private int shoe;

    @Override
    public String toString() {
        return "Prince{" +
                "shoe=" + shoe +
                '}';
    }

    public int getShoe() {
        return shoe;
    }

    public void setShoe(int shoe) {
        this.shoe = shoe;
    }

    public Prince() {
    }

    public Prince(int shoe) {
        this.shoe = shoe;
    }
}

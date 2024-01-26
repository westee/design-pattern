public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Component child){}
    public void remove(Component child){}

    public abstract void display(String prefix);
}

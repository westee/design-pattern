import java.util.ArrayList;
import java.util.List;

public class ProjectGroup extends Component {

    private final List<Component> children = new ArrayList<>();

    public ProjectGroup(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(String prefix) {
        System.out.println(prefix + " 项目组 " + name);
        for (Component child : children) {
            child.display(prefix);
        }
    }

}

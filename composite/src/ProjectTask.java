public class ProjectTask extends Component {

    public ProjectTask(String name) {
        super(name);
    }

    public void add(Component child) {
        // 项目任务下不能再挂载子组件
        throw new UnsupportedOperationException();
    }

    public void remove(Component child) {
        // 项目任务下不能再挂载子组件
        throw new UnsupportedOperationException();
    }

    @Override
    public void display(String prefix) {
        System.out.println(prefix + " 任务 " + name);
    }
}

public class Client {

    public static void main(String[] args) {
        // 创建项目组
        ProjectGroup groupA = new ProjectGroup("A组");
        ProjectGroup groupB = new ProjectGroup("B组");

        // 创建项目任务
        ProjectTask task1 = new ProjectTask("需求分析");
        ProjectTask task2 = new ProjectTask("设计文档");
        ProjectTask task3 = new ProjectTask("开发编码");
        ProjectTask task4 = new ProjectTask("测试验收");

        // 组合项目和任务
        groupA.add(task1);
        groupA.add(task2);
        groupB.add(task3);
        groupB.add(task4);

        // 显示项目组和任务
        groupA.display("-");
        System.out.println();
        groupB.display("-");
    }

}

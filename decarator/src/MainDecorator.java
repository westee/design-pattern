public class MainDecorator {

    public static void main(String[] args) {
        // 通过DecoratorCompressStream给FileStream更多的处理能力
        DecoratorCompressStream decoratorMain = new DecoratorCompressStream(new FileStream());
        String read = decoratorMain.read();
        System.out.println(read);
    }

}

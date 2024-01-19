public class DecoratorCompressStream extends DecoratorStream {

    public DecoratorCompressStream(Stream stream) {
        super(stream);
    }

    @Override
    public String read() {
        return null;
    }

    @Override
    public void write(String data) {
        String compress = compress(data);
        stream.write(compress);
    }

    public String compress(String data){
        return data;
    }
}

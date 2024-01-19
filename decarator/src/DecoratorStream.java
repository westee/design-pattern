public abstract class DecoratorStream implements Stream {
    Stream stream;

    public DecoratorStream(Stream stream) {
        this.stream = stream;
    }
}

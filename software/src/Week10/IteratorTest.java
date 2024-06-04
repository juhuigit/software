package Week10;

interface Iterator {
    public void hasNext();
    public void next();
    public void remove();
}

interface Enumeration {
    public void hasMoreElements();
    public void nextElements();
}

class EnumerationForIterator implements Iterator{
    Enumeration enumeration;

    public EnumerationForIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public void hasNext() {
        enumeration.hasMoreElements();
    }

    @Override
    public void next() {
        enumeration.nextElements();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(); // 예외 던지기
    }
}
public class IteratorTest {
}

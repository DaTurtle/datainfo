package nl.utwente.di;

/**
 * Created by Jan-Willem_2 on 4/20/2015.
 */
public class Quoter {
    public double getBookPrice(String isbn) {
        return isbn.equals("1") ? 10.0 : isbn.equals("2") ? 45.0 : isbn.equals("3") ? 20.0 : isbn.equals("4") ? 35.0 : isbn.equals("5") ? 50.0 : 0.0;
    }
}

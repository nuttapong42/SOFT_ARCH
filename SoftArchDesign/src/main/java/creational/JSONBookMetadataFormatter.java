package creational;

import java.util.Arrays;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    JSONArray book_Array;
    JSONObject book_Object;

    public void JSONBookMetadataFormatter() {

    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        book_Array = new JSONArray();
        book_Object = new JSONObject();
        return this;

    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONArray newAuth = new JSONArray();
        JSONObject newBook = new JSONObject();
        newAuth.addAll(Arrays.asList(b.getAuthors()));

        newBook.put(Book.Metadata.TITLE.value,b.getTitle());
        newBook.put(Book.Metadata.PUBLISHER.value,b.getPublisher());
        newBook.put(Book.Metadata.AUTHORS.value,newAuth);
        newBook.put(Book.Metadata.ISBN.value,b.getISBN());
        book_Array.add(newBook);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.

        return book_Object.toString();
    }
}

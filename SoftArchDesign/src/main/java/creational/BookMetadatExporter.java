package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.PrintStream;
import java.io.IOException;

    public abstract class BookMetadatExporter extends BookCollection {

        public void add(Book b){

        }
        public void export(PrintStream stream){

        }

    }

    //XML
    class XMLBookMetadataExporter extends BookMetadatExporter {
        BookMetadataFormatter formatter = new XMLBookMetadataFormatter();
        XMLBookMetadataExporter() throws ParserConfigurationException{

        }

        public void add(Book b) {
            formatter.append(b);
        }

        public void export(PrintStream stream) {
            stream.println(formatter.getMetadataString());
        }
    }

    //CSV
    class CSVBookMetadataExporter extends BookMetadatExporter {
        BookMetadataFormatter formatter = new CSVBookMetadataFormatter();

        CSVBookMetadataExporter() throws IOException {
        }


        public void add(Book b) {
            formatter.append(b);
        }

        public void export(PrintStream stream) {
            stream.println(formatter.getMetadataString());
        }
    }

    //JSON
    class JSONBookMetadataExporter extends BookMetadatExporter {
        BookMetadataFormatter formatter = new JSONBookMetadataFormatter();
        JSONBookMetadataExporter() throws ParserConfigurationException{

        }

        public void add(Book b) {
            formatter.append(b);
        }

        public void export(PrintStream stream) {
            stream.println(formatter.getMetadataString());
        }
    }


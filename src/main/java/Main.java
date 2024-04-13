import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Привет мир");
        Person person = new Person();
        person.getAge();
        person.getFirstName();
        person.getLastName();
        String a = "example.txt";
        Writer writer = new FileWriter(a);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(person, writer);
        
    }
}

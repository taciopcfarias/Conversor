import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Gerador {

    public void salvaJson(Conversor conversor) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter(conversor.USD() + ".json");
        conversor.write(gson.toJson(conversor));
        conversor.close();
    }
}

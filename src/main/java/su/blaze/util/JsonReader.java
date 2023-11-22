package su.blaze.util;
import su.blaze.model.CryptoCurrencyDTO;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JsonReader {
    public static List<CryptoCurrencyDTO> readJsonFile(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream inputStream = JsonReader.class.getClassLoader().getResourceAsStream(fileName)) {
            if (inputStream == null) {
                throw new IllegalArgumentException("file not found! " + fileName);
            }
            return mapper.readValue(inputStream, new TypeReference<List<CryptoCurrencyDTO>>(){});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

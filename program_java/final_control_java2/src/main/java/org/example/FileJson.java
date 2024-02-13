package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileJson implements ViewInterface {

    private long animalCount;
    private JSONObject data = new JSONObject();
    String pathProject = System.getProperty("user.dir");
    String pathFile = pathProject.concat("/file.json");
    File file = new File(pathFile);

    public void fileDataJson() {
        try {
            if (file.createNewFile()) {
                long i = 0;
                data.put("animalCount", i);
                writeFile();
            } else {
                readFile();
            }
        } catch (IOException e) {
            log.setLogger("Ошибка при вводе/выводе данных из файла!");
            e.printStackTrace();
        }
        animalCount = (long) data.get("animalCount");
    }

    public void readFile() {
        try (FileReader reader = new FileReader(file)) {
            JSONParser jsonParser = new JSONParser();
            data = (JSONObject) jsonParser.parse(reader);
        } catch (IOException | ParseException e) {
            log.setLogger("Ошибка при вводе/выводе данных из файла!");
            e.printStackTrace();
        }
    }

    public void writeFile() {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(data.toJSONString());
        } catch (IOException e) {
            log.setLogger("Ошибка при вводе/выводе данных из файла!");
            e.printStackTrace();
        }
    }

    public void addJson(String key, java.util.Map<String, Object> value) {
        data.put(key, value);
        data.put("animalCount", animalCount + 1);
        writeFile();
        animalCount = (long) data.get("animalCount");
        System.out.println("Запись сохранена.");
    }

    public void delJson() {
        data.put("animalCount", animalCount - 1);
        writeFile();
        animalCount = (long) data.get("animalCount");
        System.out.println("Запись удалена.");
        System.out.println("Изменения сохранены.");
    }

}

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
    private Boolean flagFillingErrorList = false;

    private String fillingErrorList = "";


    public void addCommand(String com, String r) {
//      System.out.println(((JSONObject) fileJson.getData().get(str[animalCommand])).get("command"));
        JSONObject s = (JSONObject) data.get(com);
        s.put("command", r);
    }

    public String viewTypeData(String com) {
        JSONObject s = (JSONObject) data.get(com);
        return (String) s.get("class");
    }



    public Object setCommand(String com) {
        JSONObject s = (JSONObject) data.get(com);
        return s.get("command");
    }

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
        } finally {
            animalCount = (long) data.get("animalCount");
        }
    }

    public void readFile() {
        try (FileReader reader = new FileReader(file)) {
            JSONParser jsonParser = new JSONParser();
            data = (JSONObject) jsonParser.parse(reader);
        } catch (IOException | ParseException e) {
            log.setLogger("Ошибка при вводе/выводе данных из файла!");
        }
    }

    public void setFillingErrorList(String fillingErrorList) {
        this.fillingErrorList += fillingErrorList;
    }

    public void writeFile() {
        try (FileWriter fileWriter = new FileWriter(file)) {
            if (!fillingErrorList.isEmpty()) {
                throw new RuntimeException("Ошибка при заполнении карточки. \n" + fillingErrorList);
            } else {
                flagFillingErrorList = false;
                fileWriter.write(data.toJSONString());
                System.out.println("Запись сохранена.");
            }
        } catch (RuntimeException e) {
            log.setLogger(e.getMessage());
            System.out.println(e.getMessage());
            flagFillingErrorList = true;
            fillingErrorList = "";
            System.out.println("Заполните карточку заново, с учетом допущенных ошибок.");
        } catch (IOException e) {
            log.setLogger(e.getMessage());
        }
    }

    public void AddWriteFile(String key, java.util.Map<String, Object> value) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            if (!fillingErrorList.isEmpty()) {
                data.remove(key);
                fileWriter.write(data.toJSONString());
                throw new RuntimeException("\n\t---------------------------------------------"
                        + "\n"
                        + "Ошибка при заполнении карточки. \n" + fillingErrorList
                        + "\t---------------------------------------------");
            } else {
                data.put(key, value);
                data.put("animalCount", animalCount + 1);
                fileWriter.write(data.toJSONString());
                animalCount = (long) data.get("animalCount");

            }

        } catch (RuntimeException e) {
            log.setLogger(e.getMessage());
            System.out.println(e.getMessage());
            flagFillingErrorList = true;
            fillingErrorList = "";
            System.out.println("Заполните карточку заново, с учетом допущенных ошибок.\n");
        } catch (IOException e) {
            log.setLogger(e.getMessage());
        }
    }

    public void delJson() {
        data.put("animalCount", animalCount - 1);
        writeFile();
        animalCount = (long) data.get("animalCount");
        System.out.println("Запись удалена.");
        System.out.println("Изменения сохранены.");
    }

}

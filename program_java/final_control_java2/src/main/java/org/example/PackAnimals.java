package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PackAnimals implements ViewInterface {
    private Integer countPackAnimals;

    public Integer countPackAnimalsShow(){
        countPackAnimals = 0;
        String[] s = printData.arrayKey();
        for (String string : s) {
            if (fileJson.viewTypeData(string).equals("2")) {
                countPackAnimals += 1;
            }
        }
        return countPackAnimals;
    }
}

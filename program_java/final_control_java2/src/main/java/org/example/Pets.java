package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pets implements ViewInterface {
    private Integer countPets;

    public Integer countPetsShow(){
        countPets = 0;
        String[] s = printData.arrayKey();
        for (String string : s) {
            if (fileJson.viewTypeData(string).equals("1")) {
                countPets += 1;
            }
        }
        return countPets;
    }

}

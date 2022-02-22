package ru.vcrop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Excel_Sheet_Column_Number_171Test {

    @Test
    void titleToNumber() {
        Excel_Sheet_Column_Number_171 excel_sheet_column_number_171 = new Excel_Sheet_Column_Number_171();
        Assertions.assertEquals(excel_sheet_column_number_171.titleToNumber("A"), 1);
        Assertions.assertEquals(excel_sheet_column_number_171.titleToNumber("AB"), 28);
        Assertions.assertEquals(excel_sheet_column_number_171.titleToNumber("ZY"), 701);
    }
}
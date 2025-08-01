package com.app.myloan;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalculateInterest {

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        EMI marchEmi = new EMI(0, 87000, 6761975, LocalDate.of(2025, 3, 5));
        EMI aprilEmi = new EMI(0, 87000, 6771975, LocalDate.of(2025, 4, 5));
        EMI mayEmi = new EMI(0, 87000, 6677651, LocalDate.of(2025, 4, 5));

        List<EMI> emiList =new ArrayList<>();
        emiList.add(marchEmi);
        emiList.add(aprilEmi);
        emiList.add(mayEmi);

        for (EMI emi : emiList){

        }
    }

}

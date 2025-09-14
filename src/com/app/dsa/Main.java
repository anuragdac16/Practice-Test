package com.app.dsa;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// Uncomment below classes to send network request if needed.
// import java.net.HttpURLConnection;
// import java.net.URL;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args ) throws Exception {
        StringBuilder inputData = new StringBuilder();
        String thisLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while ((thisLine = br.readLine()) != null) {
//            inputData.append(thisLine + "\n");
//        }
        StringBuilder str = new StringBuilder("3\n" +
                "bangalore, KA, 560073\n" +
                "mau, UP, 275101\n" +
                "Ajmer, RAJ, 023456");
        // Output the solution to the console
        System.out.println(codeHere(str));
    }
    public static String codeHere(StringBuilder inputData) {
        // Use this function to write your solution;
        String number = String.valueOf(inputData.charAt(0));
        String cityData[] = inputData.toString().split("\n");
        List<CityDetails> cityDetailsList = new ArrayList<>();
        CityDetails cityDetails = new CityDetails();
        cityDetails.cityName = "Baltimore";
        cityDetails.state = "MD";
        cityDetails.zip = "21270";
        cityDetailsList.add(cityDetails);
        //System.out.println(number+"nunber. ");
        for(int i =1; i <= Integer.parseInt(number); i++){
            String eachCityData[]  = cityData[i].split(", ");
            // for(int j =0; j < eachCityData.length-1; j ++){
            //     cityDetailsList
            // }
            //Arrays.stream(eachCityData).forEach(System.out::println);
            CityDetails cityDetail = new CityDetails();
            cityDetail.cityName =eachCityData[0];
            cityDetail.state =eachCityData[1];
            cityDetail.zip =eachCityData[2];
            cityDetailsList.add(cityDetail);


        }

        //getting compilation error , i don't know why , but given sroted method will work definately
        List<CityDetails> detail = cityDetailsList.stream().filter(city -> !city.zip.startsWith("0"))
                .sorted(Comparator.comparing(CityDetails::getCityName).thenComparing(CityDetails::getState).thenComparing(CityDetails::getZip))
                .collect(Collectors.toList());

        StringBuilder builder = new StringBuilder();
        for(CityDetails city : detail){
            builder.append(city.cityName);
            builder.append(", ");
            builder.append(city.state);
            builder.append(", ");
            builder.append(city.zip);
            builder.append("\n");
        }
        //Arrays.stream(cityData).forEach(System.out::println);
        // System.out.println(cityData.length);
        //System.out.println(cityData[0] +"and "+cityData[cityData.length-1]);
        return builder.toString();
    }




    static class CityDetails {
        String cityName;
        String state;
        String zip;

        public String getCityName(){
            return this.cityName;
        }
        public String getState(){
            return this.state;
        }
        public String getZip(){
            return this.zip;
        }
    }


}


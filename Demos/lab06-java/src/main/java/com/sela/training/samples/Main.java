package com.sela.training.samples;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Docker Workshop - Module 6 Demo");
        System.out.println("===========================================");

        String user = System.getenv("USERNAME");
        String pass = System.getenv("PASSWORD");

        System.out.println("Read System Environment variables ");
        System.out.println("user " + user);
        System.out.println("user " + pass);

        //Getting the path from the command args
        String path = "config.json";
        System.out.println("Reading DB Properties from file : " + path);

        try {

            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject)parser.parse(new FileReader(path));

            String connectionString = (String)obj.get("connectionString");
            String dbUser = (String)obj.get("user");
            String dbPass = (String)obj.get("pass");

            System.out.println("From config " + "Connection String" + " : " + connectionString);
            System.out.println("From config " + "db-user" + " : " + dbUser);
            System.out.println("From config " + "db-pass" + " : " + dbPass);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }




    }

    private static String parseConfig(String arg) {
        if(!arg.contains("-config=")) {
            return "NA";
        }
        return arg.split("=")[1];
    }
}

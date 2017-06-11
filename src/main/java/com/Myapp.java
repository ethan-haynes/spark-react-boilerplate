package com.haynes;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

import spark.Request;
import spark.Response;
import spark.ModelAndView;
import spark.template.jade.JadeTemplateEngine;

import java.util.HashMap;

public class Myapp {

    public static void main( String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) ->
            new ModelAndView(new HashMap<String,String>(){{
              put("initialData", "Hello Spark/Java with React!");
            }}, "app")
        , new JadeTemplateEngine());
    }
}

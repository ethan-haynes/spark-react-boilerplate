package com.haynes;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;


import spark.Request;
import spark.Response;
import spark.ModelAndView;
import spark.TemplateEngine;
import spark.template.jade.JadeTemplateEngine;

import java.util.HashMap;
import java.util.Map;

public class Myapp {

    public static void main( String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, String> models = new HashMap<>();
            models.put("initialData", "Hello Spark/Java with React!");
            return new ModelAndView(models, "app"); // located in resources/templates directory
        }, new JadeTemplateEngine());
    }
}

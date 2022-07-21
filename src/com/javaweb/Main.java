package com.javaweb;

import com.javaweb.controller.Controller;
import com.javaweb.model.entity.ModelAirlineCompany;
import com.javaweb.model.entity.Aircraft;
import com.javaweb.view.View;

public class Main {
    public static void main(String[] args) {
        /*ResourceBundle bundle = ResourceBundle.getBundle("com/javaweb/AircraftParameters");
        System.out.println(MessageFormat.format(bundle.getString("NAME_OF_AIRCRAFT"),"fsdf"));
        System.exit(0);*/
        /* Creating instance of view */
        View view = new View();

        /* Creating instance of airline company container*/
        ModelAirlineCompany<Aircraft> airlineCompany =
                new ModelAirlineCompany<>();

        /* Creating instance of controller*/
        Controller controller = new Controller(view, airlineCompany);

        /* Run */
        controller.processUser();
    }
}
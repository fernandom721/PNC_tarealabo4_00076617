package com.uca.capas.domain;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;

public class Robot {

    @AssertFalse(message = "!!!!Eres robot!!!!")
    private Boolean soyRobot;

    public Robot(){}

    public Robot(Boolean soyRobot) {
        this.soyRobot = soyRobot;
    }

    public Boolean getSoyRobot() {
        return soyRobot;
    }

    public void setSoyRobot(Boolean soyRobot) {
        this.soyRobot = soyRobot;
    }
}

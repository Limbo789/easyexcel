package com.alibaba.excel.listener;

import jdk.nashorn.internal.objects.annotations.Getter;


public class Even {
    private Robot robot;

    public Even(){
        super();
    }
    public Even(Robot robot){
        super();
        this.robot = robot;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
}

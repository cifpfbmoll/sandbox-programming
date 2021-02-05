package com.studentsfp.devenvironment.unittesting.p0.basics;

import net.minidev.json.JSONObject;
import org.apache.commons.lang3.StringUtils;

public class Pokemon implements LivingBeingActions{

    @Override
    public void feed() {

    }

    @Override
    public void cleanIt() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void play() {

    }

    @Override
    public void die() {

    }

    @Override
    public String render(RenderType renderType) {
        String rtn = StringUtils.EMPTY;
        switch (renderType){
            case CONSOLE:
                System.out.println(String.format("POKE: %s","Pepito"));
                break;
            case HTML:
                rtn = String.format("<div>%s</div>","Pepito");
                break;
            default:
                //rtn = JSONObject.toJSONString();
                break;
        }
        return rtn;
    }
}

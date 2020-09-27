package com.epam.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name="ServiceFault")
public class DivisionByZero extends Exception {

    private Exception hidden;

    public DivisionByZero(String er) {
        super(er);
        //@FaultAction() faultcode="100";
    }

    public DivisionByZero(String er, Exception e) {
        super(er);
        hidden = e;
    }

    public Exception getHiddenException() {
        return hidden;
    }

}
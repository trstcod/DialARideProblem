package controller;

import utilities.Dijkstras;
import utilities.ReadInput;
import utilities.Scheduling;
import utilities.SortRequest;
import utilities.OutputRevenue;


import java.io.IOException;

public class Driver {

    public static void main(String args[])throws IOException {

        ReadInput ri = new ReadInput();
        ri.readBasic();
        SortRequest sr = new SortRequest();
        sr.sort(ri.getReq());
        Dijkstras dj = new Dijkstras();  
        for(int i=0;i<ri.getN();i++) {
            Dijkstras.dij(ri.getLocation(),i,ri.getN());
        }
        Scheduling sd = new Scheduling();
        sd.schedule(ri.getCar(), ri.getReq(), ri.getLocation());
        OutputRevenue o = new OutputRevenue();
        o.writeOutput(ri.getCar());
    }
}

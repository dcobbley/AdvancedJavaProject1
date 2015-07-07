package edu.pdx.cs410J.dcobbley;

import edu.pdx.cs410J.AbstractPhoneCall;

/**
 * Created by david on 7/6/15.
 */
public class phonecall extends AbstractPhoneCall {
    String callerNumber;
    String calleeNumber;
    String startTime;
    String endTime;

    phonecall(String callerNumber, String calleeNumber, String startTime, String endTime){
        this.callerNumber = callerNumber;
        this.calleeNumber = calleeNumber;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    @Override
    public String getCaller() {
        return callerNumber;
    }

    @Override
    public String getCallee() {
        return calleeNumber;
    }

    @Override
    public String getStartTimeString() {
        return startTime;
    }

    @Override
    public String getEndTimeString() {
        return endTime;
    }
}

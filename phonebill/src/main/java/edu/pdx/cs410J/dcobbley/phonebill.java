package edu.pdx.cs410J.dcobbley;

import edu.pdx.cs410J.AbstractPhoneBill;
import edu.pdx.cs410J.AbstractPhoneCall;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by david on 7/6/15.
 */
public class phonebill extends AbstractPhoneBill{
    String customer;
    List<AbstractPhoneCall> phoneCalls;
    phonebill(String customer, phonecall phoneCall)
    {
        this. customer = customer;
        addPhoneCall(phoneCall);
    }
    @Override
    public String getCustomer() {
        return customer;
    }

    @Override
    public void addPhoneCall(AbstractPhoneCall abstractPhoneCall) {
        phoneCalls = new ArrayList<AbstractPhoneCall>();
        phoneCalls.add(abstractPhoneCall);
    }

    @Override
    public Collection getPhoneCalls() {
        return phoneCalls;
    }
}

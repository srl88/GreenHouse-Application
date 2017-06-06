package com.csci3130_group11.csci3130_group11;

/**
 * Created by aclarke on 2017-06-06.
 */

public class Temperature extends Measurement {
    public Temperature(){
        super();
        deviceRangeLower=-40;
        deviceRangeUpper=125;
    }
    public Temperature(double curr){
        super();
        deviceRangeLower=-40;
        deviceRangeUpper=125;
        current=curr;
        userInputedRangeLower=deviceRangeLower;
        userInputedRangeUpper=deviceRangeUpper;
    }
    public Temperature(double curr, double low, double high){
        super();
        deviceRangeLower=-40;
        deviceRangeUpper=125;
        current=curr;
        userInputedRangeLower=low;
        userInputedRangeUpper=high;
    }
}

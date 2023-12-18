package Classes;

import Intefaces.Time;

public class ThisTime extends Essence implements Time {
    @Override
    public String time() {
        return " В это время ";
    }
}

package com.company;

import java.util.List;

public interface ISaveable {
    // The interface will just specify two methods, one to return an ArrayList of values to be saved
    // and the other to populate the object's fields from an ArrayList (Parameter).

    List<String> write();
    void read(List<String> savedValues);


}

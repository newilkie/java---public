package com.company;

public interface ITelephone {

    // this is creating a template telling you what actually needs to be implemented to make sure that the specific
    // class needs in order to be considered a part of that class. It's like a template for your template.
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}

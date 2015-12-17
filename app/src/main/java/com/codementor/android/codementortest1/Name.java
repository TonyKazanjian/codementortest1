package com.codementor.android.codementortest1;

import java.util.List;

/**
 * Created by tonyk_000 on 12/15/2015.
 */
public class Name {

    private String firstName;
    private String lastName;

    private List<Name> mNames;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

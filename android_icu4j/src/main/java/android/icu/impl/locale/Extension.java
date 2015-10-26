/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 *******************************************************************************
 * Copyright (C) 2009-2010, International Business Machines Corporation and    *
 * others. All Rights Reserved.                                                *
 *******************************************************************************
 */
package android.icu.impl.locale;


/** @hide All android.icu classes are currently hidden */
public class Extension {
    private char _key;
    protected String _value;

    protected Extension(char key) {
        _key = key;
    }

    Extension(char key, String value) {
        _key = key;
        _value = value;
    }

    public char getKey() {
        return _key;
    }

    public String getValue() {
        return _value;
    }

    public String getID() {
        return _key + LanguageTag.SEP + _value;
    }

    public String toString() {
        return getID();
    }
}
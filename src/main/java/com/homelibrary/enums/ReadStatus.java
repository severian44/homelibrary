package com.homelibrary.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ReadStatus {

    READ("I had already read it."),
    TO_BE_READ("I will read it."),
    READING("I am reading this book.");

    ReadStatus(String str) {
    }
}

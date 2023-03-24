package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {

    private final long studentId;

    public StudentNotFoundException(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String getMessage() {
        return "Could not find student with ID " + this.studentId;
    }
}

package com.techforge.easybill.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tester {

    public static class  model {


        private static LocalDateTime dateTime;

        private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss");


        // Getter for the LocalDateTime object
        public LocalDateTime getDateTime() {
            return dateTime;
        }

        // Setter for the LocalDateTime object
        public void setDateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
        }

        // Method to get the formatted date-time as a string (dd/MM/yyyy-HH:mm:ss)
        public String getFormattedDateTime() {
            return dateTime.format(FORMATTER);  // Format LocalDateTime when retrieving
        }

        // Method to set LocalDateTime from a formatted string (for parsing or user input)
        public void setDateTimeFromString(String dateTimeStr) {
            dateTime = LocalDateTime.parse(dateTimeStr, FORMATTER);  // Parse formatted string into LocalDateTime
        }

        // Method that returns the formatted date-time as a string
        public String getDateTimeAsFormattedString() {
            return dateTime.format(FORMATTER);
        }
    }


        public static void main(String[] args) {

            model mode = new model();
            mode.setDateTime(LocalDateTime.now());
            System.out.println(mode.getDateTimeAsFormattedString());
        }
}

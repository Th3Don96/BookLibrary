package com.pluralsilght;

import java.util.regex.Pattern;
import java.lang.*;
import java.lang.String;

public class Books {
    public static void main(String[] args) {
        public static String[] getbookTitles() {
            //Book Titles
            // ( String bookTitle|double idNumber| String checkedIn| String checkedOut)
            String[] bookTitles = {"Where the WildThings Are |10003|Out|John Wick",
                    "Alice's Adventures in Wonderland|10003|Out|April Wilson",
                    "Pippi Longstocking|10003|Out|Hailey Parker",
                    "The Little Prince|10003|In|",
                    "Harry Potter and the Philosopher's Stone|10003109|Out|Ron Wesley",
                    "Matilda|10003|In|",
                    "Winnie-the-Pooh|10003|In|",
                    "The Lion, the Witch and the Wardrobe|10003251|In|",
                    "Charlie and the Chocolate Factory|10003|In|",
                    "The Tale of Peter Rabbit|10003|In|",
                    "Treasure Island|10003|In",
                    "The Lorax|10003|Out|Adam Washington",
                    "Charlotte's Web|10003|Out|Paul Newman",
                    "Bridge to Terabithia|10003|In",
                    "Diary of a Wimpy Kid|10003|In",
                    "The Lightning Thief: Percy Jackson and the Olympians|10003|In|",
                    "The Hunger Games|10003|Out|John Redcorn",
                    "The Outsiders|10003|In|",
                    "The Great Gatsby|10003|Out|Travis Perry",
                    "Fahrenheit 451|10003|In|",
                    "The Spiderwick Chronicles|10003|In|"};

        public informtion(idNumber, bookTitle,checkedIn, checkedOut){
                this.idNumber = idNumber;
                this.bookTitle = bookTitle;
                this.checkedIn = checkedIn;
                this.checkedOut = checkedOut;
                public long idNumber;
                public String bookTitle;
                public String checkedIn;
                public String checkedOut;
            }
            public long getIdNumber() {
                return this.idNumber;
            }
            public String getbookTitle() {
                return this.bookTitle;
            }
            public String getCheckedIn() {
                return this.checkedIn;
            }
            public String getCheckedOut() {
                return this.checkedOut;
            }

        }
        // ( String bookTitle|double idNumber| String checkedIn| String checkedOut)

        String wtWTA = "Where The Wild Things Are|10003854|Out|John Wick";
        String[] section = wtWTA.split(Pattern.quote("|"));
        String AAiWl = "Alice's Adventures In Wonderland|10003251|Out|April Wilson";
        String[] section = AAiWl.split(Pattern.quote("|"));
        String PipL = "Pippi Longstocking|10003501|Out|Hailey Parker";
        String[] section = PipL.split(Pattern.quote("|"));
        String HPPS = "Harry Potter and the Philosopher's Stone|10003109|Out|Ron Wesley";
        String LWaW = "The Lion, the Witch and the Wardrobe|10003251|In|";
        String[] section = LWaW.split(Pattern.quote("|"));

        double idNumber = Double.parseDouble(section[1]);
        String bookTitle = (section[0]);
        String checkedIn = (section[2]);
        String checkedOut = (section[3]);
        System.out.println(bookTitle + " - " + idNumber);
        System.out.println("Availability:" + checkedIn);
        System.out.println("Checked out to:" + checkedOut);
        System.out.println(bookTitle, idNumber + " is " + checkedIn +, "Would you like to ccheck out?");


    }
}
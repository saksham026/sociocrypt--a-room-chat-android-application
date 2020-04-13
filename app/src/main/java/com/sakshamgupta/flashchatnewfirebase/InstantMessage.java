package com.sakshamgupta.flashchatnewfirebase;



class InstantMessage {

    public String message;
    public String author;

    InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {



    }

    String getMessage() {
        return message;
    }

    String getAuthor() {
        return author;
    }
}

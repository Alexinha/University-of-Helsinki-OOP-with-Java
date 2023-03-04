/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexchang
 */
public class Book {
    private String title;
    private int page;
    private int publicationYear;
    
    public Book(String title, int page, int publicationYear){
        this.page = page;
        this.publicationYear = publicationYear;
        this.title = title;
    }
    
    public String getName(){
        return this.title;
    }
    
    public String toString(){
        String info = title + ", " + page + " pages, " + publicationYear;
        return info;
    }
    
}

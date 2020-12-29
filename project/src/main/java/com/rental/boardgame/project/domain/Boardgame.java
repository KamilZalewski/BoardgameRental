package com.rental.boardgame.project.domain;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity(name="BOARDGAMES")
public class Boardgame {

    private Long id;
    private String title;
    private String author;
    private String sort;
    private Integer yearOfPublish;
    private String quantityOfPlayers;

    public Boardgame(String title, String author, String sort, Integer yearOfPublish, String quantityOfPlayers) {
        this.title = title;
        this.author = author;
        this.sort = sort;
        this.yearOfPublish = yearOfPublish;
        this.quantityOfPlayers = quantityOfPlayers;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "BOARDGAME_ID", unique = true)
    public Long getId() { return id; }

    @Column(name = "TITLE", unique = true)
    public String getTitle() {
        return title;
    }

    @Column(name = "AUTHOR", unique = true)
    public String getAuthor() {
        return author;
    }

    @Column(name = "SORT", unique = true)
    public String getSort() {
        return sort;
    }

    @Column(name = "YEAR_OF_PUBLISH", unique = true)
    public Integer getYearOfPublish() { return yearOfPublish; }

    @Column(name = "QUANTITY_OF_PLAYERS", unique = true)
    public String getQuantityOfPlayers() {
        return quantityOfPlayers;
    }

    public void setId(Long id) { this.id = id; }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setYearOfPublish(Integer yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public void setQuantityOfPlayers(String quantityOfPlayers) {
        this.quantityOfPlayers = quantityOfPlayers;
    }
}

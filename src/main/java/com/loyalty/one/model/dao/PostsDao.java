package com.loyalty.one.model.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "post")
@Getter
@Setter
public class PostsDao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Integer postId;

    @Column(name = "username")
    @NotNull
    private String username;

    @Column(columnDefinition="TEXT")
    @NotNull
    private String content;

    @Column(name = "city")
    private String city;

    @Column(name = "latitude")
    private Float latitude;

    @Column(name = "longitude")
    private Float longitude;

    @Column(name = "temperature")
    private Float temperature;

    @Column(name = "created_date")
    private Date createdDate = new Date();


}
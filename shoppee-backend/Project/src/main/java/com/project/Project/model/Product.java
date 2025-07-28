package com.project.Project.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
//we dont want to create getter and setter for all these number of properties so we use lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //to auto generate and fill the id column
    private int id;
    private String name;
    @Lob
    @Column(length = 1000)
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    private String imagename;
    private String imagetype;

    @Lob
    private byte[] imagedate;


}

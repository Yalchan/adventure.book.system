package com.advanced.academy.adventure.book.system.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="tags")
public class Tag {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="value", unique =true)
    private  String value;

    @ManyToMany(mappedBy ="tags")
    private Set<Adventure> adventure=new HashSet<>();
}

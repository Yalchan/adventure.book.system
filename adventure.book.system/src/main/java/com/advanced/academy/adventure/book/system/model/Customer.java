package com.advanced.academy.adventure.book.system.model;

import com.advanced.academy.adventure.book.system.model.enums.UserType;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="customers")
@Where(clause ="is_deleted=false")
public class Customer {
    @Id
    @Column(name ="id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name ="type")
    @Enumerated(EnumType.STRING)
    @NotNull
    private UserType type;

    @Column(name ="email")
    @NotEmpty
    private String email;

    @Column(name = "user_name")
    @NotEmpty
    private String userName;
    @Column(name= "is_deleted")
    private boolean isDeleted=false;

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Integer getId() {
        return id;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}

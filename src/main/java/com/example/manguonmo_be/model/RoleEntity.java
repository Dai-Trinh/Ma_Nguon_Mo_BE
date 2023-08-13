package com.example.manguonmo_be.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_roles")
public class RoleEntity extends AttributesCommon{


    @Column(name = "name", length = 45, nullable = false)
    private String name;

    @Column(name = "description", length = 45, nullable = false)
    private String description;

    @ManyToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "roles")
    private Set<UserEntity> users = new HashSet<UserEntity>();
    public void addUsers(UserEntity user) {
        user.getRoles().add(this);
        users.add(user);
    }
    public void deleteUsers(UserEntity user) {
        user.getRoles().remove(this);
        users.remove(user);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UserEntity> users) {
        this.users = users;
    }
}

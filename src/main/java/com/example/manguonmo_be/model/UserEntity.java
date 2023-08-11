package com.example.manguonmo_be.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbl_users")
public class UserEntity extends AttributesCommon {

    @Column(name = "username", length = 45, nullable = false)
    private String username;

    @Column(name = "password", length = 100, nullable = false)
    private String password;

    @Column(name = "email", length = 45, nullable = false)
    private String email;

    @Column(name = "phone", length = 100, nullable = true)
    private String phone;

    @Column(name = "shipping_address", length = 1000, nullable = true)
    private String shippingAddress;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "tbl_users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleEntity> roles = new HashSet<RoleEntity>();
    public void addRoles(RoleEntity role) {
        role.getUsers().add(this);
        roles.add(role);
    }
    public void deleteRole(RoleEntity role) {
        role.getUsers().remove(this);
        roles.remove(role);
    }

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "user")
    private Set<SaleOrderEntity> saleOrders = new HashSet<SaleOrderEntity>();
    public void addSaleOrder(SaleOrderEntity saleOrder) {
        saleOrders.add(saleOrder);
        saleOrder.setUser(this);
    }
    public void deleteSaleOrder(SaleOrderEntity saleOrder) {
        saleOrders.remove(saleOrder);
        saleOrder.setUser(null);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
    }


    public Set<SaleOrderEntity> getSaleOrders() {
        return saleOrders;
    }

    public void setSaleOrders(Set<SaleOrderEntity> saleOrders) {
        this.saleOrders = saleOrders;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}

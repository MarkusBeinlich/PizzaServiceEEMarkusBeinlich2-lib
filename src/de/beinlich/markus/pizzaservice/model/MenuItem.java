package de.beinlich.markus.pizzaservice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Version;
import org.eclipse.persistence.annotations.AdditionalCriteria;

@Entity
@NamedQuery(name = MenuItem.findAll, query = "SELECT m FROM MenuItem m")
public class MenuItem implements Serializable {

    private static final long serialVersionUID = 4017341755034502641L;
    
    public static final String findAll = "MenuItem.findAll";
    @Version
    private Long lastUpdate;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menuItemId;
    @ManyToOne
    private Menu menu;
    private String name;
    private String description;
    @Column(precision = 8, scale = 2)
    private BigDecimal price;
    private int quantity;

    public MenuItem() {
    }

    public MenuItem(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Integer getMenuItemId() {
        System.out.println("getMenuItemId:" + menuItemId);
        return menuItemId;
    }

    public void setMenuItemId(Integer menuItemId) {
        this.menuItemId = menuItemId;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

}

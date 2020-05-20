package com.epam.shop.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "ORDER")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID")
    private Long orderId;
    @Column(name = "SHIP_DATE")
    private LocalDateTime shipDate;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "COMPLETE")
    private boolean complete;

    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinColumn(name = "ORDER_USER_ID")
    private User owner;

    @OneToMany(mappedBy = "order", cascade = {CascadeType.REMOVE})
    private List<Item> items;

}

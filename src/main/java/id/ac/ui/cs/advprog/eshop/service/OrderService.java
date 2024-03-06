package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Order;

public interface OrderService {
    public Order createOrder(Order order);
    public Order updateStatus(String id, String status);
    public Order findById(String id);
    public Iterable<Order> findAllByAuthor(String author);
}

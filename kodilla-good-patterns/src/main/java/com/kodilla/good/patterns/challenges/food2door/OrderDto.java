package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {
    private User user;
    public boolean isOrdered;

    public OrderDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "user=" + user +
                ", isOrdered=" + isOrdered +
                '}';
    }
}


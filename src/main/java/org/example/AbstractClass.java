package org.example;

import java.time.LocalDateTime;

public abstract class AbstractClass {

    private Long id;
    private LocalDateTime creationDate;
    private boolean active;

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

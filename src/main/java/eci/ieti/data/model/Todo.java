package eci.ieti.data.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Todo {
    @Id
    private Long id;

    private String description;
    private int priority;
    private Date dueDate;
    private String responsible;
    private String status;

    public Todo(){

    }

    public Todo(String description,int priority, Date dueDate, String responsible, String status){
        this.description=description;
        this.priority=priority;
        this.dueDate=dueDate;
        this.responsible=responsible;
        this.status=status;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getResponsible() {
        return responsible;
    }

    public String getStatus() {
        return status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }
}

package MultipleClasses;

import java.util.*;

public class Trainer {
    private int trainerId;
    private String name;
    private String email;
    private long contactNo;
    private List<TechStack> techStacks;

    public Trainer(int trainerId, String name, String email, long contactNo, List<TechStack> techStacks) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
        this.techStacks = techStacks;
    }

    // getters and setters here

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNumber(long contactNo) {
        this.contactNo = contactNo;
    }

    public List<TechStack> getTechStacks() {
        return techStacks;
    }

    public void setTechStacks(List<TechStack> techStacks) {
        this.techStacks = techStacks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainerId, name, email, contactNo, techStacks);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Trainer trainer = (Trainer) obj;
        return trainerId == trainer.trainerId &&
                Objects.equals(name, trainer.name) &&
                Objects.equals(email, trainer.email) &&
                Objects.equals(contactNo, trainer.contactNo) &&
                Objects.equals(techStacks, trainer.techStacks);
    }
}

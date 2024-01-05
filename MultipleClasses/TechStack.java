package MultipleClasses;

import java.util.*;

public class TechStack {
    private int techStackId;
    private String name;
    private String description;

    public TechStack(int techStackId, String name, String description) {
        this.techStackId = techStackId;
        this.name = name;
        this.description = description;
    }

    // getters and setters start here

    public int getTechStackId() {
        return techStackId;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
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

    @Override
    public int hashCode() {
        return Objects.hash(techStackId, name, description);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        TechStack techStack = (TechStack) obj;
        return techStackId == techStack.techStackId &&
                Objects.equals(name, techStack.name) &&
                Objects.equals(description, techStack.description);
    }
}

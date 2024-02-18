package domain.entities;

public class FeatureEntity {

    private Long id;
    private String name;
    private String description;
    private FeatureStatus status;

    public FeatureEntity() {
    }

    public FeatureEntity(Long id, String name, String description, FeatureStatus status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public FeatureStatus getStatus() {
        return status;
    }

    public void setStatus(FeatureStatus status) {
        this.status = status;
    }

    public boolean isActive() {
        return FeatureStatus.ACTIVE.equals(this.status);
    }
}
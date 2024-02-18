package application.ports.out;

import domain.entities.FeatureEntity;

import java.util.List;
import java.util.Optional;

public interface FeatureRepositoryPort {
    FeatureEntity saveFeatureEntity(FeatureEntity featureEntity);
    Optional<FeatureEntity> findFeatureEntityById(Long id);
    void deleteFeatureEntity(Long id);
    List<FeatureEntity> findAllFeatureEntities();
}
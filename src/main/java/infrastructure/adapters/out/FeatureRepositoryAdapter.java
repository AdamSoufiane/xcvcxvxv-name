package infrastructure.adapters.out;

import application.ports.out.FeatureRepositoryPort;
import domain.entities.FeatureEntity;
import org.springframework.stereotype.Repository;

@Repository
public class FeatureRepositoryAdapter implements FeatureRepositoryPort {

    // Assuming the existence of a JPA repository for FeatureEntity
    private final JpaFeatureRepository jpaFeatureRepository;

    public FeatureRepositoryAdapter(JpaFeatureRepository jpaFeatureRepository) {
        this.jpaFeatureRepository = jpaFeatureRepository;
    }

    @Override
    public void saveFeatureEntity(FeatureEntity featureEntity) {
        jpaFeatureRepository.save(featureEntity);
    }

    @Override
    public FeatureEntity findFeatureEntityById(Long id) {
        return jpaFeatureRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteFeatureEntity(Long id) {
        jpaFeatureRepository.deleteById(id);
    }

    @Override
    public Iterable<FeatureEntity> findAllFeatureEntities() {
        return jpaFeatureRepository.findAll();
    }

    // Assuming the existence of a JPA repository interface
    interface JpaFeatureRepository extends JpaRepository<FeatureEntity, Long> {
    }
}
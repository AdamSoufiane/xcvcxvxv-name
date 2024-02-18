package application.services;

import application.ports.out.FeatureRepositoryPort;
import domain.entities.FeatureEntity;

public class FeatureService {

    private final FeatureRepositoryPort featureRepositoryPort;

    public FeatureService(FeatureRepositoryPort featureRepositoryPort) {
        this.featureRepositoryPort = featureRepositoryPort;
    }

    public FeatureEntity createFeature(FeatureEntity feature) {
        return featureRepositoryPort.saveFeatureEntity(feature);
    }

    public FeatureEntity retrieveFeature(Long id) {
        return featureRepositoryPort.findFeatureEntityById(id).orElse(null);
    }

    public FeatureEntity updateFeature(FeatureEntity feature) {
        return featureRepositoryPort.saveFeatureEntity(feature);
    }

    public void deleteFeature(Long id) {
        featureRepositoryPort.deleteFeatureEntity(id);
    }
}
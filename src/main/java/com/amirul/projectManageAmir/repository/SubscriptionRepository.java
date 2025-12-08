package com.amirul.projectManageAmir.repository;

import com.amirul.projectManageAmir.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    Subscription findByUserId(Long userId);

}

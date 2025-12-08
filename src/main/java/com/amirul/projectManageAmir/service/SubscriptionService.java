package com.amirul.projectManageAmir.service;

import com.amirul.projectManageAmir.domain.PlanType;
import com.amirul.projectManageAmir.model.Subscription;
import com.amirul.projectManageAmir.model.User;

public interface SubscriptionService {

    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}

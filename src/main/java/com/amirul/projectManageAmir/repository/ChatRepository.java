package com.amirul.projectManageAmir.repository;

import com.amirul.projectManageAmir.model.Chat;
import com.amirul.projectManageAmir.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {

    Chat findByProject(Project projectById);
}

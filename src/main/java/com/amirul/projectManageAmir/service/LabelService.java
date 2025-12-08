package com.amirul.projectManageAmir.service;

import com.amirul.projectManageAmir.exception.LabelNotFoundException;
import com.amirul.projectManageAmir.exception.UserException;
import com.amirul.projectManageAmir.model.Label;

import java.util.List;
import java.util.Optional;

public interface LabelService {

    Label getOrCreateLabel(String labelName);

    Optional<Label> getLabelById(Long labelId);

    List<Label> getAllLabels();

    List<Label> getLabelsCreatedByUser(Long userId) throws UserException;

    void updateLabel(Long labelId, Label updatedLabel) throws LabelNotFoundException;

    void deleteLabel(Long labelId);
}

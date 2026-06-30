package com.amirul.projectManageAmir.service;

import com.amirul.projectManageAmir.exception.IssueException;
import com.amirul.projectManageAmir.exception.ProjectException;
import com.amirul.projectManageAmir.exception.UserException;
import com.amirul.projectManageAmir.model.Issue;
import com.amirul.projectManageAmir.model.User;
import com.amirul.projectManageAmir.request.IssueRequest;

import java.util.List;
import java.util.Optional;

public interface IssueService {
    // List<Issue> getAllIssues() throws IssueException;

    Optional<Issue> getIssueById(Long issueId) throws IssueException;

    List<Issue> getIssueByProjectId(Long projectId) throws ProjectException;

    Issue createIssue(IssueRequest issue, Long userid) throws UserException, IssueException, ProjectException;

    Optional<Issue> updateIssue(Long issueid, IssueRequest updatedIssue, Long userid)
            throws IssueException, UserException, ProjectException;

    String deleteIssue(Long issueId, Long userid) throws UserException, IssueException;

    List<Issue> getIssuesByAssigneeId(Long assigneeId) throws IssueException;

    List<Issue> searchIssues(String title, String status, String priority, Long assigneeId) throws IssueException;

    List<User> getAssigneeForIssue(Long issueId) throws IssueException;

    Issue addUserToIssue(Long issueId, Long userId) throws UserException, IssueException;

    Issue updateStatus(Long issueId, String status) throws IssueException;

}

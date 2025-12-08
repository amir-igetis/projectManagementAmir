package com.amirul.projectManageAmir.service;

import com.amirul.projectManageAmir.exception.IssueException;
import com.amirul.projectManageAmir.exception.UserException;
import com.amirul.projectManageAmir.model.Comment;

import java.util.List;

public interface CommentService {

    Comment createComment(Long issueId, Long userId, String comment) throws UserException, IssueException;

    void  deleteComment(Long commentId, Long userId) throws UserException, IssueException;

    List<Comment> findCommentByIssueId(Long issueId);
}

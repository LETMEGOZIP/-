package org.koreait.board.exceptions;

import org.koreait.board.entities.CommentData;
import org.koreait.global.exceptions.scripts.AlertBackException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;

public class CommentNotFoundException extends AlertBackException {
    public CommentNotFoundException() {
        super("NotFound.comment", HttpStatus.NOT_FOUND);
        setErrorCode(true);
    }
}
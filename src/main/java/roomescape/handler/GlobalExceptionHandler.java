package roomescape.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import roomescape.exception.BaseException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<String> handleException(BaseException e) {
        return new ResponseEntity<>(e.getMessage(), e.getStatus());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleException(MethodArgumentNotValidException e) {
        return new ResponseEntity<>(e.getMessage(), e.getStatusCode());
    }
}

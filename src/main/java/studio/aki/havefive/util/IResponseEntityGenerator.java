package studio.aki.havefive.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import studio.aki.havefive.dto.ResultBean;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service()
public interface IResponseEntityGenerator {
    default ResponseEntity<Object> generateResponseEntity(
            final Object object, final HttpStatus httpStatus) {
        return new ResponseEntity<>(object, new HttpHeaders(), httpStatus);
    }

    default ResponseEntity<Object> processResultBean(ResultBean resultBean) {
        HttpStatus httpStatus = HttpStatus.valueOf(resultBean.getResponseCode());
        switch(httpStatus) {
            case CREATED:
                return generateResponseEntity(resultBean.getBody(), HttpStatus.CREATED);

            case NOT_FOUND:
                return generateResponseEntity(resultBean.getBody(), HttpStatus.NOT_FOUND);

            default:
                return generateResponseEntity(resultBean.getBody(), HttpStatus.OK);
        }
    }

    default void setResponseContent(final HttpServletResponse response, final Object object)
        throws IOException {
        final ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object));
    }
}

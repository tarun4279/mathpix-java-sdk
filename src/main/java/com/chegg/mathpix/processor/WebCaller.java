package com.chegg.mathpix.processor;


import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * An Utility to call HTTP GET and POST methods
 * @author tarun.kundhiya
 */
public class WebCaller {

  private static final Logger LOGGER = LoggerFactory.getLogger(WebCaller.class);

  public Object doGet(String url, Map<String, String> queryParams) {

    if (StringUtils.isBlank(url)) {
      LOGGER.warn("Inavalid URL" + url);
    }

    LOGGER.info("Calling GET " + url);

    if (queryParams != null && !queryParams.isEmpty()) {
      LOGGER.info("with queryParams " + queryParams);
    }

    HttpHeaders headers = new HttpHeaders();
    headers.set("Accept", MediaType.APPLICATION_JSON.toString());

    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

    if (queryParams != null && !queryParams.isEmpty()) {
      for (Entry<String, String> param : queryParams.entrySet()) {
        builder.queryParam(param.getKey(), param.getValue());
      }
    }

    RestTemplate restTemplate = new RestTemplate();

    try {
      return restTemplate.getForObject(builder.build().encode().toUri(), Object.class);
    } catch (HttpClientErrorException exception) {
      if (exception.getStatusCode() != HttpStatus.NOT_FOUND) {
        throw exception;
      } else {
        return null;
      }
    }

  }
  
  /**
   * Http Post Method
   * @param url
   * @param body
   * @return
   */
  public Object doPost(String url, Object body) {
    try {
      LOGGER
          .debug("Calling POST" + url + "with body" + new ObjectMapper().writeValueAsString(body));
    } catch (JsonProcessingException e) {
      LOGGER.debug("Calling POST " + url + "failed due to Json Processing of body");
    }
    return body;
  }
  
}

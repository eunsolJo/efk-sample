package me.esjo.efksample;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/api")
@Api(tags = {"TEST API"})
public class SpringApiController {

    static final Logger logger = LoggerFactory.getLogger(SpringApiController.class);

    @PostMapping(value = "/test")
    @ApiOperation(value = "테스트")
    public String testApi() {
        logger.info("log info!!");
        logger.info("log error!!");
        return "success test!";
    }

}

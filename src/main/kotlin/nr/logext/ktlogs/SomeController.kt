package nr.logext.ktlogs

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SomeController {

    val logger: Logger = LoggerFactory.getLogger(SomeController::class.java)

    @GetMapping("/log")
    fun log(): String {
        logger.info("Log message:  Hello")
        return "Hello"
    }
}
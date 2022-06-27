package nr.logext.ktlogs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtlogsApplication

fun main(args: Array<String>) {
	runApplication<KtlogsApplication>(*args)
}

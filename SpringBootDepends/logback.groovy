
import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.TRACE


	appender("STDOUT",ConsoleAppender,{
	encoder(PatternLayoutEncoder,{
			pattern = "%5p [%F] (%M:%L) - %m%n"
		})
	})
	root(TRACE,["STDOUT"])


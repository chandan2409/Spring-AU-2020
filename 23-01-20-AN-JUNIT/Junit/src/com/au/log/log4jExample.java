package com.au.log;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class log4jExample {
 static Logger log=LogManager.getRootLogger();
 public static void main(String[] args) {
	log.trace("Trace Message!");
	log.debug("debug Message!");
	log.info("info Message!");
	log.warn("Warn Message!");
	log.error("Error Message!");
	log.fatal("Fatal Message");
}
}

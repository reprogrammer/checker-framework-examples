SHELL = /bin/bash

DEPENDENCIES_FOLDER = ../../deps

CHECKER_FRAMEWORK_FOLDER = \
			   $(DEPENDENCIES_FOLDER)/checker-framework-releases/checker-framework

CHECKER ?= org.checkerframework.checker.nullness.NullnessChecker

SRC_FOLDER = src

CLASS_FOLDER = bin

JAVA_FILES = $(shell find $(SRC_FOLDER) -type f -printf "%p ")

JAR_FILE = $(PROGRAM).jar

RM = rm

MKDIR = mkdir

JAVAC = $(CHECKER_FRAMEWORK_FOLDER)/checker/bin/javac

JAVAC_OPTS = -Awarns -processor $(CHECKER)

JAR = jar

JAR_OPTS = cfe

JAVA = java

JAVA_OPTS = -ea

all: $(JAR_FILE)

$(JAR_FILE): $(JAVA_FILES)

	$(MKDIR) -p $(CLASS_FOLDER)

	$(JAVAC) $(JAVAC_OPTS) -d $(CLASS_FOLDER) $(JAVA_FILES)

	$(JAR) $(JAR_OPTS) $(JAR_FILE) $(MAIN_CLASS) -C $(CLASS_FOLDER) .

run : $(JAR_FILE)

	$(JAVA) $(JAVA_OPTS) -jar $(JAR_FILE) $(PROGRAM_ARGS)

clean:

	$(RM) -rf $(CLASS_FOLDER) $(JAR_FILE)


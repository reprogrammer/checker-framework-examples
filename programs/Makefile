SHELL = /bin/bash

DEPENDENCIES_FOLDER = ../../dependencies

CHECKER_FRAMEWORK_FOLDER = \
			   $(DEPENDENCIES_FOLDER)/checker-framework-releases/checker-framework

SRC_FOLDER = src

CLASS_FOLDER = bin

JAVA_FILES = $(wildcard $(SRC_FOLDER)/*.java)

JAR_FILE = $(PROGRAM).jar

RM = rm

MKDIR = mkdir

JAVAC = $(CHECKER_FRAMEWORK_FOLDER)/checkers/binary/javac

JAVAC_OPTS = -Awarns -processor checkers.nullness.NullnessChecker

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


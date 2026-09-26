plugins {
    application
    id("se.patrikerdes.use-latest-versions") version "0.2.19"
    id("io.github.ben-manes.versions") version "0.61.0"
    checkstyle
    id("org.sonarqube") version "7.4.0.8496"
}

application {
    mainClass.set("hexlet.code.App")
}

group = "hexlet-code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

checkstyle {
    toolVersion = "10.12.0"
}

dependencies {
    checkstyle("com.puppycrawl.tools:checkstyle:${checkstyle.toolVersion}")
}

sonar {
    properties {
        property("sonar.projectKey", "tikhongrigorevich_java-project-61")
        property("sonar.organization", "tikhongrigorevich")
    }
}

tasks.getByName<JavaExec>("run") {
    standardInput = System.`in`
}

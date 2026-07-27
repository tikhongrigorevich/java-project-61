plugins {
    id("java")
    id("application")
    id("se.patrikerdes.use-latest-versions") version "0.2.19"
    id("com.github.ben-manes.versions") version "0.54.0"
    id("checkstyle")
    id("org.sonarqube") version "7.3.1.8318"
}

application {
    mainClass = "hexlet.code.App"
}

group = "hexlet-code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

checkstyle {
    toolVersion = "10.12.4"
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    checkstyle("com.puppycrawl.tools:checkstyle:${checkstyle.toolVersion}")
}

sonar {
    properties {
        property("sonar.projectKey", "tikhongrigorevich_java-project-61")
        property("sonar.organization", "tikhongrigorevich")
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
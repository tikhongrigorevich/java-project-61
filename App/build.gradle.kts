plugins {
    id("java")
    id("application")
    id("se.patrikerdes.use-latest-versions") version "0.2.19"
    id("com.github.ben-manes.versions") version "0.54.0"
    id("checkstyle")
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
    checkstyle("group:artifact:version")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
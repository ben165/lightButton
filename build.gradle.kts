plugins {
    id("java")
}

group = "dhbw"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.cucumber:cucumber-core:7.15.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.1")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.1")
}

tasks.test {
    useJUnitPlatform()
}
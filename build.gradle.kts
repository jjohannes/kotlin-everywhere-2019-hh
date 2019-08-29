plugins {
    id("org.gradle.presentation.asciidoctor")
}

presentation {
    githubUserName.set("jjohannes")
    githubRepoName.set("kotlin-everywhere-2019-hh")
}

dependencies {
    asciidoctor("org.asciidoctor:asciidoctorj-diagram:1.5.11")
}

tasks {
    asciidoctor {
        requires("asciidoctor-diagram")
    }
}
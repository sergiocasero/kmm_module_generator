plugins {
    id("java-gradle-plugin")
    id("maven-publish")
    id("com.gradle.plugin-publish") version "0.16.0"
}

version = "1.0"

gradlePlugin {
    plugins {
        create("KmmModuleGenerator") {
            id = "com.sergiocasero.generator"
            displayName = "Kotlin Multiplatform Module Generator"
            description = """
                This plugin ables you to create so fast a new kotlin multiplatform plugin with all the source sets,
                Example usage:
                
                ./gradlew -q createKmmModule --moduleName=poiui --modulePath=shared/poi --packageName=com.sergiocasero.poi.ui
                
                This command will generate these folders and files:
                shared/poi/poiui/src/commonMain/kotlin/com/sergiocasero/poi/ui/poiui
                shared/poi/poiui/src/iosMain/kotlin/com/sergiocasero/poi/ui/poiui
                shared/poi/poiui/src/androidMain/kotlin/com/sergiocasero/poi/ui/poiui
                shared/poi/poiui/src/androidMain/AndroidManifest.xml
                shared/poi/poiui/build.gradle.kts
                
                And that's it :)
                
            """.trimIndent()
        }
    }
}

pluginBundle {
    website = "https://github.com/sergiocasero/kmm_module_generator"
    vcsUrl = "https://github.com/sergiocasero/kmm_module_generator"
    tags = listOf("kotlin", "multiplatform", "module generator", "kotlin module generator")
}
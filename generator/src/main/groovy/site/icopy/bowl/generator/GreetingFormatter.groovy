package site.icopy.bowl.generator

import groovy.transform.CompileStatic

@CompileStatic
class GreetingFormatter {
    static String greeting(String name) {
        def multiLine = """Hello, ${name.toUpperCase()}"""
        return multiLine
    }

    static void main(String[] args) {
       println greeting("gradlephant")
    }
}
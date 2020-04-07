package com.example.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses(){
        var course = CourseInfo(courseId = "android_intents", title = "Android Programming with Intents")
        courses.set(course.courseId, course)

         course = CourseInfo(courseId = "android_async", title = "android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals : The Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo(courseId = "java_core", title = "Java Fundamentals : The Core Platform")
        courses.set(course.courseId, course)



    }
}
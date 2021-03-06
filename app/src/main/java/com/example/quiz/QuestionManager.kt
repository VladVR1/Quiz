package com.example.quiz
import android.content.Context
import com.example.quiz.model.Question
import com.example.quiz.model.QuestionEntry
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json


class QuestionManager(private val context: Context) {

    fun getQuestion(type:String, count:Int):List<Question> {


        val json = context.readTextFromAsset()
        val questionEntry: QuestionEntry = Json.decodeFromString(json)
        questionEntry.questions.forEach { _ ->
            json.length + 1
        }
       return TODO()
    }

    private fun Context.readTextFromAsset(): String{
        return assets.open("Question.json").bufferedReader().use {
            it.readText()}
    }
}
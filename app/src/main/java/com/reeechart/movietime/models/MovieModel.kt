package com.reeechart.movietime.models

import java.util.*

/**
 * Created by Richard on 29-May-18.
 */
abstract class MovieModel {
    abstract val id: Int
    abstract val title: String
    abstract val genre: Array<String>
    abstract val description: String
    abstract val posterPath: String
}
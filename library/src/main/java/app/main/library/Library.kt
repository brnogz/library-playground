package app.main.library

import com.skybase.humanizer.DateHumanizer
import java.util.*

object Library {
    fun hello(world: String): String {
        val date = DateHumanizer.humanize(
            Calendar.getInstance().time,
            DateHumanizer.TYPE_PRETTY_EVERYTHING
        )
        return "Hello $world! @$date"
    }
}
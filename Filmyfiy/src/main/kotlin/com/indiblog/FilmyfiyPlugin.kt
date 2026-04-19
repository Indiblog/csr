package com.indiblog

import com.lagradost.cloudstream3.plugins.BasePlugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class FilmyfiyPlugin: BasePlugin() {
    override fun load() {
        registerMainAPI(FilmyfiyProvider())
    }
}

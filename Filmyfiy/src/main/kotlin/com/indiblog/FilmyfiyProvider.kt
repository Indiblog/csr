package com.indiblog

import com.lagradost.cloudstream3.*

class FilmyfiyProvider : MainAPI() {
    override var mainUrl = "https://filmyfiy.com"
    override var name = "Filmyfiy"
    override val hasMainPage = true
    override var lang = "hi"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        return newHomePageResponse(emptyList())
    }
}

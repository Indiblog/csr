package com.indiblog

import com.lagradost.cloudstream3.*

class TennistreamProvider : MainAPI() {
    override var mainUrl = "https://tennistream.com"
    override var name = "Tennistream"
    override val hasMainPage = true
    override var lang = "en"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        return newHomePageResponse(emptyList())
    }
}

package com.indiblog

import com.lagradost.cloudstream3.*

class DramaFullProvider : MainAPI() {
    override var mainUrl = "https://dramafull.net"
    override var name = "DramaFull"
    override val hasMainPage = true
    override var lang = "en"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        return newHomePageResponse(emptyList())
    }
}

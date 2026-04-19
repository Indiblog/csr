package com.indiblog

import com.lagradost.cloudstream3.*

class CloudyProviderProvider : MainAPI() {
    override var mainUrl = "https://cloudy.cfd"
    override var name = "Cloudy"
    override val hasMainPage = true
    override var lang = "en"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        return newHomePageResponse(emptyList())
    }
}

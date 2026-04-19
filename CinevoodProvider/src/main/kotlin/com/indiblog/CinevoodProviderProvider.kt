package com.indiblog

import com.lagradost.cloudstream3.*

class CinevoodProviderProvider : MainAPI() {
    override var mainUrl = "https://cinevood.one"
    override var name = "Cinevood"
    override val hasMainPage = true
    override var lang = "hi"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        return newHomePageResponse(emptyList())
    }
}

package com.indiblog

import com.lagradost.cloudstream3.*

class CtgfunProviderProvider : MainAPI() {
    override var mainUrl = "https://ctgfun.com"
    override var name = "CtgFun"
    override val hasMainPage = true
    override var lang = "bn"
    override val supportedTypes = setOf(TvType.Movie, TvType.TvSeries)

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        return newHomePageResponse(emptyList())
    }
}

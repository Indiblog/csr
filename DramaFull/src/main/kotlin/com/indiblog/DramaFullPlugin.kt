package com.indiblog

import com.lagradost.cloudstream3.plugins.BasePlugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class DramaFullPlugin: BasePlugin() {
    override fun load() {
        registerMainAPI(DramaFullProvider())
    }
}

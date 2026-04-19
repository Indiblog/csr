package com.indiblog

import com.lagradost.cloudstream3.plugins.BasePlugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class TennistreamPlugin: BasePlugin() {
    override fun load() {
        registerMainAPI(TennistreamProvider())
    }
}

package com.indiblog

import com.lagradost.cloudstream3.plugins.BasePlugin
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin

@CloudstreamPlugin
class CtgfunProviderPlugin: BasePlugin() {
    override fun load() {
        registerMainAPI(CtgfunProviderProvider())
    }
}

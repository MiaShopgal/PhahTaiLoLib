package com.bastet.miao.phahtailo.lib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
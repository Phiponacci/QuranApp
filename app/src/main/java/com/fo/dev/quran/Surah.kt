package com.fo.dev.quran

enum class SurahType{
    MADANIA, MAKIYAH
}


data class Surah(
    var type: SurahType,
    var name: String,
    var number: Int,
    var ayahCount: Int,
    var pageRange: Pair<Int, Int>,
)

object SurahRepository{
    val surahList = listOf(
        Surah(SurahType.MAKIYAH, "الفاتحة", 1, 7, Pair(1,1)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(2,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(3,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(4,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(5,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(6,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(7,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
        Surah(SurahType.MADANIA, "البقرة", 2, 286, Pair(8,49)),
    )
}

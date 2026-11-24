    @Suppress("REDUNDANT_ELSE_IN_WHEN")
    fun Int.toOrdinal(context: Context): String {
        val language = getCurrentLanguage(context)
        return when (language) {
            Language.ENGLISH -> when {
                this % 100 in 11..13 -> context.getString(R.string.ordinal_fallback, this) // 11th, 12th, 13th, 111th, 112th, etc.
                this % 10 == 1 -> context.getString(R.string.ordinal_first, this) // 1st, 21st, 31st, etc.
                this % 10 == 2 -> context.getString(R.string.ordinal_second, this) // 2nd, 22nd, 32nd, etc.
                this % 10 == 3 -> context.getString(R.string.ordinal_third, this) // 3rd, 23rd, 33rd, etc.
                else -> context.getString(R.string.ordinal_fallback, this) // 4th, 5th, 6th, etc (everything else)
            }
            Language.CHINESE -> context.getString(R.string.ordinal_fallback, this) // everything the same
            Language.ITALIAN -> context.getString(R.string.ordinal_fallback, this) // everything the same
            Language.JAPANESE -> context.getString(R.string.ordinal_fallback, this) // everything the same
            Language.KOREAN -> context.getString(R.string.ordinal_fallback, this) // everything the same
            Language.PORTUGUESE -> context.getString(R.string.ordinal_fallback, this) // everything the same
            Language.SPANISH -> context.getString(R.string.ordinal_fallback, this) // everything the same
            Language.VIETNAMESE -> context.getString(R.string.ordinal_fallback, this) // everything the same
            // Remaining: ARABIC, BENGALI, CZECH, DANISH, DUTCH, FILIPINO, FINNISH, FRENCH, GERMAN, GREEK, HINDI, INDONESIAN, POLISH, ROMANIAN, RUSSIAN, SWEDISH, THAI, TURKISH
            else -> this.toString() // 1, 2, 3, 4, etc.
        }
    }

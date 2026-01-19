# Merg-Translations

Welcome to the official translation repository for **Merg** by Redpixels Studio! The entire purpose of this project is to translate the game and bring it to players around the entire world.

## About This Repository

This repository contains translation files for Merg in multiple languages. If you're fluent in a language and want to help make Merg accessible to more players, we'd love your contribution!

Contribute a translation and you *may* receive the **Translator** role on our Discord server and be credited in the game's Support menu!

---

## Getting Started

### How to Contribute

1. **Locate (or create)** the translation file for your language (reference the English file for structure and content)
2. **Translate** the strings following the guidelines below
3. **Submit a pull request** with your changes
4. **Include your Discord ID** in the pull request description (and your Merg ID once available)

### File Structure

```
Merg-Translations/
├── res/
│   ├── values/
│   │   └── strings.xml (English reference)
│   ├── values-de/
│   │   └── strings.xml
│   ├── values-it/
│   │   └── strings.xml
│   └── values-[language-code]/
│       └── strings.xml
```

Use the **English file** as your reference for context, formatting, and structure. Keep your language file open side-by-side while translating.

### Need Help?

For any **issues, bugs, feedback or missing strings:** [Create an issue](https://github.com/manu12223/Merg-Translations/issues) on this repository; or contact **Manu** or **Kuchen** on [our Discord Server](https://discord.gg/g7gqd9HV6n)

## Translation Guidelines

### Quality Standards

1. **Language fluency:** You must be fluent enough in English to understand the meaning and context of each string.
2. **Native speaker priority:** Only translate into languages you speak natively or are fully comfortable with.
3. **No AI or automated translation tools:** Do not use Google Translate, DeepL, ChatGPT, Gemini, Claude, or similar tools.

### Technical Requirements

4. **Preserve placeholders:** Do not remove, modify, or translate placeholder variables. You may reposition them if your language requires different word order.

| Placeholder | Type | Example |
|-------------|------|---------|
| `%d` | Integer | "Size: %d" |
| `%s` | String | "Room crashed: %s" |
| `%.xf` | Decimal | "Decay: %.2f/s" |
| `%1d` and `%2d` | Multiple numbers | "Pieces: %1d/%2d" |

5. **Preserve file structure:** Do not modify, delete, or alter the XML structure, comments, or strings marked as `translatable="false"`. Keep the file format identical to the English version.

### Formatting & Consistency

6. **Match English formatting:** Maintain capitalization, punctuation, and spacing from the English version. If the English string is "Copy.", your translation must also end with a period and start with a capital letter (if applicable to your language).

7. **Keep string length similar:** Try to match the length and structure of the English strings, especially for UI elements with limited space. Avoid extremely long translations that may break the game's layout.

8. **Be consistent:** Use the same terms and phrasing throughout your entire translation. If you translate a word one way in one string, use the same translation elsewhere.

### Submission Best Practices

9. **One pull request per language:** Submit all strings for a single language in one pull request. Avoid:
   - Multiple pull requests for the same language in a short time frame
   - Empty or broken pull requests
   - Duplicate submissions
   - Spamming the repository in any way

---

## Submission Checklist

Before submitting your pull request, verify that:

- [ ] All strings are translated (except ones marked `translatable="false"`)
- [ ] No placeholders (`%d`, `%s`, etc.) are removed or modified
- [ ] File structure and formatting match the English version exactly
- [ ] Punctuation and capitalization are consistent with the English strings
- [ ] No automated translation tools were used
- [ ] Your Discord ID (and Merg ID when available) are included in the PR description
- [ ] The file is valid XML (no broken tags or unexpected text)

---

## Thank You!

Thank you for being part of the development of Merg and helping bring it to players around the world!

🌍 Happy translating! 🌍

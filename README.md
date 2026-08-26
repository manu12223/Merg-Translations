# Merg-Translations

¡Bienvenido al repositorio oficial de traducciones de **Merg**, de Redpixels Studio! El objetivo principal de este proyecto es traducir el juego y llevarlo a jugadores de todo el mundo.

## Acerca de este repositorio

Este repositorio contiene archivos de traducción para Merg en varios idiomas. Si dominas un idioma y quieres ayudar a que Merg llegue a más jugadores, ¡nos encantaría contar con tu colaboración!

Si aportas una traducción, *podrías* recibir el rol de **Traductor** en nuestro servidor de Discord y aparecer en los créditos dentro del menú de soporte del juego.

---

## Primeros pasos

#Cómo contribuir

1. **Localiza (o crea)** el archivo de traducción para tu idioma (consulta el archivo en inglés para ver la estructura y el contenido)
2. **Traduce** las cadenas de texto siguiendo las directrices que aparecen a continuación
3. **Envía una *pull request*** con tus cambios
4. **Incluye tu ID de Discord** en la descripción de la *pull request* (y tu ID de Merg, una vez que esté disponible)

### Estructura de archivos

```Fusionar traducciones/
├── res/
│   ├── valores/
│   │   └── strings.xml (referencia en inglés)
│   ├── valores-de/
│   │   └── strings.xml
│   ├── valores-it/
│   │   └── strings.xml
│   └── valores-[código-de-idioma]/
│       └── strings.xml
```
Utiliza el **archivo en inglés** como referencia para el contexto, el formato y la estructura. Mantén tu archivo de idioma abierto junto al de referencia mientras traduces.

### ¿Necesitas ayuda?

Para cualquier **problema, error, comentario o cadena faltante:** [crea una incidencia](https://github.com/manu12223/Merg-Translations/issues) en este repositorio, o contacta con **Manu** o **Kuchen** en [nuestro servidor de Discord](https://discord.gg/g7gqd9HV6n).

## Pautas de traducción

### Estándares de calidad

1. **Fluidez lingüística:** Debes tener suficiente fluidez en inglés para comprender el significado y el contexto de cada cadena de texto.
2. **Prioridad para hablantes nativos:** Traduce únicamente a idiomas que hables como lengua materna o con los que te sientas totalmente cómodo.
3. **Prohibición de IA o herramientas de traducción automática:** No utilices Google Translate, DeepL, ChatGPT, Gemini, Claude ni herramientas similares.

### Requisitos técnicos

4. **Conservación de marcadores de posición:** No elimines, modifiques ni traduzcas las variables de marcador de posición (*placeholders*). Puedes cambiar su posición si la estructura gramatical de tu idioma requiere un orden de palabras diferente.

|Marcador de posición | Tipo | Ejemplo |
|-------------|------|---------|
| `%d` | Entero | "Size: %d" |
| `%s` | Cadena de texto | "Room crashed: %s" |
| `%.xf` | Decimal | "Decay: %.2f/s" |
| `%1d` y `%2d` | Varios números | "Pieces: %1d/%2d" |

5. **Conservar la estructura del archivo:** No modifique, elimine ni altere la estructura XML, los comentarios ni las cadenas marcadas como `translatable="false"`. Mantenga el formato del archivo idéntico al de la versión en inglés.

### Formato y coherencia

6. **Respeta el formato del inglés:** Mantén las mayúsculas, la puntuación y el espaciado de la versión en inglés. Si la cadena en inglés es "Copy.", tu traducción también debe terminar con un punto y comenzar con mayúscula (si corresponde en tu idioma).

7. **Mantén una longitud similar:** Intenta igualar la longitud y la estructura de las cadenas en inglés, especialmente en elementos de la interfaz con espacio limitado. Evita traducciones excesivamente largas que puedan romper el diseño visual del juego.

8. **Sé coherente:** Utiliza los mismos términos y expresiones a lo largo de toda la traducción. Si traduces una palabra de una manera en una cadena, usa la misma traducción en otras partes.

### Mejores prácticas para el envío

9. **Una solicitud de extracción por idioma:** Envía todas las cadenas de texto de un mismo idioma en una sola solicitud de extracción. Evita:

- Varias solicitudes de extracción para el mismo idioma en un corto período de tiempo.

- Solicitudes de extracción vacías o defectuosas.

- Envíos duplicados.

- Enviar spam al repositorio de cualquier forma.

---

## Lista de verificación para el envío

Antes de enviar tu solicitud de extracción, verifica que:

- [ ] Todas las cadenas están traducidas (excepto las marcadas como `translatable="false"`)
- [ ] No se han eliminado ni modificado marcadores de posición (`%d`, `%s`, etc.)
- [ ] La estructura y el formato del archivo coinciden exactamente con la versión en inglés
- [ ] La puntuación y el uso de mayúsculas son coherentes con las cadenas en inglés
- [ ] No se han utilizado herramientas de traducción automática
- [ ] Tu ID de Discord (y tu ID de Merg, si está disponible) se incluyen en la descripción de la solicitud de incorporación de cambios (PR)
- [ ] El archivo es un XML válido (sin etiquetas rotas ni texto inesperado)

---

## ¡Gracias por todo!

¡Gracias por formar parte del desarrollo de Merg y por ayudar a llevarlo a jugadores de todo el mundo!

🌍 ¡Feliz traducción! 🌍

def cleanUrlList(xs: List[String]): List[String] = {
  val urlRegex = """<https:\/\/[^\s<>]+\.[^\s<>]+>"""
  xs.filter( _.matches(urlRegex) )
}

val urlList: List[String] = List("<https://miweb.com>", "Null", "<https://miweb.com/sobre-nosotros/>", "<https://miweb.com/contacto/>", "<http://miweb.com/contacto/>", "<https://miweb.com/blog/>", " ", "<https://miweb.com/blog/2023/06/01/mi-primer-post/>", "<https://miweb.com/blog/2023/06/02/mi-segundo-post/>", "None")

val urlListCleaned: List[String] = List("<https://miweb.com>", "<https://miweb.com/sobre-nosotros/>", "<https://miweb.com/contacto/>", "<https://miweb.com/blog/>", "<https://miweb.com/blog/2023/06/01/mi-primer-post/>", "<https://miweb.com/blog/2023/06/02/mi-segundo-post/>")

assert(urlListCleaned == cleanUrlList(urlList))
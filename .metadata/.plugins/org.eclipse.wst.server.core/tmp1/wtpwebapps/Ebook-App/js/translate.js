if (typeof Storage !== "undefined") {
    function toLanguage(lang) {
        if (localStorage.getItem("lang") !== lang) {
            localStorage.setItem("lang", lang);
            loadTranslations(lang);
        }
    }

    function loadTranslations(lang) {
        fetch(`json/translations_${lang}.json`)
            .then((response) => response.json())
            .then((translations) => {
                for (const key in translations) {
                    const elements = document.querySelectorAll(`[id="${key}"]`);
                    elements.forEach((element) => {
                        element.innerHTML = translations[key] || "";
                    });
                }
            })
            .catch((error) => {
                console.error('Error fetching translations:', error);
            });
    }

    const langEn = document.getElementById("lang-en");
    if (langEn) {
        langEn.addEventListener("click", () => toLanguage("eng"));
    }

    const langBe = document.getElementById("lang-ru");
    if (langBe) {
        langBe.addEventListener("click", () => toLanguage("ru"));
    }

    const storedLang = localStorage.getItem("lang") || "eng";
    loadTranslations(storedLang);
}

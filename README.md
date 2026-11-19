# AndroidStudio-Lista_INF04 – Lista notatek

Aplikacja mobilna na Androida (Kotlin + XML) wykonana na podstawie **części II** arkusza egzaminacyjnego
**INF.04-02-23.01-SG** (egzamin zawodowy, styczeń 2023, kwalifikacja INF.04 – *Projektowanie, programowanie
i testowanie aplikacji*).

Aplikacja obsługuje proste notatki tekstowe – wyświetla listę notatek i pozwala dopisywać nowe na jej koniec.

## Materiały do zadania

| Plik | Opis |
|------|------|
| [`zasoby/arkusz_INF04_2023_01_02_SG.pdf`](zasoby/arkusz_INF04_2023_01_02_SG.pdf) | Arkusz egzaminacyjny z treścią zadania |
| [`zasoby/dane.txt`](zasoby/dane.txt) | Dane początkowe – 3 notatki (w arkuszu – z archiwum `zad2.zip`) |

## Elementy aplikacji (wg arkusza)

- Pole edycyjne z podpowiedzią „Nowy element”
- Przycisk **DODAJ** z białym tekstem na tle Crimson (`#DC143C`)
- Lista (`ListView`) z domyślnym kolorem czcionki i widocznym separatorem w kolorze Crimson (`#DC143C`)

## Działanie

- Na start lista zawiera 3 notatki:
  - „Zakupy: chleb, masło, ser”
  - „Do zrobienia: obiad, umyć podłogi”
  - „weekend: kino, spacer z psem”
- **DODAJ** – dopisuje treść z pola edycyjnego jako ostatni element listy; widok listy odświeża się
  automatycznie (`ArrayAdapter` + `notifyDataSetChanged()`)

## Założenia z arkusza

- Interfejs zapisany w XML
- Pionowy `LinearLayout` z zagnieżdżonym poziomym `LinearLayout` dla pola edycyjnego i przycisku
- Notatki przechowywane w kolekcji napisów (`MutableList<String>`) podpiętej do `ListView` jako źródło danych

## Najważniejsze pliki

- [`app/src/main/res/layout/activity_main.xml`](app/src/main/res/layout/activity_main.xml) – interfejs użytkownika
- [`app/src/main/java/com/example/androidstudio_lista_inf04/MainActivity.kt`](app/src/main/java/com/example/androidstudio_lista_inf04/MainActivity.kt) – logika dodawania notatek do listy

## Uruchomienie

1. Otwórz folder projektu w Android Studio.
2. Poczekaj na synchronizację Gradle (**File → Sync Project with Gradle Files**).
3. Uruchom aplikację na emulatorze lub telefonie (**Run ▶**). Minimalna wersja: Android 6.0 (API 23).

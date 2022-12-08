# Tesztjegyzőkönyv

Teszteléseket végezte: Szarvák Cintia

Operációs rendszer: Android 12

Ebben a dokumentumban lesz felsorolva az elvégzett tesztek elvárásai és eredményei, illetve időpontjai (Alfa, Béta és Végleges verzió).

## Alfa teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Calendar View| 2022.11.19. | Az alkalmazás megjelenti a hónap napjait | Az alkalmazás megjelenítette a hónap napjait | Nem találtam hibát |
| Calendar View| 2022.11.19. | Az alkalmazás megjelenti az adott évet | Az alkalmazás megjelenítette az adott évet | Nem találtam hibát |
| Calendar View| 2022.11.22. | Az alkalmazásban megjelenik az 'Add' gomb| Az alkalmazásban megjelent az 'Add' gomb | Add gomb formázásra szorul|
| Esemény hozzáadás| 2022.11.30. | Az alkalmazásban az 'Add' gombra kattintva esemény adható meg| Az alkalmazásban az esemény megnevezése után az eseményt hozzáadjuk a naptárhoz |nem találtam hibát|
| Idő kiválasztás | 2022.11.30. | Az alkalmazásban óra jelenik meg, amiben kiválaszthatjuk az időt| Az alkalmazásban megjelent az óra | Nem találtam hibát|

Az Alfa tesztelés során a vizsgált elemek mind hibátlanul működtek mindenféle fennakadások nélkül.
Az Alfa tesztelés során a vizsgált elemek között volt ami nem megfelelően működött, ez a későbbiek során javításra szorul.

Következő tesztelésnél a többi funkció kerül vizsgálatra illetve elemzésre.
## Béta teszt

| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Event mentése| 2022.12.02. | A beírt esemény mentésre kerül|  A beírt esemény mentésre került | Nem találtam hibát |
| Dátum mentése| 2022.12.02. | A beállított dátum mentésre került|  A beállított dátum mentésre került | Nem találtam hibát |
| Event törlése| 2022.12.02. | A beírt esemény gomb megnyomására törlésre került|  A beírt esemény nem törlődött| Hibás funkció|
| Event törlése| 2022.12.03. | A beírt esemény gomb megnyomására törlésre került|  A beírt esemény törlődött| Hiba kijavítva|


A Béta teszt sikeresen zajlott.
A Béta teszt során akadtan hibák, mely(ek) javításra szorulnak.

A végleges tesztelés során az összes fent felsorolt vizsgálati elem újra ellenőrzésre kerül. Ezzel együtt az új funkciók is tesztelésre kerültek.

## Végleges teszt
| Vizsgálat | Tesztelés időpontja | Elvárás | Eredmény | Hibák |
| :---: | --- | --- | --- | --- |
| Naptár navigáció| 2022.12.04. | Az alkalmazás lapozható |Az alkalmazás lapozható| Nem találtam  hibát |
| Esemény hozzáadás| 2022.12.04. |Az esemény megnevezése után az 'Add' gombbal eseményt adunk meg, ami mentésre kerül |Az esemény megjelenik| Nem találtam  hibát |
| Esemény idejének megadás| 2022.12.04. | Az óra segítségével pontos idő adható meg|Pontos idő megadva| Nem találtam  hibát |
| Törlés funkció| 2022.12.04. | Az esemény törlésre kerül|Esemény sikeresen törölve| Nem találtam  hibát |
| Több esemény| 2022.12.04. | Azonos napra új esemény hozzáadása |Az új eseményt eltárolja, megjelenik, a meglévőt nem módosítja| Nem találtam  hibát |
| Több esemény| 2022.12.04. | Más napra új esemény hozzáadása |Az új eseményt eltárolja, megjelenik, a meglévőt nem módosítja| Nem találtam  hibát |

A Végleges teszt lezajlott és minden funkció rendesen működik, esztétikailag is megfelelő a program.

Átadásra készen áll a megrendelőnek.

Tesztelést végezte és írta: Szarvák Cintia

Befejezve: 2022.12.04.

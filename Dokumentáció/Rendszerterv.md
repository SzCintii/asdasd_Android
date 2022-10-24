
# Rendszerterv
## 1. A rendszer célja
### Egy olyan Android alkalmazást készítünk, ami eseményeket képes kezelni, amit a felhasználó ad meg, illetve ellátja a klasszikus naptár funkcióit. A felület felhasználóbarát, egyszerű és személyre szabható.
## 2. Projektterv

### 2.1 Projektszerepkörök, felelőségek:
   * Developer - Szarvák Cintia
   * Developer - Major Gergő B.
   * Developer - Verebély Valentin

### 2.2 Ütemterv:

|Funkció                  | Feladat                                | Prioritás | Becslés (nap) | Aktuális becslés (nap) | Eltelt idő (nap) | Becsült idő (nap) |
|-------------------------|----------------------------------------|-----------|---------------|------------------------|------------------|---------------------|
|Követelmény specifikáció |Megírás                                 |         1 |             1 |                      1 |                1 |                   1 |             
|Funkcionális specifikáció|Megírás                                 |         1 |             1 |                      1 |                1 |                   1 |
|Rendszerterv             |Megírás                                 |         1 |             1 |                      1 |                1 |                   1 |
|Program                  |Képernyőtervek elkészítése              |         2 |             1 |                      1 |                1 |                   1 |
|Program                  |Prototípus elkészítése                  |         3 |             8 |                      8 |                8 |                   8 |
|Program                  |Alapfunkciók elkészítése                |         3 |             8 |                      8 |                8 |                   8 |
|Program                  |Tesztelés                               |         4 |             2 |                      2 |                2 |                   2 |
     
### 2.3 Mérföldkövek:
* Alfa-teszt
* Béta-teszt
* Idő közbeni bemutatás
* Végleges teszt
* Végleges bemutatás

## 3. Üzleti folyamatok modellje
### Egy hétköznapi naptár alkalmazás, amiben lehet saját eseményt megadni, kezeli a meglévő ünnepeket és remindert-t tudunk beállítani

## 4. Követelmények
* Naptár megjelenítése
* Saját események tárolása
* Saját események szerkesztése/módosítása
* Meglévő ünnepek tárolása
* Reminder állítása
* Témák választása

## 5. Funkcionális terv
### Admin és User között nincs különbség ugyanúgy tudják használni az alkalmazást.
* Esemény megadás
* Téma választás
* Reminder állítása
* Saját események szerkesztése/módosítása

## 6. Fizikai környezet
### Az alkalmazás Android alapú rendszereken fut (okostelefon, táblagép). 
### Fejlesztői eszköz:
* Android studio
## 7. Architekturális terv
### A user interface (UI), illetve a backend, Android studioban készül java kódban, az adatokat pedig JSON obijektumban tároljuk.

## 8. Implementációs terv
### A kód egésze Java nyelven íródik. A kód különböző részeit (UI, funkciók) amennyire csak lehet külön fájlokba írva készítjük, és úgy fogjuk egymáshoz csatolni a jobb átláthatóság, könnyebb változtathatóság, és könnyebb bővítés érdekében.
     
## 9. Tesztterv:
### Alfa-teszt
A teszt elsődleges célja: az eddig meglévő funkcióknak és a különböző androidokkal való kompatibilitásának tesztelése. A tesztet a fejlesztők végzik.
Az eljárás sikeres, ha különböző androidokon is megfelelően működnek a különböző funkciók. A teszt időtartama egy hét.

### Béta-teszt
Ezt a tesztet nem a fejlesztők végzik.
Tesztelendő android rendszerek:6.0.0(minimum), vagy újabbak
Tesztelendő kijelző méretek: 1280x720 (minimum), 1366x768, 1920x1080
A teszt időtartama egy hét.
A tesztelés alatt a tesztelő felhasználók visszajelzéseket küldhetnek a
fejlesztőknek, probléma/hiba felmerülése esetén.
Ha hiba lép fel, a fejlesztők kijavítják a lehető leghamarabb. Sok hiba esetén a tesztelés ideje elhúzódhat plusz egy héttel.

### Tesztelendő funkciók:
* Alkalmazás megnyitása
* Esemény megadás
* Esemény módosítása
* Téma kiválasztása
* Reminder állítása

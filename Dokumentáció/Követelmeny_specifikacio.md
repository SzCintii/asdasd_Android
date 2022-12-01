# Követelmény specifikáció

## 1. Áttekintés
### - Android alapú Nyilvántartó és eseménykezelő alkalmazás kizárólag Android alapú 		    eszközön működik. A felhasználó saját maga adhat meg eseményeket, maga az alkalmazás tartalmazza az alapértelmezett magyar és nemzetközi ünnepeket.

## 2. A jelenlegi helyzet leírása
### - Az Alkalmazás Áruházban rengeteg ehhez hasonló applikáció található, de azok vagy nem felelnek meg minden felhasználó igénynek, vagy csak szimplán túlárazottak esetleg tele vannak reklámokkal. A mi alkalmazásunk egy felhasználóbarátabb, egyszerűbben kezelhető felületet kínál a mindennapos felhasználásra a fogyasztóknak. 

## 3. Vágyálomrendszer
### - Programunk célja, egy olyan felhasználóbarát eseménykezelő rendszer kialakítása ami a userek kedvére alakítható, személyre szabható és emellett ellátja a szükséges funkciókat is. A felhasználó tud váltani nézetet napi, heti és havi felbontás között. Szín kódolni tudja eseményeit, illetve, hogy milyen időközönként emlékeztessen.

## 4. Funkcionális követelmények
### - Csak User Funkciók vannak, van egy Naptár és van egy tervezői nézet. A Naptárnézetben tudja a felhasználó megtekinteni a múlt, jelenlegi és jövő eseményeit. A Tervező nézetben pedig hozzáadni és szerkeszteni tudja azokat. A naptárnézetben saját maga tudja kiválasztani a témát(a naptár témáját), illetve a nézetet. A Tervező nézetben megtudja adni egy eseménynek a pontos dátumát, időtartamát, megjegyzést hozzá.

## 5. Jelenlegi üzleti folyamatok modellje
### - A legtöbb ehhez hasonló alkalmazás nem kínál elég kényelmes és könnyen kezelhető felületet, vagy megfizethető applikációt a felhasználók számára. Jelenleg minden applikációt teleraknak reklámokkal a szponzorációs pénzek miatt, de ezek nagyon zavaróak főleg akkor amikor az ember sietni kívánna. Ezeken sokszor csak rontani szokott az, hogy offline módban nem lehet használni az applikáció  

## 6. Igényelt üzleti folyamatok
### - A felhasználó megnyitja az applikációt, az eseménykezelő naptár felülete fogadja. Rányom a felhasználó egy napra, az kiemelve megjelenik és (ha van) megmtatja a nap eseményeit és az esemény hozzáadás funkciót. Természetesen lehet lapozni évek, hónapok között. Mindezek mellett lehet állítani a színét, témáját az eseménykezelőnek a beágyazott színek szerint. 

## 7. Követelménylista 
| Id | Modul | Név | Leírás |
| :---: | --- | --- | --- |
| K1 | Felüelt | Kezdőképernyő | A felhasználó itt nézheti meg az adott hónap napjait és itt képes a felhasználó hozzárendelni új eseményt a kiválasztott naphoz. |
| K2 | Funkció | Esemény hozzáadása | A felhasználó képes arra, hogy egy eseményt tdjon beírni a nyilvántartó és eseménykezelő alkalmazásba. |
| K3 | Funkció | Események módosítása | A felhasználó képes arra, hogy az álatala megadot eseményeket módosítsa vagy törölje. |
| K4 | Funkció | Napi események | A felhasználó itt képes arra, hogy megnézze az általa beírt eseményeket. |
| K5 | Funkció | Meglévő ünnepek tárolása | Az alkalmazás képes arra, hogy ünnepeket jelenítsen meg a felhasználó számára. |
| K6 | Funkció | Reminder állítása | Az alkalmazás képes arra, hogy a beállított eseményeket jelezze a felhasználónak, kívánt időpontokban. |
| K7 | Funkció | Témák választása | A felhasználó az alkalmazásban képes megváltoztatni a user interface témáját. |

## 8. Fogalomtár
- **Alkalmazás Áruház:** Ennek a segítségével alkalmazásokat, játékokat és digitális tartalmakat/szoftvereket tölthetünk le az eszközünkre.
- **Applikáció:** Az angol application szóból származik, magyarul alkamazást jelent. Ez egy magyarosított változata a szónak.
- **Reminder:** EZ egy angol szó, aminek a jelentése az emlékeztető.
- **Kezdőképernyő** Az alkalmazás elindítása után felhasználó ezt a képernyőt fogja látni az eszközén először.

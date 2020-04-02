Nimed: Karl-Martin Karnö ja Robert-Juss Soe

Projekti kirjeldus: Meie projekti eesmärk oli luua mäng. Kasutasime klassikalist kivi-paber-käärid ideed, sest selles
sai väga edukalt ära kasutada Randomit. Samuti annab see võimaluse küsida korduvalt kasutajasisendit ja seda programmi
töös kasutada. Mängu puhul soovisime ka, et oleks võimalus salvestada tulemus, et näha, kuidas on mängud läinud.
Programm töötab tänu arvuti-kasutaja suhtlusele. Hilisem edasiarendus hõlmaks ka erinevate mängude võimalusi.
Programmi töötamiseks panna tööle test.java ja fail mängijad.txt samasse kausta src kaustaga(MITTE src SISSE!).

Klassid:

KiviPaberKäärid.java -
Selle klassi eesmärk on kontrollida ja hoida töös kõike, mis on seotud kasutaja valikute tegemisega
ning arvuti otsuse tegemine.
Meetod arvutiValik on oluline, et arvutil tekiks suvaliselt valik.
Meetodid inimese valiku kohta on 3: valikuKüsimine teeb kindlaks inimese valiku ning seda meetodid kasutab valikuKontroll,
mis veendub, et inimese sisestatud valik on "kivi","paber", või "käärid". Vajadusel laseb kasutajal uuesti sisestada valiku.
Viimase, inimeseValik, meetodi ülesanne on juba kontrollitud valiku ette andmine programmile edasiseks tööks.
Meetod, tulemus, eesmärk on saada arvuti ja kasutaja valik, neid võrrelda ja väljastada tulemus.
Viimased kaks meetodit on mänguga seotud. Mängualustamine kontrollib kas kasutaja on valmis mängu alustama. VõtmeSõnaKOntroll
otsib kasutaja sisendist võtmesõna, et vajadusel programm peatada.

test.java - Sealt hakkab programm jooksma.
Peameetod jooksutab mängu seni kuni mängija soovib selle peatada. Pidevalt väljastatakse jooksva mängu tulemus.

Mängija.java -
Selle klassi eesmärk on koostada nn "mängija profiil". Juhul, kui kasutajat pole olemas, siis loob selle mängijale.
Kasutaja on vajalik skoori salvestamiseks. Kui kasutaja on olemas, siis lihtsalt uuendab tema skoori.

Meetod kontrolliFailist mõte on kontrollida tekstifailist, kas antud kasutaja on olemas või mitte. Kui on olemas,
siis salvestab tulemused, et liita nendele juurde uued mängu tulemused.
Meetod kirjutaFaili hakkab tööle pärast mängu lõppemist. Juhul, kui kasutaja oli olemas, siis ta muudab sellel real oleva
tulemuse. Kui loodi uus kasutaja, siis lisatakse tekstifaili lõppu uus mängija.
Meetod mängijaKontroll kasutab kontrolliFailist meetodit, selleks, et vaadata, kas me peame looma uue kasutaja või on mängijal
juba kasutaja olemas. Kui kasutaja on olemas, siis on võimalus nullida oma eelnevad tulemused.

See klass annab meile tulevikuks hea võimaluse teha graafilise sisselogimise ja erinevate mängude tulemuste salvestamise.

Protsess:

Algselt saime idee paika. Lasime selle nädala seedida ja pärast seda hakkasime tegema. Mõlemad tiimiliikmed osalesid
võrdselt ning suhtlesime igapäevaselt projekti osas. Kasutasime gitHub, mis ühildus ka IntelliJ IDEA ja sealt sai kiirelt pull/push.
Karl-Martin tegeles peamiselt KiviPaberKäärid.java klassi tegelemisega ja samuti test.java. Ajakulu umbkaudu 5-7h.
Robert tegeles Mängija.java klassi tegemisega ja test.java . Ajakulu umbkaudu sama.

Projekti oleks kindlasti olnud teha veidi mugavam, kui oleks vähemalt ühe korra saanud kokku, ideed kaardistada ja midagi
juba koos alustada. Aga õnneks sai ilma selleta ka hästi hakkama. Edasi on siit kindlasti lihtsam minna.

Tulemusega oleme täitsa rahul ja plaan seda ka edasi arendada ja lisada graafiline pool ja listada klasse ja meetodeid.

Testisime programmi ja meetodite tööd pidevalt. Kui uus meetod valmis, proovisime kas töötab ja ega eelmiste töö pole uue
meetodi tõttu häiritud. Sellega oli pidevalt kindlustatud, et kirjas olevad meetodid on töötavad.

# BoardLang

Skład zespołu: Kalina Rączka, Natalia Kuchta <br>
Kontakt: karaczka@student.agh.edu.pl, nkuchta@student.agh.edu.pl

## Opis projektu

Projekt skupia się na stworzenie języka programowania służącego do generacji plansz do gier planszowych lub fabularnych. 

Projekt realizowany w ramach przedmiotu Teoria Kompilacji i Kompilatory.

## Podstawowe zasady działania projektu:
Użytkownik definiuje rozmiar planszy, liczony w “kratkach”, po której następnie może się dowolnie poruszać używając instrukcji języka.
Użytkownik umieszcza wcześniej zdefiniowane przez siebie płytki (Tiles) na kratkach, tworząc własne plansze do gry.

## Podstawowe założenia składni języka:
Linia instrukcji kończy się znakiem ‘$’
Bloki instrukcji zamykane są w nawiasach klamrowych, przykład:
Przykład definiowania zmiennych
```
INT x = 9 $
BOOL isEmpty = TRUE $
```

## Zmienne:
### Obsługiwane typy zmiennych

```
INT
BOOL
CHAR
STRING
COLOR
```

### TileType
Tile "płytka" jest podstawową jednostką działania programu. Definiując typ płytki (TileType) użytkownik tworzy szablon płytki, który może wielokrotnie umiejscawiać na wielu polach. Aby zdefiniować płytkę, trzeba jako argument podać albo jej kolor albo string zawierający ścieżkę / link do obrazu, który ma zostać użyty na gotowej planszy.

```
TileType touch_grass = TileType(#5ec15f)

```


### Tablice
Przykładowe tworzenie tablic:
```
INT ARRAY[7] tab = [1,2,3,4,5,6,7] $
```
Odwoływanie się do tablic:
```
INT y = tab[0] $
```
### Const
Deklarację zmiennej można poprzedzić słowem kluczowym “const”, dzięki czemu nie można jej edytować później w trakcie działania programu.
```
const INT z = 10 $
```

## Operacje na planszy

### board_size
Każdy program w BoardLangu musi rozpocząć się od zdefiniowania rozmiaru planszy, którą póżniej program będzie zapełniał.
```
board_size[45:90] $
```

### draw
Instrukcja służąca do narysowania płytki na planszy. Płytkę można umieścić używając wybranych współrzędnych lub obecnego położenia kursora.
```
draw [x:y] touch_grass $
draw [here] touch_grass $
draw [2:8] toucg_grass $
draw [x:9] touch_grass $
```

### setpos i reset
Instrukcje setpos i reset służą do ustawiania obecnej pozycji kursora na planszy. Do obecnej pozycji kursora można się odwołać używając 'here'.
```
reset $
setpos [5:8] $
setpos [here.x+2:here.y] $
int x = here.x $

```

## Dostępne operatory

```
+
-
/
%
*
()
>
<
=
==
!=
>=
<=
OR
AND
NOT
++
– –
```

## Instrukcje warunkowe
Instrukcję warunkową zaczynamy słowem kluczowym if, po którym następuje warunek zapisany w nawiasach okrągłych. Opcjonalnie można użyć również otherif i otherwise.

```
if (x > 5) {
	y = 78 $
}
otherif (x<3){
	y = 22 $
}
otherwise {
	y = 3 $
	z = 45 $
}
```


## Pętle

### Pętla warunkowa

Przypomina pętlę ,,while”, ale słowem kluczowym jest ,,as long as’’. Następnie jest warunek pętli, zapisany w nawiasach okrągłych. Ciało pętli zapisane jest w nawiasach klamrowych.

```
as long as (warunek){
	instr $
}
```

### Pętla for

Pętlę definiuje się poprzez słowo kluczowe ,,for”, po czym następuje sposób iterowania w nawiasach okrągłych, po kolei Liczba początkowa : Liczba końcowa : Wielkość kroku. Przykład:

```
for (0:5:2){
	instr $ 
}
```

## Funkcje 

Funkcje definiuje się przez słowo kluczowe FUNCTION, następnie podaje się nazwę, argumenty wraz z typami w nawiasach okrągłych. Typ zwracany zapisuje się następnie po dwukropku. Ciało funkcji zapisuje się w nawiasach klamrowych. Przykład:
```
FUNCTION distance(INT x, INT y):INT{
	return x + y $ 
}
```

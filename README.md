# Hexagon-Ports-Adapters-
Badanie architektury Hexagon (Ports &amp; Adapters)

Projekt jest przykładem implementacji architektury hexagonalnej w aplikacji napisanej w języku Java.

Architektura hexagonalna to sposób projektowania aplikacji, który polega na izolowaniu biznesowej logiki aplikacji od konkretnych technologii i implementacji warstw aplikacji. Główną ideą jest stworzenie rdzenia aplikacji, który jest całkowicie niezależny od innych części systemu, takich jak baza danych, interfejs użytkownika, itp.

W projekcie "Hexagon Ports Adapters" zaimplementowano tę architekturę poprzez wykorzystanie interfejsów, które oddzielają logikę biznesową od szczegółów implementacyjnych. W ten sposób aplikacja składa się z trzech głównych części:

- Wewnętrzne moduły: te moduły zawierają biznesową logikę aplikacji oraz wszystkie domenowe obiekty. Są to interfejsy (tzw. porty), które są implementowane przez adaptery.

- Adaptery: adaptery to implementacje interfejsów (portów) z wewnętrznych modułów, które odpowiadają za integrację aplikacji z konkretnymi technologiami, takimi jak baza danych, interfejs użytkownika, itp. Adaptery przekształcają dane przesyłane między wewnętrznymi modułami a zewnętrznymi systemami.

- Zewnętrzne moduły: te moduły reprezentują zewnętrzne systemy, z którymi aplikacja współpracuje. Są to implementacje portów, które są wykorzystywane przez adaptery.

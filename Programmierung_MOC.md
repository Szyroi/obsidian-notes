
### 🗺️ `Semester_1_MOC.md` – Deine zentrale Übersicht

```markdown
# 📅 Semester 1 – Übersicht

## Module
| Modul | Status | Schwerpunkt | Verknüpft mit |
|-------|--------|-------------|---------------|
| [[Programmierung 1]] | 🔴 Aktiv | Syntax, OOP, Praktikum | [[Programmierung_MOC]] |
| [[Netze]] | 🟡 Geplant | Protokolle, OSI-Modell, Sicherheit | |
| [[Technische Informatik]] | 🟢 Abgeschlossen | Hardware, Assembler, Logikgatter | [[Mathematik_MOC]] |
| [[Mathematische Grundlagen und Lineare Algebra]] | 🔴 Aktiv | Vektoren, Matrizen, Beweise | [[Mathematik/03-Algebra/Lineare_Algebra]] |

## Semesterzeitplan
```dataview
TABLE WITHOUT ID file.link AS "Aufgabe/Abgabe", due AS "Fällig am"
FROM "00-Studium/Module"
WHERE contains(tags, "semester/1") AND due
SORT due ASC
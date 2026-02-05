# 🗺️ Vault Dashboard

## 📅 Heute
- [[01-Daily/{{date:YYYY-MM-DD}}]]
- [[00-Inbox/Quick Notes]]

## 🎓 Aktuelle Studien
```dataview
TABLE course, progress
FROM "02-Study/Semesters/WS-2024-25"
WHERE file.name != "Kurs-Index.md"
SORT course
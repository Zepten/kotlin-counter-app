# CounterApp

## Описание задания

В приложении должны быть две Activity:
- Первая Activity: счетчик. Поле для отображения текущего значения, поле ввода для сколько прибавлять/убавлять от значения, две кнопки – добавить и убавить.
- Третья кнопка – переход на вторую Activity, где просто будет отображен результат из первого окна.
- Дополнительное задание на интерес: сделать так, чтобы значение с первого экрана оставалось и после переворотов экрана. Можно и чтоб после закрытия приложения.

## Прогресс

### 1 лаба

- [x] Требуемый функционал (прибавление, убавление счётчика, переход на 2-ю активность)
- [x] Кнопка возврата со 2-й активности на 1-ю
- [x] Передача значения счётчика в `textView` во 2-ю активность из 1-й с помощью `putExtra`
- [x] Обработка некорректного ввода в `stepEditText` (проверки на пустой ввод и на ввод символов кроме цифр)

### 2 лаба

- [x] Ресурсы строк и их переводы на русский
- [x] Сохранение состояния в `valueTextView` после переворота экрана с помощью `onSaveInstanceState` и `onRestoreInstanceState`
- [ ] Логика перенесена на ViewModel
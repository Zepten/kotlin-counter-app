# CounterApp

## Описание задания

В приложении должны быть две Activity:

- Первая Activity: счетчик. Поле для отображения текущего значения, поле ввода для сколько прибавлять/убавлять от значения, две кнопки – добавить и убавить.
- Третья кнопка – переход на вторую Activity, где просто будет отображен результат из первого окна.
- Дополнительное задание на интерес: сделать так, чтобы значение с первого экрана оставалось и после переворотов экрана. Можно и чтоб после закрытия приложения.

## Прогресс

- [x] Сделать 1-ю активность со счётчиком
- [x] Реализовать функционал (прибавление, убавление счётчика)
- [x] Сделать 2-ю активность
- [x] Запустить 2-ю активность из 1-й при помощи `Intent`
- [x] Передать в `textView` на 2-й активности данные с 1-й с помощью `putExtra`
- [x] Сохранение состояния в `valueTextView` после переворота экрана
- [x] Кнопка возврата со 2-й активности на 1-ю
- [x] Сделать ресурсы строк и их переводы на русский
- [x] Вынести расчёты и обновление текста в отдельную функцию `updateCounterValue`
- [x] Сделать обработку некорректного ввода в `stepEditText` (пустой ввод, только цифры)
- [x] Сохранение состояния в `valueTextView` после переворота экрана с помощью `onSaveInstanceState` и `onRestoreInstanceState`
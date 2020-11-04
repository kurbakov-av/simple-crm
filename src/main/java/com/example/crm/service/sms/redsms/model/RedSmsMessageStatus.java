package com.example.crm.service.sms.redsms.model;

import com.example.crm.service.sms.StatusDescription;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RedSmsMessageStatus implements StatusDescription {
    CREATED("Ожидает отправки"),
    MODERATION("На модерации"),
    REJECT("Запрещено модерацией"),
    DELIVERED("Доставлено"),
    READ("Прочитано"),
    REPLY("Есть ответ"),
    UNDELIVERED("Не доставлено"),
    TIMEOUT("Просрочено"),
    PROGRESS("В процессе"),
    NO_MONEY("Недостаточно средств"),
    DOUBLED("Дублирование"),
    BAD_NUMBER("Неверный номер"),
    STOP_LIST("Запрещено стоп листом"),
    ROUTE_CLOSED("Направление запрещено"),
    ERROR("Ошибка");

    private final String description;
}

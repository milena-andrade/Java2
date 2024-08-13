# README

## Visão Geral

Este projeto Java é um sistema de gerenciamento de compromissos programados. Ele contém três classes principais:

1. **`Date`**: Administra datas, abrangendo validação, formatação e cálculo de dias passados no ano.
2. **`Time`**: Gerencia horários, incluindo validação e formatação.
3. **`ScheduledAppointment`**: Representa um compromisso agendado, incluindo data, hora, nome do paciente e nome do médico. Oferece funcionalidades para criar, atualizar e visualizar compromissos.

## Estrutura do Projeto

### Classe `Date`

A classe `Date` lida com a data e inclui os seguintes métodos:

- **Construtores**:
  - `Date()`: Permite que o usuário insira valores para dia, mês e ano.
  - `Date(int day, int month, int year)`: Inicializa com os valores fornecidos.
- **Métodos de configuração**:
  - `setDay(int day)`, `setMonth(int month)`, `setYear(int year)`: Define valores específicos com validação.
  - `setDay()`, `setMonth()`, `setYear()`: Permite ao usuário inserir novos valores.
- **Métodos de acesso**:
  - `getDay()`, `getMonth()`, `getYear()`: Retorna valores da data.
  - `displayFormat1()`, `displayFormat2()`: Mostra a data em formatos diferentes.
- **Métodos adicionais**:
  - `isLeapYear()`: Verifica se o ano é bissexto.
  - `daysElapsed()`: Calcula os dias passados no ano até a data fornecida.
  - `showCurrentDate()`: Exibe a data atual do sistema.

### Classe `Time`

A classe `Time` administra o horário e possui os seguintes métodos:

- **Construtores**:
  - `Time(int hour, int minute, int second)`: Inicializa com os valores fornecidos.
  - `Time()`: Inicializa com valores padrão.
- **Métodos de configuração**:
  - `setHour(int hour)`, `setMinute(int minute)`, `setSecond(int second)`: Define valores específicos com validação.
  - `setHour()`, `setMinute()`, `setSecond()`: Permite ao usuário inserir novos valores.
- **Método de acesso**:
  - `display()`: Mostra o horário no formato `HH:mm:ss`.

### Classe `ScheduledAppointment`

A classe `ScheduledAppointment` representa um compromisso com data, hora, paciente e médico:

- **Construtores**:
  - `ScheduledAppointment()`: Permite ao usuário inserir valores para todos os atributos.
  - `ScheduledAppointment(int hour, int minute, int second, int day, int month, int year, String patient, String doctor)`: Inicializa com os valores fornecidos.
  - `ScheduledAppointment(Date date, Time time, String patient, String doctor)`: Inicializa com objetos `Date` e `Time`.
- **Métodos de configuração**:
  - `setDate(int day, int month, int year)`, `setDate()`: Define ou altera a data.
  - `setTime(int hour, int minute, int second)`, `setTime()`: Define ou altera o horário.
  - `setPatientName(String patient)`, `setPatientName()`: Define ou altera o nome do paciente.
  - `setDoctorName(String doctor)`, `setDoctorName()`: Define ou altera o nome do médico.
- **Métodos de acesso**:
  - `getDate()`, `getTime()`, `getPatientName()`, `getDoctorName()`: Retorna os valores dos atributos.
  - `getTotalAppointments()`: Retorna o número total de compromissos agendados.

## Instruções de Uso

1. **Criação de Instâncias**: O programa cria um objeto `ScheduledAppointment` com valores padrão e permite ao usuário modificar e visualizar os detalhes.
2. **Execução**: A classe `Main` realiza operações de criação, modificação e exibição de objetos `ScheduledAppointment`, gravando o resultado em um arquivo `result.txt`.

## Compilação e Execução

Para compilar e executar o projeto, utilize os seguintes comandos:

```bash
javac Date.java Time.java ScheduledAppointment.java Main.java
java Main
```

O resultado será exibido no console e salvo em um arquivo chamado `result.txt`.

## Participantes

- Milena Costa de Andrade - CB3027171

---
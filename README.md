
# Pass-in project in Java with Springboot

A study project using Java with the Spring Boot framework to create events, participate in the event, event details, participant details, and participant badge.
## Running locally

Clone the project

```bash
  git clone https://github.com/gabsato/pass-in-java
```

Use some API testing software like Postman or Insomnia (I currently use this one):
https://insomnia.rest/download

Open the project in your preferred IDE, I currently used IntelliJ IDEA:
https://www.jetbrains.com/idea/download/?section=windows

After opening the project, start the ‘PassInApplication’ class.



![Detailed screenshot of the class that should be started 'PassInApplication'](https://github.com/gabsato/pass-in-java/assets/89858009/4197a904-717d-431a-ba10-82ca89378c76)


Now it’s just testing. I’m using Insomnia to test the APIs.

![API's in Insomnia](https://github.com/gabsato/pass-in-java/assets/89858009/c3daff57-5e39-40f4-be0e-3bf62cd7bf8d)
## About the APIs

POST Create event 
```
http://localhost:8080/events
```
```
{
	"title": "Teste evento",
		"details": "Testando criação de evento",
	"maximumAttendees": 10
}
```

GET Event detail - http://localhost:8080/events/{eventId}
```
http://localhost:8080/events/d5c24c9b-e1b0-45c9-87db-57a814d25a6f
```

POST Create attendee - http://localhost:8080/events/{eventId}/attendees
```
http://localhost:8080/events/d5c24c9b-e1b0-45c9-87db-57a814d25a6f/attendees
```

GET Event attendees - http://localhost:8080/events/attendees/{eventId}
```
http://localhost:8080/events/attendees/d5c24c9b-e1b0-45c9-87db-57a814d25a6f
```

GET Badge check - http://localhost:8080/attendees/{attendeeId}/badge
```
http://localhost:8080/attendees/608d8373-ef98-48a9-887c-ed69ad6939c5/badge
```

POST Check-in - http://localhost:8080/attendees/{attendeeId}/check-in
```
http://localhost:8080/attendees/608d8373-ef98-48a9-887c-ed69ad6939c5/check-in
```

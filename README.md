# Microservices
Tere are 3 microservices that communicate with each other:\
To start the produser restfull API, please enter next url:\
http://localhost:10091/action/create (or change application.properties settings)\
Please send  POST request at the next format:\
{\
	"action":"Reverse",\
	"source":"aaa",\
	"dest":"bbb",\
	"date":"12/11/20"\
}\
After data gets RabbitMQ - action-create-queue (or change application.properties settings)\
Consumer MS reads the data.\
Then it starts third MS  - save to table\
I use mySQL D.B\

spring.jpa.hibernate.ddl-auto=none\
spring.datasource.url=jdbc:mysql://localhost:3306/FilesDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC\
spring.datasource.username=myuser\
spring.datasource.password=xxxx\

FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD my-deep-down-dark-secret

COPY data/migration.sql /docker-entrypoint-initdb.d/init.sql

EXPOSE 3306
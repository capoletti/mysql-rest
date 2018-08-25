# mysql-rest
exemplo spring boot consumindo banco de dados mysql

# build container docker
docker build -t mysql-rest .

#run container docker
docker run -p 5000:8080 mysql-rest

#run mysql container
sudo docker run --name=mysql -e MYSQL_ROOT_PASSWORD=senha -d mysql
sudo docker exec -it mysql bash
mysql -u root -psenha
ALTER USER root IDENTIFIED WITH mysql_native_password BY 'senha';

#run phpmyadmin 
sudo docker run --name myadmin -d --env="PMA_ARBITRARY=1" --link mysql:db -p 8080:80 phpmyadmin/phpmyadmin

#Como instalar o Laravel no Ubuntu

##Instalando o Composer

```
curl -sS https://getcomposer.org/installer | php
sudo mv composer.phar /usr/local/bin/composer
```
##Criando projeto Laravel

```
cd localhost
sudo composer create-project laravel/laravel nomeDoArquivo --prefer-dist
sudo chmod -R 777 work
```

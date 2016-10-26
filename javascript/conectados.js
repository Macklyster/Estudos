$(function(){
    /*
     * Código feito por Alex Morgado.
     * Código feito para a plataforma Forum 
     * Versão: PUNBB
     */
     if(_userdata.session_logged_in == true){
        //Adicionando o css dentro do head, que personaliza o tamanho e a posição de cada avatar
        $('head').append(
           '<style type="text/css">'+
           '.avatar{'+
           'position: absolute;'+
           '}'+
           '.avatar img{'+
           'width: 33px;'+
           'height: 30px;'+
           'margin-left: 20px;'+
           '}'+
           '</style>'
           );
        //fim CSS
           $('#onlinelist  a[href^="/u"]').each(function(){//Trabalhar individualmente com cada link de usuário
            var $this = $(this); //Criando o this em uma variavel, para facilitar na hora de usa-lo
            var link = $(this).attr('href');//Pegando o link do usuário e guardando dentro da variavel link
            var $title = $(this).text(); //pegando o title do nome do usuário, para quando passar o mouse em cima do avatar apareça também o nome.
            $.get(link, function(e){//Indo para o link do usuário
            var $avt = $('#profile-advanced-right .main-content img', e).attr('src');//Pegando o link do avatar do membro e guardando na váriavel avt
            $this.replaceWith('<span class="avatarOnl" style="display: inline-block;position: relative;"><a href="'+link+'"><img src="'+$avt+'" title="'+$title+'" style="float:none;height:45px;width:45px;"/></a></span>');//Substituindo a tag "a" pelo elemento com o avatar do membro e o title...
            
        });  
        });
       }     
   });
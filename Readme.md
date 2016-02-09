// Guia linux audio
http://wiki.linuxaudio.org/wiki/raspberrypi

Sobre JACK
http://libremusicproduction.com/articles/demystifying-jack-%E2%80%93-beginners-guide-getting-started-jack

Guia para utilizar guitarix
http://libremusicproduction.com/articles/ultimate-guide-getting-started-guitarix

Guia para utilizar um Zoom Pedal
https://linuxmusicians.com/viewtopic.php?f=19&t=14859

Matar jackd
killall -9 jackd

Usar placa de audio no raspberry
http://computers.tutsplus.com/articles/using-a-usb-audio-device-with-a-raspberry-pi--mac-55876

Efeitos
http://lv2plug.in/pages/projects.html

++++++++++++++++++++++++++++++++++++++++++++
```
///////////////////////////////////
// JACK
///////////////////////////////////
// Instalar jack
// aparentemente, já vem com

// Instalar lv2 plugins
sudo apt-get install lilv-utils

// Instalar interface gráfica - eu acho
sudoapt-get install jalv


///////////////////////////////////
// Instalar Mod-host
///////////////////////////////////
sudo apt-get install libjack-jackd2-dev
sudo apt-get install liblilv-dev
sudo apt-get install libreadline-dev
git clone https://github.com/moddevices/mod-host.git & cd mod-host & make

///////////////////////////////////
///////////////////////////////////

// Iniciar para Zoom
jackd -P70 -p16 -t2000 -dalsa -dhw:Series -p128 -n3 -r44100 -s &

// Abrir IDE
qjackctl

// Terminar tudo
killall -9 jackd


// Guitarix
sudo apt-get install guitarix

// Instalando um host para lv2 plugins
git clone https://github.com/moddevices/mod-host.git

// atualizando node.js no debian
// Baixar o nvm => https://github.com/creationix/nvm
// Reiniciar raspberry
nvm install v5.5
// usar o node correto
nvm use v5.5
```

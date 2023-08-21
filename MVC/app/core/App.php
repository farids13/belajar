<?php 

class App {

    protected $controller = 'Home',
            $method = 'index',
            $params = []; 

    public function __construct()
    {
        // controller url
        $url = $this->parseURL();
        if ($url == NULL){
           $url = [$this->controller];

        }
        if ( file_exists('../app/controllers/' . $url[0] .'.php' ))  {
            $this->controller = $url[0];
            unset($url[0]); // untuk menghilangkan sebuah array yang dipilih
        }
        require_once '../app/controllers/' . $this->controller .'.php'; // kenapa pake this karena ini fungsi jadi harus panggil this untuk menggunakan variabel controller
        $this->controller = new $this->controller;
    
        //method url
        if( isset($url[1])){
            if( method_exists($this->controller,$url[1])) {
                $this->method = $url[1];
                unset($url[1]);
            }
        }
        //parameter url
        if (!empty($url)){
            $this->params = array_values($url); // masukkan di variable params
        }
        // jalankan controller $method, serta kirimkan params

        call_user_func_array([$this->controller, $this->method], $this->params);
    }
    
    
    public function parseURL(){
        // pertama kita cek dan parsing data dari Get URL 
        if( isset($_GET['url']) ) { // kenapa dalemnya get url, ya karena yang ingin di parsing datanya sebuah get
                // yang diawali dengan url contoh di url www.google.com?url=123
                // dari contoh diatas maka yang di ambil adalah 123 nya
                // paham kan
            $url = rtrim($_GET['url'], '/'); // rtrim untuk menghapus nilai pada sebuah array dengan nilai yang ditentikan
            $url = filter_var($url, FILTER_SANITIZE_URL); // mmebersihakn url untuk hacking
            $url = explode('/', $url);// urlnya pecah pake explode dengan delimiternya /
            return $url;
        }
    }
}
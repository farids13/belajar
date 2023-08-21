<?php 

class Controller {
    public function view($view) 
    {
        require_once '../app/views/' . $view . '.php';
    }

    public function model($model){
        require_once '../app/models/' . $model . '.php'; // karena model ini kelas maka harus instansiasi
        return new $model;
    }
}
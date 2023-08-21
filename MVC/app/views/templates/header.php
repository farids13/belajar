<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><?= $data['judul']; ?></title>
</head>
<link rel="stylesheet" href="<?php echo BASEURL; ?>/public/css/bootstrap.css">
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container"> 
        <div class="container-fluid">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="<?= BASEURL; ?>/public/">PHP MVC</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<?= BASEURL; ?>/public">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<?= BASEURL; ?>/public/mahasiswa">Mahasiswa</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="<?= BASEURL; ?>/public/About" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                     About
                    </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <li><a class="dropdown-item" href="<?= BASEURL; ?>/public/About">About Me</a></li>
                    <li><a class="dropdown-item" href="<?= BASEURL; ?>/public/About/Page">Page</a></li>
                </ul>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
            </div>
        </div>
    </div>
</nav>
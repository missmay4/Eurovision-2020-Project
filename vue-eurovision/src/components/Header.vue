<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button
      class="navbar-toggler"
      type="button"
      data-toggle="collapse"
      data-target="#navbarTogglerDemo01"
      aria-controls="navbarTogglerDemo01"
      aria-expanded="false"
      aria-label="Toggle navigation"
    >
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
      <router-link class="navbar-brand" to="/">
        <img src="../assets/EuroFlags/EuroNL.png" width="30" height="30" alt />
        Eurovision 2020
      </router-link>
      <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
        <li class="nav-item active">
          <router-link class="nav-link" to="/about">Festival</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/rotterdam"
            >Rotterdam 2020</router-link
          >
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/singers"
            >Participantes</router-link
          >
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/votes">Votos</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/moreVoted"
            >Nuestro ranking</router-link
          >
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/favorites">Favoritos</router-link>
        </li>
      </ul>
      <span class="navbar-text mr-2"
        ><a href="https://github.com/missmay4/Eurovision-2020-Project">
          <i class="fa fa-github fa-lg" aria-hidden="true"></i>
        </a>
      </span>
      <span class="navbar-text">
        <a
          href="https://open.spotify.com/playlist/2GAHVbzeg2z6p5roXVayDe?si=XwW_VGJ4Q6-vP6EaMfynog"
        >
          <i class="fa fa-spotify fa-lg" aria-hidden="true"></i>
        </a>
      </span>
    </div>
  </nav>
</template>

<style scoped></style>

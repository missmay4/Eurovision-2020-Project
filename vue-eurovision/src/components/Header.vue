<template>
  <header class="navbar">
    <router-link class="navbar-brand" to="/">
      <img src="../assets/EuroFlags/EuroNL.png" width="30" height="30" alt /> Eurovision 2020
    </router-link>
    <div class="navbar-nav-scroll">
      <ul class="navbar-nav bd-navbar-nav flex-row">
        <li class="nav-item">
          <router-link to="/about">Festival</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/rotterdam">Rotterdam 2020</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/singers">Participants</router-link>
        </li>
        <!-- <li class="nav-item">
            <router-link to="/listCountryVote">Votaciones</router-link>
        </li>-->

        <li class="nav-item">
          <router-link to="/votes">Votes</router-link>
        </li>
      </ul>
    </div>
    <ul class="navbar-nav flex-row ml-md-auto d-none d-md-flex">
      <li class="nav-item">
        <a href="https://github.com/missmay4/Eurovision-2020-Project">
          <i class="fa fa-github fa-lg" aria-hidden="true"></i>
        </a>
      </li>
      <li class="nav-item">
        <a
          href="https://open.spotify.com/playlist/2GAHVbzeg2z6p5roXVayDe?si=XwW_VGJ4Q6-vP6EaMfynog"
        >
          <i class="fa fa-spotify fa-lg" aria-hidden="true"></i>
        </a>
      </li>
      <li class="nav-item">
        <a href="https://twitter.com/deathscythe_4">
          <i class="fa fa-twitter fa-lg" aria-hidden="true"></i>
        </a>
      </li>
    </ul>
  </header>
</template>

<style>
</style>

<template>
  <tr>
    <th scope="row" class="username">{{ usuario.name }}</th>
    <th scope="row" v-if="usuario.votos[0].participant.gala.gala_id ==3">Final</th>
    <th scope="row" v-else>Semifinal</th> 
   
    <th scope="row">
      <img class="flags" :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.votos[0].participant.country.code +
              '.png'
          )
        " :alt="'Euro' + usuario.votos[0].participant.country.code" />
      <p class="countryName">{{ usuario.votos[0].participant.country.name }}</p>
    </th>
    <th scope="row">
      <img class="flags" :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.votos[1].participant.country.code +
              '.png'
          )
        " :alt="'Euro' + usuario.votos[1].participant.country.code" />
      <p class="countryName">{{ usuario.votos[1].participant.country.name }}</p>
    </th>
    <th scope="row">
      <img class="flags" :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.votos[2].participant.country.code +
              '.png'
          )
        " :alt="'Euro' + usuario.votos[2].participant.country.code" />
      <p class="countryName">{{ usuario.votos[2].participant.country.name }}</p>
    </th>
  </tr>
</template>

<script>
  export default {
    name: "FinalVotes",
    props: {
      usuario: Object,
      participant: Object,
    },
    methods: {
      loadImage(imageName) {
        return require("../assets/" + imageName);
      },
    },
  };
</script>

<style>
  .countryName {
    display: inline-block;
    margin-left: 10px;
  }

  .username {
    color: #273b75;
  }

  th {
    background-color: #ffffff;
  }
</style>
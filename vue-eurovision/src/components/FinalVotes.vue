<template>
  <tr>
    <th scope="row" class="nombreUser">{{usuario.name}}</th>
    <th scope="row">
      <img
        class="flags"
        :src="loadImage('EuroFlags/Euro' + usuario.votos[0].participant.country.code + '.png')"
        :alt="'Euro' + usuario.votos[0].participant.country.code"
      >
      <p class="nombrePais">{{usuario.votos[0].participant.country.name}}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="loadImage('EuroFlags/Euro' + usuario.votos[1].participant.country.code + '.png')"
        :alt="'Euro' + usuario.votos[1].participant.country.code"
      >
      <p class="nombrePais">{{usuario.votos[1].participant.country.name}}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="loadImage('EuroFlags/Euro' + usuario.votos[2].participant.country.code + '.png')"
        :alt="'Euro' + usuario.votos[2].participant.country.code"
      >
      <p class="nombrePais">{{usuario.votos[2].participant.country.name}}</p>
    </th>
  </tr>
</template>

<script>
export default {
  name: "VotosFinales",
  props: {
    usuario: Object,
    participant: Object
  },
  methods: {
    loadImage(imageName) {
      return require("../assets/" + imageName);
    }
  }
};
</script>

<style>
.nombrePais {
  display: inline-block;
  margin-left: 10px;
}

.nombreUser {
  color: #273b75;
}

th {
  background-color: #ffffff;
}
</style>
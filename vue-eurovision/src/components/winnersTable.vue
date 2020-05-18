<template>
  <tr>
    <th scope="row">
      <!-- <img class="flags" :src="loadImage('EuroFlags/Euro' + code + '.png')" :alt="'Euro' + code" /> -->
      <p class="nombrePais">{{name}}</p>
    </th>
    <!-- <th scope="row">{{vote}}</th> -->
    <!-- Numero de veces que se repite el voto -->
  </tr>
</template>

<script>
export default {
  name: "VotosFinales",
  props: {
    /*usuario: Object,
    participant: Object, */
    name: String
    //vote: Number
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

th {
  background-color: #ffffff;
}
</style>
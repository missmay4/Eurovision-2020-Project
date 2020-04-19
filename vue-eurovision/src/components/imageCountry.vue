<template>
  <div>
    <!-- <div class="col-md-4">
      <img
        class="flags"
        :src="loadImage('EuroFlags/Euro' + participant.country.code + '.png')"
        :alt="'Euro' + participant.country.code"
      >
    </div>
    <div class="col-md-8">
      <label class="form-check-label nombrePais">{{participant.country.name}}</label>
    </div>-->
    <div class="col-md-12">
      <img
        class="flags"
        :src="loadImage('EuroFlags/Euro' + participant.country.code + '.png')"
        :alt="'Euro' + participant.country.code"
      >
      <p class="nombrePais">{{participant.country.name}}</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "imageCountry",
  props: {
    name: String,
    participant: Object
  },
  methods: {
    loadImage(imageName) {
      return require("../assets/" + imageName);
    }
  }
};
</script>

<style scoped>
.nombrePais {
  display: inline-block;
  margin-left: 10px;
}
</style>
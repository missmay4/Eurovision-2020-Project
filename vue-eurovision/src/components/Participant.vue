<template>
  <div class="col-lg-3 col-md-4 col-sm-6">
    <div class="card">
      <img :src="loadImage('EuroSingers/' + countryCode + '.jpg')" class="card-img-top" :alt="name">
      <div class="card-body noPadding">
        <div class="artistCountry">
          <div class="artistFlag">
            <img
              class="flags"
              :src="loadImage('EuroFlags/Euro' + countryCode + '.png')"
              :alt="'Euro' + countryCode"
            >
          </div>
          <div class="artistTitle">
            <h5 class="card-title cardMargin noMargin">
              <b>{{country}}</b>
            </h5>
          </div>
        </div>
        <h6 class="card-title cardFont noMargin">{{name}}</h6>
        <a :href="songLink" class="card-title">Escucha su canción</a>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Participant",
  methods: {
    loadImage(imageName) {
      return require("../assets/" + imageName);
    }
  },
  props: {
    name: String,
    country: String,
    countryCode: String,
    songLink: String
  }
};
</script>

<style scoped>
.cardFont {
  font-size: 13px;
}

.cardMargin {
  margin-top: 3%;
}

.noMargin {
  margin-bottom: 2px !important;
}

.noPadding {
  padding-bottom: 6px !important;
}
</style>

<template id="favoriteCard">
  <div class="col-lg-6 col-md-4 col-sm-6">
    <div class="card text-align">
      <div class="card-body">
        <table class="table">
          <tr scope="row">
            <th>
              <h5 class="card-title ">Usuario</h5>
            </th>
            <th>
              <h5 class="card-title ">País</h5>
            </th>
          </tr>
          <tr scope="row">
            <th>
              <p class="card-title nombreUser">{{ usuario.username }}</p>
            </th>
            <th>
              <p class="card-title">
                <img
                  class="flags"
                  :src="loadImage('EuroFlags/Euro' + usuario.country + '.png')"
                  :alt="'Euro' + usuario.country"
                />
              </p>
            </th>
          </tr>
          <tr>
            <th scope="row">
              <img
                class="flags"
                :src="
                  loadImage(
                    'EuroFlags/Euro' +
                      usuario.favorites[0].participant.country.code +
                      '.png'
                  )
                "
                :alt="'Euro' + usuario.favorites[0].participant.country.code"
              />
              <p class="nombrePais">
                {{ usuario.favorites[0].participant.country.name }}
              </p>
            </th>
            <th scope="row">
              <img
                class="flags"
                :src="
                  loadImage(
                    'EuroFlags/Euro' +
                      usuario.favorites[1].participant.country.code +
                      '.png'
                  )
                "
                :alt="'Euro' + usuario.favorites[1].participant.country.code"
              />
              <p class="nombrePais">
                {{ usuario.favorites[1].participant.country.name }}
              </p>
            </th>
          </tr>
          <tr>
            <th scope="row">
              <img
                class="flags"
                :src="
                  loadImage(
                    'EuroFlags/Euro' +
                      usuario.favorites[2].participant.country.code +
                      '.png'
                  )
                "
                :alt="'Euro' + usuario.favorites[2].participant.country.code"
              />
              <p class="nombrePais">
                {{ usuario.favorites[2].participant.country.name }}
              </p>
            </th>
            <th scope="row">
              <img
                class="flags"
                :src="
                  loadImage(
                    'EuroFlags/Euro' +
                      usuario.favorites[3].participant.country.code +
                      '.png'
                  )
                "
                :alt="'Euro' + usuario.favorites[3].participant.country.code"
              />
              <p class="nombrePais">
                {{ usuario.favorites[3].participant.country.name }}
              </p>
            </th>
          </tr>
          <tr>
            <th scope="row">
              <img
                class="flags"
                :src="
                  loadImage(
                    'EuroFlags/Euro' +
                      usuario.favorites[4].participant.country.code +
                      '.png'
                  )
                "
                :alt="'Euro' + usuario.favorites[4].participant.country.code"
              />
              <p class="nombrePais">
                {{ usuario.favorites[4].participant.country.name }}
              </p>
            </th>
            <th scope="row">
              <img
                class="flags"
                :src="
                  loadImage(
                    'EuroFlags/Euro' +
                      usuario.favorites[5].participant.country.code +
                      '.png'
                  )
                "
                :alt="'Euro' + usuario.favorites[5].participant.country.code"
              />
              <p class="nombrePais">
                {{ usuario.favorites[5].participant.country.name }}
              </p>
            </th>
          </tr>
          <tr>
            <th scope="row">
              <img
                class="flags"
                :src="
                  loadImage(
                    'EuroFlags/Euro' +
                      usuario.favorites[6].participant.country.code +
                      '.png'
                  )
                "
                :alt="'Euro' + usuario.favorites[6].participant.country.code"
              />
              <p class="nombrePais">
                {{ usuario.favorites[6].participant.country.name }}
              </p>
            </th>
            <th scope="row">
              <img
                class="flags"
                :src="
                  loadImage(
                    'EuroFlags/Euro' +
                      usuario.favorites[7].participant.country.code +
                      '.png'
                  )
                "
                :alt="'Euro' + usuario.favorites[7].participant.country.code"
              />
              <p class="nombrePais">
                {{ usuario.favorites[7].participant.country.name }}
              </p>
            </th>
          </tr>
          <tr>
            <th scope="row">
              <img
                class="flags"
                :src="
                  loadImage(
                    'EuroFlags/Euro' +
                      usuario.favorites[8].participant.country.code +
                      '.png'
                  )
                "
                :alt="'Euro' + usuario.favorites[8].participant.country.code"
              />
              <p class="nombrePais">
                {{ usuario.favorites[8].participant.country.name }}
              </p>
            </th>
            <th scope="row">
              <img
                class="flags"
                :src="
                  loadImage(
                    'EuroFlags/Euro' +
                      usuario.favorites[9].participant.country.code +
                      '.png'
                  )
                "
                :alt="'Euro' + usuario.favorites[9].participant.country.code"
              />
              <p class="nombrePais">
                {{ usuario.favorites[9].participant.country.name }}
              </p>
            </th>
          </tr>
        </table>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "UserFavorites",
  props: {
    usuario: Object,
  },
  methods: {
    loadImage(imageName) {
      return require("../assets/" + imageName);
    },
  },
};
</script>

<style>
.nombrePais {
  display: inline-block;
  margin-left: 10px;
}

.nombreUser {
  color: #273b75;
  padding-top: 1em;
  font-size: 1.5em;
}

th {
  background-color: #ffffff;
}
</style>

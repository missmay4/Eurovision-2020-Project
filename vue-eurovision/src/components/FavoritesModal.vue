<template>
  <div class="modal fade bd-example-modal-sm">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <h6 class="modal-title">Tus favoritos</h6>
        </div>
        <div class="modal-body">
          <!-- Favoritos  -->
          <imageCountry
            v-for="participant in participants.filter((participant) => {
              return selectedParticipants.indexOf(participant.id) !== -1;
            })"
            :participant="participant"
            v-bind:key="participant.id"
          />
          <form action>
            <div class="form-group row">
              <div class="col-sm-12">
                <input
                  type="name"
                  class="marg"
                  required
                  v-bind:class="{ 'form-control': true, 'is-invalid': !valido }"
                  placeholder="Introduce tu nombre"
                  v-model="username"
                />
                <div class="invalid-feedback">
                  Este usuario ya ha guardado favoritos
                </div>
              </div>
            </div>
            <div class="form-group row">
              <div class="col-sm-12">
                <label for="country">Selecciona tu país</label>
                <select
                  id="country"
                  name="country"
                  class="form-control"
                  required
                  v-model="country"
                >
                  <option value="AL">Albania</option>
                  <option value="DE">Alemania</option>
                  <option value="AM">Armenia</option>
                  <option value="AU">Australia</option>
                  <option value="AT">Austria</option>
                  <option value="AZ">Azerbaiyán</option>
                  <option value="BE">Bélgica</option>
                  <option value="BY">Bielorrusia</option>
                  <option value="BG">Bulgaria</option>
                  <option value="CY">Chipre</option>
                  <option value="HR">Croacia</option>
                  <option value="DK">Dinamarca</option>
                  <option value="SI">Eslovenia</option>
                  <option value="ES">España</option>
                  <option value="EE">Estonia</option>
                  <option value="FI">Finlandia</option>
                  <option value="FR">Francia</option>
                  <option value="GE">Georgia</option>
                  <option value="GR">Grecia</option>
                  <option value="HU">Hungría</option>
                  <option value="IE">Irlanda</option>
                  <option value="IS">Islandia</option>
                  <option value="IL">Israel</option>
                  <option value="IT">Italia</option>
                  <option value="LV">Letonia</option>
                  <option value="LT">Lituania</option>
                  <option value="MK">Macedonia del Norte</option>
                  <option value="MD">Malta</option>
                  <option value="MD">Moldavia</option>
                  <option value="ME">Montenegro</option>
                  <option value="NO">Noruega</option>
                  <option value="NL">Países Bajos</option>
                  <option value="PL">Polonia</option>
                  <option value="PT">Portugal</option>
                  <option value="GB">Reino Unido</option>
                  <option value="CZ">República Checa</option>
                  <option value="RO">Rumania</option>
                  <option value="RU">Rusia</option>
                  <option value="SM">San Marino</option>
                  <option value="RS">Serbia</option>
                  <option value="SE">Suecia</option>
                  <option value="CH">Suiza</option>
                  <option value="UA">Ucrania</option>
                </select>
              </div>
            </div>
          </form>
        </div>
        <div class="modal-footer">
          <button
            @click="favorites()"
            class="btn btn-primary"
            data-dismiss="modal"
          >
            Guardar favoritos
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import imageCountry from "@/components/imageCountry.vue";
import axios from "axios";

export default {
  name: "FavoritesModal",
  props: {
    selectedParticipants: Array,
    participants: Array,
  },
  data() {
    return {
      username: "",
      country: "",
      valido: true,
    };
  },
  methods: {
    favorites: function() {
      let form_user = new FormData();
      form_user.append("username", this.username);
      form_user.append("country", this.country);

      let form_votes = new FormData();
      form_votes.append("favorite1", this.selectedParticipants[0]);
      form_votes.append("favorite2", this.selectedParticipants[1]);
      form_votes.append("favorite3", this.selectedParticipants[2]);
      form_votes.append("favorite4", this.selectedParticipants[3]);
      form_votes.append("favorite5", this.selectedParticipants[4]);
      form_votes.append("favorite6", this.selectedParticipants[5]);
      form_votes.append("favorite7", this.selectedParticipants[6]);
      form_votes.append("favorite8", this.selectedParticipants[7]);
      form_votes.append("favorite9", this.selectedParticipants[8]);
      form_votes.append("favorite10", this.selectedParticipants[9]);

      axios({
        method: "post",
        headers: {
          "Content-Type": "multipart/form-data",
        },
        url: "http://localhost:8080/user_favorites/",
        data: form_user,
      })
        .then((response) => {
          axios({
            method: "post",
            headers: {
              "Content-Type": "multipart/form-data",
            },
            url:
              "http://localhost:8080/user_favorites/" +
              response.data.id +
              "/favorites",
            data: form_votes,
          }).then((response) => {
            this.valido = true;
          });

          //console.log(response.data);
          alert(this.username + " has guardado tus favoritos");
        })
        .catch((error) => {
          // handle error
          this.valido = false;
        });
    },
  },
  components: {
    imageCountry,
  },
};
</script>

<style scoped>
.marg {
  margin-top: 10px;
}
</style>

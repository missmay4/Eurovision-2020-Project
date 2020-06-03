<template>
  <div class="modal fade bd-example-modal-sm">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <h6 class="modal-title">Your favorites</h6>
        </div>
        <div class="modal-body">
          <!-- Votos  -->
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
                  placeholder="Your name"
                  v-model="username"
                />
                <div class="invalid-feedback">This user already exists</div>
              </div>
            </div>
            <div class="form-group row">
              <div class="col-sm-12">
                <label for="country">Select your country</label>
                <select
                  id="country"
                  name="country"
                  class="form-control"
                  required
                  v-model="country"
                >
                  <option value="AL">Albania</option>
                  <option value="AM">Armenia</option>
                  <option value="AU">Australia</option>
                  <option value="AT">Austria</option>
                  <option value="AZ">Azerbaijan</option>
                  <option value="BY">Belarus</option>
                  <option value="BE">Belgium</option>
                  <option value="BG">Bulgaria</option>
                  <option value="HR">Croatia</option>
                  <option value="CY">Cyprus</option>
                  <option value="CZ">Czech Republic</option>
                  <option value="DK">Denmark</option>
                  <option value="EE">Estonia</option>
                  <option value="FI">Finland</option>
                  <option value="FR">France</option>
                  <option value="GE">Georgia</option>
                  <option value="DE">Germany</option>
                  <option value="GR">Greece</option>
                  <option value="HU">Hungary</option>
                  <option value="IS">Iceland</option>
                  <option value="IE">Ireland</option>
                  <option value="IL">Israel</option>
                  <option value="IT">Italy</option>
                  <option value="LV">Latvia</option>
                  <option value="LT">Lithuania</option>
                  <option value="MK"
                    >Macedonia, The Former Yugoslav Republic of</option
                  >
                  <option value="MD">Moldova, Republic of</option>
                  <option value="ME">Montenegro</option>
                  <option value="NL">Netherlands</option>
                  <option value="NO">Norway</option>
                  <option value="PL">Poland</option>
                  <option value="PT">Portugal</option>
                  <option value="RO">Romania</option>
                  <option value="RU">Russian Federation</option>
                  <option value="SM">San Marino</option>
                  <option value="RS">Serbia</option>
                  <option value="SI">Slovenia</option>
                  <option value="ES">Spain</option>
                  <option value="SE">Sweden</option>
                  <option value="CH">Switzerland</option>
                  <option value="UA">Ukraine</option>
                  <option value="GB">United Kingdom</option>
                </select>
                <!-- <input
                  type="text"
                  class="marg"
                  required
                  placeholder="Your country"
                  v-model="country"
                /> -->
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
            Save favorites!
          </button>
          <!-- <button type="button" class="btn btn-default" data-dismiss="modal">Salir</button> -->
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
      const config = {
        headers: {
          "Content-Type": "multipart/form-data",
        },
      };

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
        url: "http://localhost:8080/user_favorites/",
        data: form_user,
      })
        .then((response) => {
          axios
            .post(
              "http://localhost:8080/user_favorites/" +
                response.data.id +
                "/favorites",
              form_votes
            )
            .then((response) => {
              this.valido = true;
            });

          console.log(response.data);
          alert(this.username + " you have saved your favorites");
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

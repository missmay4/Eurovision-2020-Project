<template>
  <div class="col-md-4">
    <div class="form-check form-check-inline">
      <label class="form-check-label espaciocheck country" for="inlineCheckbox1">
        <b>{{participant.gala.performanceOrder}}.</b>
        {{participant.country.name}}
      </label>
      <input
        class="form-check-input checkear"
        type="checkbox"
        :value="participant.id"
        v-model="InternalValue"
        :disabled="disabled"
      >
    </div>
    <img
      class="flags"
      :src="loadImage('EuroFlags/Euro' + participant.country.code + '.png')"
      :alt="'Euro' + participant.country.code"
    >
  </div>
</template>

<script>
export default {
  name: "CountryVote",
  props: {
    participant: Object,
    checked: Array,
    disabled: Boolean
  },
  methods: {
    loadImage(imageName) {
      return require("../assets/" + imageName);
    }
  },
  model: {
    prop: "checked"
  },
  computed: {
    InternalValue: {
      get() {
        return this.checked;
      },
      set(v) {
        this.$emit("input", v);
      }
    }
  }
};
</script>

<style scoped>
</style>

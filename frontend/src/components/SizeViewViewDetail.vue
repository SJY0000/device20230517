<template>

    <v-card outlined>
        <v-card-title>
            SizeView # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <String label="Size" v-model="item.size" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'SizeViewViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/sizeViews/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>


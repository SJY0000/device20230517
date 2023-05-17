<template>

    <v-data-table
        :headers="headers"
        :items="sizeView"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SizeViewView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "size", value: "size" },
            ],
            sizeView : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/sizeViews'))

            temp.data._embedded.sizeViews.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.sizeView = temp.data._embedded.sizeViews;
        },
        methods: {
        }
    }
</script>


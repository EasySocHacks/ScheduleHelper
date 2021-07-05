<template>
	<div>
		<Year v-bind:year="2021"/>
	</div>
</template>

<script>
	import Year from './Year'

	export default {
		components: {
			Year
		}
	}
</script>
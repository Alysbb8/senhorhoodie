var app = new Vue({
    el: '#app',
    data: {
      title: 'Meus estados favoritos',
      message: 'Hello Vue!',
      stateName: '',
      aula: 'fala memo!',
      states: [{"id":0,"nome":"Paraná"},
      {"id":1,"nome":"Rio de Janeiro"},
      {"id":2,"nome":"Bahia"},
      {"id":3,"nome":"Santa Catarina"}]
    },
    methods: {
      setState(event){
        this.State = event.target.value
      },
      adicionarNoVetor(){
        const id = this.states.length;
        this.states.push({
          id: id,
          nome: this.stateName
      })
      },
      changeInputValue(event) {
        console.log(event)
        this.message = event.target.value;
      },
      getStates(){
        //this.states = ['parana', 'são paulo']
      }
    },
    created(){
      console.log('criou o compomente')
      this.getStates()
    }
  })
class Dog : InterfaceAnimal {
    override val legs = 4

    override fun makeNoise() {
        print("bark")
        super.makeNoise()
    }
}
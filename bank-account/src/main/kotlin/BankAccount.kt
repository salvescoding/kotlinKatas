class BankAccount {

    var accountActive: Boolean = true
        private set


    var balance: Int = 0
        get() { return if (accountActive) field else throw IllegalStateException("Account is closed") }
        private set

    @Synchronized fun adjustBalance(amount: Long) {
        synchronized(balance) {
            balance +=  when {
                amount.toInt() < 0 && balance > amount.toInt() -> amount.toInt()
                amount.toInt() > 0 -> amount.toInt()
                else -> throw IllegalStateException("Not enough funds")
            }
        }
    }


    fun close() {
        accountActive = false
    }
}

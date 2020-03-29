import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger

class BankAccount {

    private val accountActive: AtomicBoolean = AtomicBoolean(true)
    private val _balance: AtomicInteger = AtomicInteger(0)

    val balance: Int
        get() { check(accountActive.get()); return _balance.get() }

    fun adjustBalance(amount: Int) {
        check(accountActive.get())
        _balance.addAndGet(amount)
    }

    fun close() = accountActive.set(false)
}

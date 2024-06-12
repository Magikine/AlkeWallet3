package marjoriemoya.miniguamvvm

import junit.framework.TestCase.assertEquals
import marjoriemoya.miniguamvvm.model.ListUserResponse
import org.junit.Test

class ListUserResponseTest {
    @Test
    fun testListUserResponse() {
        // Crear una instancia de ListUserResponse
        val response = ListUserResponse(
            "John",
            "Doe",
            "john.doe@example.com",
            "password",
            1L,
            100L,
            null,
            200L
        )

        // Verificar los valores esperados
        assertEquals("John", response.first_name)
        assertEquals("Doe", response.last_name)
        assertEquals("john.doe@example.com", response.email)
        assertEquals("password", response.password)
        assertEquals(1L, response.roleId)
        assertEquals(100L, response.points)
        assertEquals(null, response.error)
        assertEquals(200L, response.status)
    }
}

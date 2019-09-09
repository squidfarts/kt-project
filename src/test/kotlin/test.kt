/***********************************************************************************
 *                                                                                 *
 * NAME: test.kt                                                                   *
 *                                                                                 *
 * AUTHOR: Michael Brockus.                                                        *
 *                                                                                 *
 * CONTACT: <mailto:michael@squidfarts.com>                                        *
 *                                                                                 *
 * NOTICES:                                                                        *
 *                                                                                 *
 * License: Apache 2.0 :http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                                                 *
 ***********************************************************************************/
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class ProjectTest
{
    @Test 
    fun testSimpleAssert() 
    {
        assertEquals(100, 100)
    }
}
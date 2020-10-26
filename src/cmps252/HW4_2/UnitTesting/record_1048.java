package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("29")
class Record_1048 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1048: FirstName is Louisa")
	void FirstNameOfRecord1048() {
		assertEquals("Louisa", customers.get(1047).getFirstName());
	}

	@Test
	@DisplayName("Record 1048: LastName is Cumberbatch")
	void LastNameOfRecord1048() {
		assertEquals("Cumberbatch", customers.get(1047).getLastName());
	}

	@Test
	@DisplayName("Record 1048: Company is Tanner Durso Prntng Inc")
	void CompanyOfRecord1048() {
		assertEquals("Tanner Durso Prntng Inc", customers.get(1047).getCompany());
	}

	@Test
	@DisplayName("Record 1048: Address is 25472 Base Line St")
	void AddressOfRecord1048() {
		assertEquals("25472 Base Line St", customers.get(1047).getAddress());
	}

	@Test
	@DisplayName("Record 1048: City is San Bernardino")
	void CityOfRecord1048() {
		assertEquals("San Bernardino", customers.get(1047).getCity());
	}

	@Test
	@DisplayName("Record 1048: County is San Bernardino")
	void CountyOfRecord1048() {
		assertEquals("San Bernardino", customers.get(1047).getCounty());
	}

	@Test
	@DisplayName("Record 1048: State is CA")
	void StateOfRecord1048() {
		assertEquals("CA", customers.get(1047).getState());
	}

	@Test
	@DisplayName("Record 1048: ZIP is 92410")
	void ZIPOfRecord1048() {
		assertEquals("92410", customers.get(1047).getZIP());
	}

	@Test
	@DisplayName("Record 1048: Phone is 909-884-0766")
	void PhoneOfRecord1048() {
		assertEquals("909-884-0766", customers.get(1047).getPhone());
	}

	@Test
	@DisplayName("Record 1048: Fax is 909-884-7267")
	void FaxOfRecord1048() {
		assertEquals("909-884-7267", customers.get(1047).getFax());
	}

	@Test
	@DisplayName("Record 1048: Email is louisa@cumberbatch.com")
	void EmailOfRecord1048() {
		assertEquals("louisa@cumberbatch.com", customers.get(1047).getEmail());
	}

	@Test
	@DisplayName("Record 1048: Web is http://www.louisacumberbatch.com")
	void WebOfRecord1048() {
		assertEquals("http://www.louisacumberbatch.com", customers.get(1047).getWeb());
	}
}

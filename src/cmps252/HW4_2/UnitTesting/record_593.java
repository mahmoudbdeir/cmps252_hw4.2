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

@Tag("46")
class Record_593 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 593: FirstName is Zachery")
	void FirstNameOfRecord593() {
		assertEquals("Zachery", customers.get(592).getFirstName());
	}

	@Test
	@DisplayName("Record 593: LastName is Dawley")
	void LastNameOfRecord593() {
		assertEquals("Dawley", customers.get(592).getLastName());
	}

	@Test
	@DisplayName("Record 593: Company is Bustamante, Michael Esq")
	void CompanyOfRecord593() {
		assertEquals("Bustamante, Michael Esq", customers.get(592).getCompany());
	}

	@Test
	@DisplayName("Record 593: Address is 28970 Hopkins St  #-e")
	void AddressOfRecord593() {
		assertEquals("28970 Hopkins St  #-e", customers.get(592).getAddress());
	}

	@Test
	@DisplayName("Record 593: City is Hayward")
	void CityOfRecord593() {
		assertEquals("Hayward", customers.get(592).getCity());
	}

	@Test
	@DisplayName("Record 593: County is Alameda")
	void CountyOfRecord593() {
		assertEquals("Alameda", customers.get(592).getCounty());
	}

	@Test
	@DisplayName("Record 593: State is CA")
	void StateOfRecord593() {
		assertEquals("CA", customers.get(592).getState());
	}

	@Test
	@DisplayName("Record 593: ZIP is 94545")
	void ZIPOfRecord593() {
		assertEquals("94545", customers.get(592).getZIP());
	}

	@Test
	@DisplayName("Record 593: Phone is 510-783-4144")
	void PhoneOfRecord593() {
		assertEquals("510-783-4144", customers.get(592).getPhone());
	}

	@Test
	@DisplayName("Record 593: Fax is 510-783-4667")
	void FaxOfRecord593() {
		assertEquals("510-783-4667", customers.get(592).getFax());
	}

	@Test
	@DisplayName("Record 593: Email is zachery@dawley.com")
	void EmailOfRecord593() {
		assertEquals("zachery@dawley.com", customers.get(592).getEmail());
	}

	@Test
	@DisplayName("Record 593: Web is http://www.zacherydawley.com")
	void WebOfRecord593() {
		assertEquals("http://www.zacherydawley.com", customers.get(592).getWeb());
	}
}

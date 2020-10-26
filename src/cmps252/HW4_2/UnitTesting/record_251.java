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

@Tag("19")
class Record_251 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 251: FirstName is Marisol")
	void FirstNameOfRecord251() {
		assertEquals("Marisol", customers.get(250).getFirstName());
	}

	@Test
	@DisplayName("Record 251: LastName is Desena")
	void LastNameOfRecord251() {
		assertEquals("Desena", customers.get(250).getLastName());
	}

	@Test
	@DisplayName("Record 251: Company is Donohue, Thomas J Jr")
	void CompanyOfRecord251() {
		assertEquals("Donohue, Thomas J Jr", customers.get(250).getCompany());
	}

	@Test
	@DisplayName("Record 251: Address is 5633 Dry Fork Rd")
	void AddressOfRecord251() {
		assertEquals("5633 Dry Fork Rd", customers.get(250).getAddress());
	}

	@Test
	@DisplayName("Record 251: City is Harrison")
	void CityOfRecord251() {
		assertEquals("Harrison", customers.get(250).getCity());
	}

	@Test
	@DisplayName("Record 251: County is Hamilton")
	void CountyOfRecord251() {
		assertEquals("Hamilton", customers.get(250).getCounty());
	}

	@Test
	@DisplayName("Record 251: State is OH")
	void StateOfRecord251() {
		assertEquals("OH", customers.get(250).getState());
	}

	@Test
	@DisplayName("Record 251: ZIP is 45030")
	void ZIPOfRecord251() {
		assertEquals("45030", customers.get(250).getZIP());
	}

	@Test
	@DisplayName("Record 251: Phone is 513-367-3889")
	void PhoneOfRecord251() {
		assertEquals("513-367-3889", customers.get(250).getPhone());
	}

	@Test
	@DisplayName("Record 251: Fax is 513-367-9492")
	void FaxOfRecord251() {
		assertEquals("513-367-9492", customers.get(250).getFax());
	}

	@Test
	@DisplayName("Record 251: Email is marisol@desena.com")
	void EmailOfRecord251() {
		assertEquals("marisol@desena.com", customers.get(250).getEmail());
	}

	@Test
	@DisplayName("Record 251: Web is http://www.marisoldesena.com")
	void WebOfRecord251() {
		assertEquals("http://www.marisoldesena.com", customers.get(250).getWeb());
	}
}

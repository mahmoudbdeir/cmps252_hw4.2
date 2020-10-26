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

@Tag("38")
class Record_4421 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4421: FirstName is Sydney")
	void FirstNameOfRecord4421() {
		assertEquals("Sydney", customers.get(4420).getFirstName());
	}

	@Test
	@DisplayName("Record 4421: LastName is Boneta")
	void LastNameOfRecord4421() {
		assertEquals("Boneta", customers.get(4420).getLastName());
	}

	@Test
	@DisplayName("Record 4421: Company is Mercy Home For Boys & Girls")
	void CompanyOfRecord4421() {
		assertEquals("Mercy Home For Boys & Girls", customers.get(4420).getCompany());
	}

	@Test
	@DisplayName("Record 4421: Address is 98 W 63rd")
	void AddressOfRecord4421() {
		assertEquals("98 W 63rd", customers.get(4420).getAddress());
	}

	@Test
	@DisplayName("Record 4421: City is Hinsdale")
	void CityOfRecord4421() {
		assertEquals("Hinsdale", customers.get(4420).getCity());
	}

	@Test
	@DisplayName("Record 4421: County is DuPage")
	void CountyOfRecord4421() {
		assertEquals("DuPage", customers.get(4420).getCounty());
	}

	@Test
	@DisplayName("Record 4421: State is IL")
	void StateOfRecord4421() {
		assertEquals("IL", customers.get(4420).getState());
	}

	@Test
	@DisplayName("Record 4421: ZIP is 60521")
	void ZIPOfRecord4421() {
		assertEquals("60521", customers.get(4420).getZIP());
	}

	@Test
	@DisplayName("Record 4421: Phone is 630-323-3078")
	void PhoneOfRecord4421() {
		assertEquals("630-323-3078", customers.get(4420).getPhone());
	}

	@Test
	@DisplayName("Record 4421: Fax is 630-323-5747")
	void FaxOfRecord4421() {
		assertEquals("630-323-5747", customers.get(4420).getFax());
	}

	@Test
	@DisplayName("Record 4421: Email is sydney@boneta.com")
	void EmailOfRecord4421() {
		assertEquals("sydney@boneta.com", customers.get(4420).getEmail());
	}

	@Test
	@DisplayName("Record 4421: Web is http://www.sydneyboneta.com")
	void WebOfRecord4421() {
		assertEquals("http://www.sydneyboneta.com", customers.get(4420).getWeb());
	}
}

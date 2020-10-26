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

@Tag("37")
class Record_2946 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2946: FirstName is Shane")
	void FirstNameOfRecord2946() {
		assertEquals("Shane", customers.get(2945).getFirstName());
	}

	@Test
	@DisplayName("Record 2946: LastName is Behme")
	void LastNameOfRecord2946() {
		assertEquals("Behme", customers.get(2945).getLastName());
	}

	@Test
	@DisplayName("Record 2946: Company is Perfection Manufacturing")
	void CompanyOfRecord2946() {
		assertEquals("Perfection Manufacturing", customers.get(2945).getCompany());
	}

	@Test
	@DisplayName("Record 2946: Address is 5427 Germantown Ave")
	void AddressOfRecord2946() {
		assertEquals("5427 Germantown Ave", customers.get(2945).getAddress());
	}

	@Test
	@DisplayName("Record 2946: City is Philadelphia")
	void CityOfRecord2946() {
		assertEquals("Philadelphia", customers.get(2945).getCity());
	}

	@Test
	@DisplayName("Record 2946: County is Philadelphia")
	void CountyOfRecord2946() {
		assertEquals("Philadelphia", customers.get(2945).getCounty());
	}

	@Test
	@DisplayName("Record 2946: State is PA")
	void StateOfRecord2946() {
		assertEquals("PA", customers.get(2945).getState());
	}

	@Test
	@DisplayName("Record 2946: ZIP is 19144")
	void ZIPOfRecord2946() {
		assertEquals("19144", customers.get(2945).getZIP());
	}

	@Test
	@DisplayName("Record 2946: Phone is 215-438-9982")
	void PhoneOfRecord2946() {
		assertEquals("215-438-9982", customers.get(2945).getPhone());
	}

	@Test
	@DisplayName("Record 2946: Fax is 215-438-5273")
	void FaxOfRecord2946() {
		assertEquals("215-438-5273", customers.get(2945).getFax());
	}

	@Test
	@DisplayName("Record 2946: Email is shane@behme.com")
	void EmailOfRecord2946() {
		assertEquals("shane@behme.com", customers.get(2945).getEmail());
	}

	@Test
	@DisplayName("Record 2946: Web is http://www.shanebehme.com")
	void WebOfRecord2946() {
		assertEquals("http://www.shanebehme.com", customers.get(2945).getWeb());
	}
}

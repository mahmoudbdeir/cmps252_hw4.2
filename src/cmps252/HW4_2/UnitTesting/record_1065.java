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

@Tag("13")
class Record_1065 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1065: FirstName is Marcelo")
	void FirstNameOfRecord1065() {
		assertEquals("Marcelo", customers.get(1064).getFirstName());
	}

	@Test
	@DisplayName("Record 1065: LastName is Relacion")
	void LastNameOfRecord1065() {
		assertEquals("Relacion", customers.get(1064).getLastName());
	}

	@Test
	@DisplayName("Record 1065: Company is Advantage Signs")
	void CompanyOfRecord1065() {
		assertEquals("Advantage Signs", customers.get(1064).getCompany());
	}

	@Test
	@DisplayName("Record 1065: Address is 6201 Richmond Hwy")
	void AddressOfRecord1065() {
		assertEquals("6201 Richmond Hwy", customers.get(1064).getAddress());
	}

	@Test
	@DisplayName("Record 1065: City is Alexandria")
	void CityOfRecord1065() {
		assertEquals("Alexandria", customers.get(1064).getCity());
	}

	@Test
	@DisplayName("Record 1065: County is Fairfax")
	void CountyOfRecord1065() {
		assertEquals("Fairfax", customers.get(1064).getCounty());
	}

	@Test
	@DisplayName("Record 1065: State is VA")
	void StateOfRecord1065() {
		assertEquals("VA", customers.get(1064).getState());
	}

	@Test
	@DisplayName("Record 1065: ZIP is 22303")
	void ZIPOfRecord1065() {
		assertEquals("22303", customers.get(1064).getZIP());
	}

	@Test
	@DisplayName("Record 1065: Phone is 703-768-7702")
	void PhoneOfRecord1065() {
		assertEquals("703-768-7702", customers.get(1064).getPhone());
	}

	@Test
	@DisplayName("Record 1065: Fax is 703-768-0074")
	void FaxOfRecord1065() {
		assertEquals("703-768-0074", customers.get(1064).getFax());
	}

	@Test
	@DisplayName("Record 1065: Email is marcelo@relacion.com")
	void EmailOfRecord1065() {
		assertEquals("marcelo@relacion.com", customers.get(1064).getEmail());
	}

	@Test
	@DisplayName("Record 1065: Web is http://www.marcelorelacion.com")
	void WebOfRecord1065() {
		assertEquals("http://www.marcelorelacion.com", customers.get(1064).getWeb());
	}
}

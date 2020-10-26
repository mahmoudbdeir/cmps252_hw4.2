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

@Tag("35")
class Record_602 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 602: FirstName is Larissa")
	void FirstNameOfRecord602() {
		assertEquals("Larissa", customers.get(601).getFirstName());
	}

	@Test
	@DisplayName("Record 602: LastName is Cwalinski")
	void LastNameOfRecord602() {
		assertEquals("Cwalinski", customers.get(601).getLastName());
	}

	@Test
	@DisplayName("Record 602: Company is Altherm Inc")
	void CompanyOfRecord602() {
		assertEquals("Altherm Inc", customers.get(601).getCompany());
	}

	@Test
	@DisplayName("Record 602: Address is Hwy 80 & Fox Hall Dr")
	void AddressOfRecord602() {
		assertEquals("Hwy 80 & Fox Hall Dr", customers.get(601).getAddress());
	}

	@Test
	@DisplayName("Record 602: City is Pearl")
	void CityOfRecord602() {
		assertEquals("Pearl", customers.get(601).getCity());
	}

	@Test
	@DisplayName("Record 602: County is Rankin")
	void CountyOfRecord602() {
		assertEquals("Rankin", customers.get(601).getCounty());
	}

	@Test
	@DisplayName("Record 602: State is MS")
	void StateOfRecord602() {
		assertEquals("MS", customers.get(601).getState());
	}

	@Test
	@DisplayName("Record 602: ZIP is 39208")
	void ZIPOfRecord602() {
		assertEquals("39208", customers.get(601).getZIP());
	}

	@Test
	@DisplayName("Record 602: Phone is 601-939-2076")
	void PhoneOfRecord602() {
		assertEquals("601-939-2076", customers.get(601).getPhone());
	}

	@Test
	@DisplayName("Record 602: Fax is 601-939-8443")
	void FaxOfRecord602() {
		assertEquals("601-939-8443", customers.get(601).getFax());
	}

	@Test
	@DisplayName("Record 602: Email is larissa@cwalinski.com")
	void EmailOfRecord602() {
		assertEquals("larissa@cwalinski.com", customers.get(601).getEmail());
	}

	@Test
	@DisplayName("Record 602: Web is http://www.larissacwalinski.com")
	void WebOfRecord602() {
		assertEquals("http://www.larissacwalinski.com", customers.get(601).getWeb());
	}
}

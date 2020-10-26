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

@Tag("25")
class Record_1923 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1923: FirstName is Kim")
	void FirstNameOfRecord1923() {
		assertEquals("Kim", customers.get(1922).getFirstName());
	}

	@Test
	@DisplayName("Record 1923: LastName is Kelter")
	void LastNameOfRecord1923() {
		assertEquals("Kelter", customers.get(1922).getLastName());
	}

	@Test
	@DisplayName("Record 1923: Company is Minton, Marcus D Esq")
	void CompanyOfRecord1923() {
		assertEquals("Minton, Marcus D Esq", customers.get(1922).getCompany());
	}

	@Test
	@DisplayName("Record 1923: Address is 123 Main St")
	void AddressOfRecord1923() {
		assertEquals("123 Main St", customers.get(1922).getAddress());
	}

	@Test
	@DisplayName("Record 1923: City is North Wales")
	void CityOfRecord1923() {
		assertEquals("North Wales", customers.get(1922).getCity());
	}

	@Test
	@DisplayName("Record 1923: County is Montgomery")
	void CountyOfRecord1923() {
		assertEquals("Montgomery", customers.get(1922).getCounty());
	}

	@Test
	@DisplayName("Record 1923: State is PA")
	void StateOfRecord1923() {
		assertEquals("PA", customers.get(1922).getState());
	}

	@Test
	@DisplayName("Record 1923: ZIP is 19454")
	void ZIPOfRecord1923() {
		assertEquals("19454", customers.get(1922).getZIP());
	}

	@Test
	@DisplayName("Record 1923: Phone is 215-699-7573")
	void PhoneOfRecord1923() {
		assertEquals("215-699-7573", customers.get(1922).getPhone());
	}

	@Test
	@DisplayName("Record 1923: Fax is 215-699-6383")
	void FaxOfRecord1923() {
		assertEquals("215-699-6383", customers.get(1922).getFax());
	}

	@Test
	@DisplayName("Record 1923: Email is kim@kelter.com")
	void EmailOfRecord1923() {
		assertEquals("kim@kelter.com", customers.get(1922).getEmail());
	}

	@Test
	@DisplayName("Record 1923: Web is http://www.kimkelter.com")
	void WebOfRecord1923() {
		assertEquals("http://www.kimkelter.com", customers.get(1922).getWeb());
	}
}

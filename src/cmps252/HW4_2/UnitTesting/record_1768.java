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

@Tag("41")
class Record_1768 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1768: FirstName is James")
	void FirstNameOfRecord1768() {
		assertEquals("James", customers.get(1767).getFirstName());
	}

	@Test
	@DisplayName("Record 1768: LastName is Trani")
	void LastNameOfRecord1768() {
		assertEquals("Trani", customers.get(1767).getLastName());
	}

	@Test
	@DisplayName("Record 1768: Company is Newmark Lamb Dowling")
	void CompanyOfRecord1768() {
		assertEquals("Newmark Lamb Dowling", customers.get(1767).getCompany());
	}

	@Test
	@DisplayName("Record 1768: Address is 2323 S Halsted St")
	void AddressOfRecord1768() {
		assertEquals("2323 S Halsted St", customers.get(1767).getAddress());
	}

	@Test
	@DisplayName("Record 1768: City is Chicago")
	void CityOfRecord1768() {
		assertEquals("Chicago", customers.get(1767).getCity());
	}

	@Test
	@DisplayName("Record 1768: County is Cook")
	void CountyOfRecord1768() {
		assertEquals("Cook", customers.get(1767).getCounty());
	}

	@Test
	@DisplayName("Record 1768: State is IL")
	void StateOfRecord1768() {
		assertEquals("IL", customers.get(1767).getState());
	}

	@Test
	@DisplayName("Record 1768: ZIP is 60608")
	void ZIPOfRecord1768() {
		assertEquals("60608", customers.get(1767).getZIP());
	}

	@Test
	@DisplayName("Record 1768: Phone is 312-829-7321")
	void PhoneOfRecord1768() {
		assertEquals("312-829-7321", customers.get(1767).getPhone());
	}

	@Test
	@DisplayName("Record 1768: Fax is 312-829-4804")
	void FaxOfRecord1768() {
		assertEquals("312-829-4804", customers.get(1767).getFax());
	}

	@Test
	@DisplayName("Record 1768: Email is james@trani.com")
	void EmailOfRecord1768() {
		assertEquals("james@trani.com", customers.get(1767).getEmail());
	}

	@Test
	@DisplayName("Record 1768: Web is http://www.jamestrani.com")
	void WebOfRecord1768() {
		assertEquals("http://www.jamestrani.com", customers.get(1767).getWeb());
	}
}

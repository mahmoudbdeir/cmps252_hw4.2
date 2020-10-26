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

@Tag("11")
class Record_3922 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3922: FirstName is Bruno")
	void FirstNameOfRecord3922() {
		assertEquals("Bruno", customers.get(3921).getFirstName());
	}

	@Test
	@DisplayName("Record 3922: LastName is Reph")
	void LastNameOfRecord3922() {
		assertEquals("Reph", customers.get(3921).getLastName());
	}

	@Test
	@DisplayName("Record 3922: Company is John Sparks Meml Cremation")
	void CompanyOfRecord3922() {
		assertEquals("John Sparks Meml Cremation", customers.get(3921).getCompany());
	}

	@Test
	@DisplayName("Record 3922: Address is 102 Versailles Blvd")
	void AddressOfRecord3922() {
		assertEquals("102 Versailles Blvd", customers.get(3921).getAddress());
	}

	@Test
	@DisplayName("Record 3922: City is Lafayette")
	void CityOfRecord3922() {
		assertEquals("Lafayette", customers.get(3921).getCity());
	}

	@Test
	@DisplayName("Record 3922: County is Lafayette")
	void CountyOfRecord3922() {
		assertEquals("Lafayette", customers.get(3921).getCounty());
	}

	@Test
	@DisplayName("Record 3922: State is LA")
	void StateOfRecord3922() {
		assertEquals("LA", customers.get(3921).getState());
	}

	@Test
	@DisplayName("Record 3922: ZIP is 70501")
	void ZIPOfRecord3922() {
		assertEquals("70501", customers.get(3921).getZIP());
	}

	@Test
	@DisplayName("Record 3922: Phone is 337-266-9083")
	void PhoneOfRecord3922() {
		assertEquals("337-266-9083", customers.get(3921).getPhone());
	}

	@Test
	@DisplayName("Record 3922: Fax is 337-266-4369")
	void FaxOfRecord3922() {
		assertEquals("337-266-4369", customers.get(3921).getFax());
	}

	@Test
	@DisplayName("Record 3922: Email is bruno@reph.com")
	void EmailOfRecord3922() {
		assertEquals("bruno@reph.com", customers.get(3921).getEmail());
	}

	@Test
	@DisplayName("Record 3922: Web is http://www.brunoreph.com")
	void WebOfRecord3922() {
		assertEquals("http://www.brunoreph.com", customers.get(3921).getWeb());
	}
}

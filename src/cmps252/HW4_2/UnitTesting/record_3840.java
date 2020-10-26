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

@Tag("6")
class Record_3840 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3840: FirstName is Phil")
	void FirstNameOfRecord3840() {
		assertEquals("Phil", customers.get(3839).getFirstName());
	}

	@Test
	@DisplayName("Record 3840: LastName is Peca")
	void LastNameOfRecord3840() {
		assertEquals("Peca", customers.get(3839).getLastName());
	}

	@Test
	@DisplayName("Record 3840: Company is Medical Imaging Systems Inc")
	void CompanyOfRecord3840() {
		assertEquals("Medical Imaging Systems Inc", customers.get(3839).getCompany());
	}

	@Test
	@DisplayName("Record 3840: Address is 900 E Saint Mary Blvd")
	void AddressOfRecord3840() {
		assertEquals("900 E Saint Mary Blvd", customers.get(3839).getAddress());
	}

	@Test
	@DisplayName("Record 3840: City is Lafayette")
	void CityOfRecord3840() {
		assertEquals("Lafayette", customers.get(3839).getCity());
	}

	@Test
	@DisplayName("Record 3840: County is Lafayette")
	void CountyOfRecord3840() {
		assertEquals("Lafayette", customers.get(3839).getCounty());
	}

	@Test
	@DisplayName("Record 3840: State is LA")
	void StateOfRecord3840() {
		assertEquals("LA", customers.get(3839).getState());
	}

	@Test
	@DisplayName("Record 3840: ZIP is 70503")
	void ZIPOfRecord3840() {
		assertEquals("70503", customers.get(3839).getZIP());
	}

	@Test
	@DisplayName("Record 3840: Phone is 337-252-5391")
	void PhoneOfRecord3840() {
		assertEquals("337-252-5391", customers.get(3839).getPhone());
	}

	@Test
	@DisplayName("Record 3840: Fax is 337-252-0755")
	void FaxOfRecord3840() {
		assertEquals("337-252-0755", customers.get(3839).getFax());
	}

	@Test
	@DisplayName("Record 3840: Email is phil@peca.com")
	void EmailOfRecord3840() {
		assertEquals("phil@peca.com", customers.get(3839).getEmail());
	}

	@Test
	@DisplayName("Record 3840: Web is http://www.philpeca.com")
	void WebOfRecord3840() {
		assertEquals("http://www.philpeca.com", customers.get(3839).getWeb());
	}
}

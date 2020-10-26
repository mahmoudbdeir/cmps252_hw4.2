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
class Record_840 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 840: FirstName is Marvin")
	void FirstNameOfRecord840() {
		assertEquals("Marvin", customers.get(839).getFirstName());
	}

	@Test
	@DisplayName("Record 840: LastName is Bugay")
	void LastNameOfRecord840() {
		assertEquals("Bugay", customers.get(839).getLastName());
	}

	@Test
	@DisplayName("Record 840: Company is Lapidus, Elise R Esq")
	void CompanyOfRecord840() {
		assertEquals("Lapidus, Elise R Esq", customers.get(839).getCompany());
	}

	@Test
	@DisplayName("Record 840: Address is Altamonte")
	void AddressOfRecord840() {
		assertEquals("Altamonte", customers.get(839).getAddress());
	}

	@Test
	@DisplayName("Record 840: City is Altamonte Springs")
	void CityOfRecord840() {
		assertEquals("Altamonte Springs", customers.get(839).getCity());
	}

	@Test
	@DisplayName("Record 840: County is Seminole")
	void CountyOfRecord840() {
		assertEquals("Seminole", customers.get(839).getCounty());
	}

	@Test
	@DisplayName("Record 840: State is FL")
	void StateOfRecord840() {
		assertEquals("FL", customers.get(839).getState());
	}

	@Test
	@DisplayName("Record 840: ZIP is 32701")
	void ZIPOfRecord840() {
		assertEquals("32701", customers.get(839).getZIP());
	}

	@Test
	@DisplayName("Record 840: Phone is 407-843-4985")
	void PhoneOfRecord840() {
		assertEquals("407-843-4985", customers.get(839).getPhone());
	}

	@Test
	@DisplayName("Record 840: Fax is 407-843-4373")
	void FaxOfRecord840() {
		assertEquals("407-843-4373", customers.get(839).getFax());
	}

	@Test
	@DisplayName("Record 840: Email is marvin@bugay.com")
	void EmailOfRecord840() {
		assertEquals("marvin@bugay.com", customers.get(839).getEmail());
	}

	@Test
	@DisplayName("Record 840: Web is http://www.marvinbugay.com")
	void WebOfRecord840() {
		assertEquals("http://www.marvinbugay.com", customers.get(839).getWeb());
	}
}

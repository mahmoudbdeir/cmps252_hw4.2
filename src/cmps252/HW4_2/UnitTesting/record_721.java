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

@Tag("2")
class Record_721 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 721: FirstName is Kristy")
	void FirstNameOfRecord721() {
		assertEquals("Kristy", customers.get(720).getFirstName());
	}

	@Test
	@DisplayName("Record 721: LastName is Hindes")
	void LastNameOfRecord721() {
		assertEquals("Hindes", customers.get(720).getLastName());
	}

	@Test
	@DisplayName("Record 721: Company is Total Estate Care")
	void CompanyOfRecord721() {
		assertEquals("Total Estate Care", customers.get(720).getCompany());
	}

	@Test
	@DisplayName("Record 721: Address is Box #-731")
	void AddressOfRecord721() {
		assertEquals("Box #-731", customers.get(720).getAddress());
	}

	@Test
	@DisplayName("Record 721: City is Napa")
	void CityOfRecord721() {
		assertEquals("Napa", customers.get(720).getCity());
	}

	@Test
	@DisplayName("Record 721: County is Napa")
	void CountyOfRecord721() {
		assertEquals("Napa", customers.get(720).getCounty());
	}

	@Test
	@DisplayName("Record 721: State is CA")
	void StateOfRecord721() {
		assertEquals("CA", customers.get(720).getState());
	}

	@Test
	@DisplayName("Record 721: ZIP is 94559")
	void ZIPOfRecord721() {
		assertEquals("94559", customers.get(720).getZIP());
	}

	@Test
	@DisplayName("Record 721: Phone is 707-226-6700")
	void PhoneOfRecord721() {
		assertEquals("707-226-6700", customers.get(720).getPhone());
	}

	@Test
	@DisplayName("Record 721: Fax is 707-226-4761")
	void FaxOfRecord721() {
		assertEquals("707-226-4761", customers.get(720).getFax());
	}

	@Test
	@DisplayName("Record 721: Email is kristy@hindes.com")
	void EmailOfRecord721() {
		assertEquals("kristy@hindes.com", customers.get(720).getEmail());
	}

	@Test
	@DisplayName("Record 721: Web is http://www.kristyhindes.com")
	void WebOfRecord721() {
		assertEquals("http://www.kristyhindes.com", customers.get(720).getWeb());
	}
}

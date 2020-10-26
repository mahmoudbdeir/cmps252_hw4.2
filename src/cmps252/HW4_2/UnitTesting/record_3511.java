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
class Record_3511 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3511: FirstName is Lourdes")
	void FirstNameOfRecord3511() {
		assertEquals("Lourdes", customers.get(3510).getFirstName());
	}

	@Test
	@DisplayName("Record 3511: LastName is Hoglan")
	void LastNameOfRecord3511() {
		assertEquals("Hoglan", customers.get(3510).getLastName());
	}

	@Test
	@DisplayName("Record 3511: Company is Hutchison Co P A")
	void CompanyOfRecord3511() {
		assertEquals("Hutchison Co P A", customers.get(3510).getCompany());
	}

	@Test
	@DisplayName("Record 3511: Address is 4113 Aquarium Pl")
	void AddressOfRecord3511() {
		assertEquals("4113 Aquarium Pl", customers.get(3510).getAddress());
	}

	@Test
	@DisplayName("Record 3511: City is Baltimore")
	void CityOfRecord3511() {
		assertEquals("Baltimore", customers.get(3510).getCity());
	}

	@Test
	@DisplayName("Record 3511: County is Baltimore City")
	void CountyOfRecord3511() {
		assertEquals("Baltimore City", customers.get(3510).getCounty());
	}

	@Test
	@DisplayName("Record 3511: State is MD")
	void StateOfRecord3511() {
		assertEquals("MD", customers.get(3510).getState());
	}

	@Test
	@DisplayName("Record 3511: ZIP is 21215")
	void ZIPOfRecord3511() {
		assertEquals("21215", customers.get(3510).getZIP());
	}

	@Test
	@DisplayName("Record 3511: Phone is 410-358-2477")
	void PhoneOfRecord3511() {
		assertEquals("410-358-2477", customers.get(3510).getPhone());
	}

	@Test
	@DisplayName("Record 3511: Fax is 410-358-0699")
	void FaxOfRecord3511() {
		assertEquals("410-358-0699", customers.get(3510).getFax());
	}

	@Test
	@DisplayName("Record 3511: Email is lourdes@hoglan.com")
	void EmailOfRecord3511() {
		assertEquals("lourdes@hoglan.com", customers.get(3510).getEmail());
	}

	@Test
	@DisplayName("Record 3511: Web is http://www.lourdeshoglan.com")
	void WebOfRecord3511() {
		assertEquals("http://www.lourdeshoglan.com", customers.get(3510).getWeb());
	}
}

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
class Record_1018 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1018: FirstName is Amalia")
	void FirstNameOfRecord1018() {
		assertEquals("Amalia", customers.get(1017).getFirstName());
	}

	@Test
	@DisplayName("Record 1018: LastName is Bottolene")
	void LastNameOfRecord1018() {
		assertEquals("Bottolene", customers.get(1017).getLastName());
	}

	@Test
	@DisplayName("Record 1018: Company is Phoenix Display & Pkgng Corp")
	void CompanyOfRecord1018() {
		assertEquals("Phoenix Display & Pkgng Corp", customers.get(1017).getCompany());
	}

	@Test
	@DisplayName("Record 1018: Address is 38 South St")
	void AddressOfRecord1018() {
		assertEquals("38 South St", customers.get(1017).getAddress());
	}

	@Test
	@DisplayName("Record 1018: City is Freehold")
	void CityOfRecord1018() {
		assertEquals("Freehold", customers.get(1017).getCity());
	}

	@Test
	@DisplayName("Record 1018: County is Monmouth")
	void CountyOfRecord1018() {
		assertEquals("Monmouth", customers.get(1017).getCounty());
	}

	@Test
	@DisplayName("Record 1018: State is NJ")
	void StateOfRecord1018() {
		assertEquals("NJ", customers.get(1017).getState());
	}

	@Test
	@DisplayName("Record 1018: ZIP is 7728")
	void ZIPOfRecord1018() {
		assertEquals("7728", customers.get(1017).getZIP());
	}

	@Test
	@DisplayName("Record 1018: Phone is 732-462-4808")
	void PhoneOfRecord1018() {
		assertEquals("732-462-4808", customers.get(1017).getPhone());
	}

	@Test
	@DisplayName("Record 1018: Fax is 732-462-7448")
	void FaxOfRecord1018() {
		assertEquals("732-462-7448", customers.get(1017).getFax());
	}

	@Test
	@DisplayName("Record 1018: Email is amalia@bottolene.com")
	void EmailOfRecord1018() {
		assertEquals("amalia@bottolene.com", customers.get(1017).getEmail());
	}

	@Test
	@DisplayName("Record 1018: Web is http://www.amaliabottolene.com")
	void WebOfRecord1018() {
		assertEquals("http://www.amaliabottolene.com", customers.get(1017).getWeb());
	}
}

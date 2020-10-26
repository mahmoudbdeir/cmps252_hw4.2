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

@Tag("12")
class Record_4882 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4882: FirstName is Kristy")
	void FirstNameOfRecord4882() {
		assertEquals("Kristy", customers.get(4881).getFirstName());
	}

	@Test
	@DisplayName("Record 4882: LastName is Chiara")
	void LastNameOfRecord4882() {
		assertEquals("Chiara", customers.get(4881).getLastName());
	}

	@Test
	@DisplayName("Record 4882: Company is Overhead Door Co Of Conroe")
	void CompanyOfRecord4882() {
		assertEquals("Overhead Door Co Of Conroe", customers.get(4881).getCompany());
	}

	@Test
	@DisplayName("Record 4882: Address is 155 N Dean St")
	void AddressOfRecord4882() {
		assertEquals("155 N Dean St", customers.get(4881).getAddress());
	}

	@Test
	@DisplayName("Record 4882: City is Englewood")
	void CityOfRecord4882() {
		assertEquals("Englewood", customers.get(4881).getCity());
	}

	@Test
	@DisplayName("Record 4882: County is Bergen")
	void CountyOfRecord4882() {
		assertEquals("Bergen", customers.get(4881).getCounty());
	}

	@Test
	@DisplayName("Record 4882: State is NJ")
	void StateOfRecord4882() {
		assertEquals("NJ", customers.get(4881).getState());
	}

	@Test
	@DisplayName("Record 4882: ZIP is 7631")
	void ZIPOfRecord4882() {
		assertEquals("7631", customers.get(4881).getZIP());
	}

	@Test
	@DisplayName("Record 4882: Phone is 201-569-7755")
	void PhoneOfRecord4882() {
		assertEquals("201-569-7755", customers.get(4881).getPhone());
	}

	@Test
	@DisplayName("Record 4882: Fax is 201-569-9233")
	void FaxOfRecord4882() {
		assertEquals("201-569-9233", customers.get(4881).getFax());
	}

	@Test
	@DisplayName("Record 4882: Email is kristy@chiara.com")
	void EmailOfRecord4882() {
		assertEquals("kristy@chiara.com", customers.get(4881).getEmail());
	}

	@Test
	@DisplayName("Record 4882: Web is http://www.kristychiara.com")
	void WebOfRecord4882() {
		assertEquals("http://www.kristychiara.com", customers.get(4881).getWeb());
	}
}

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

@Tag("10")
class Record_2311 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2311: FirstName is Emerson")
	void FirstNameOfRecord2311() {
		assertEquals("Emerson", customers.get(2310).getFirstName());
	}

	@Test
	@DisplayName("Record 2311: LastName is Botros")
	void LastNameOfRecord2311() {
		assertEquals("Botros", customers.get(2310).getLastName());
	}

	@Test
	@DisplayName("Record 2311: Company is Barbone, L A")
	void CompanyOfRecord2311() {
		assertEquals("Barbone, L A", customers.get(2310).getCompany());
	}

	@Test
	@DisplayName("Record 2311: Address is 1017 Broadway")
	void AddressOfRecord2311() {
		assertEquals("1017 Broadway", customers.get(2310).getAddress());
	}

	@Test
	@DisplayName("Record 2311: City is Bayonne")
	void CityOfRecord2311() {
		assertEquals("Bayonne", customers.get(2310).getCity());
	}

	@Test
	@DisplayName("Record 2311: County is Hudson")
	void CountyOfRecord2311() {
		assertEquals("Hudson", customers.get(2310).getCounty());
	}

	@Test
	@DisplayName("Record 2311: State is NJ")
	void StateOfRecord2311() {
		assertEquals("NJ", customers.get(2310).getState());
	}

	@Test
	@DisplayName("Record 2311: ZIP is 7002")
	void ZIPOfRecord2311() {
		assertEquals("7002", customers.get(2310).getZIP());
	}

	@Test
	@DisplayName("Record 2311: Phone is 201-437-0819")
	void PhoneOfRecord2311() {
		assertEquals("201-437-0819", customers.get(2310).getPhone());
	}

	@Test
	@DisplayName("Record 2311: Fax is 201-437-0526")
	void FaxOfRecord2311() {
		assertEquals("201-437-0526", customers.get(2310).getFax());
	}

	@Test
	@DisplayName("Record 2311: Email is emerson@botros.com")
	void EmailOfRecord2311() {
		assertEquals("emerson@botros.com", customers.get(2310).getEmail());
	}

	@Test
	@DisplayName("Record 2311: Web is http://www.emersonbotros.com")
	void WebOfRecord2311() {
		assertEquals("http://www.emersonbotros.com", customers.get(2310).getWeb());
	}
}

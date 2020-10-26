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
class Record_754 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 754: FirstName is Eloise")
	void FirstNameOfRecord754() {
		assertEquals("Eloise", customers.get(753).getFirstName());
	}

	@Test
	@DisplayName("Record 754: LastName is Mohabir")
	void LastNameOfRecord754() {
		assertEquals("Mohabir", customers.get(753).getLastName());
	}

	@Test
	@DisplayName("Record 754: Company is Americal Flat Glass Distr Inc")
	void CompanyOfRecord754() {
		assertEquals("Americal Flat Glass Distr Inc", customers.get(753).getCompany());
	}

	@Test
	@DisplayName("Record 754: Address is 620 Pershing Ave")
	void AddressOfRecord754() {
		assertEquals("620 Pershing Ave", customers.get(753).getAddress());
	}

	@Test
	@DisplayName("Record 754: City is Pocatello")
	void CityOfRecord754() {
		assertEquals("Pocatello", customers.get(753).getCity());
	}

	@Test
	@DisplayName("Record 754: County is Bannock")
	void CountyOfRecord754() {
		assertEquals("Bannock", customers.get(753).getCounty());
	}

	@Test
	@DisplayName("Record 754: State is ID")
	void StateOfRecord754() {
		assertEquals("ID", customers.get(753).getState());
	}

	@Test
	@DisplayName("Record 754: ZIP is 83201")
	void ZIPOfRecord754() {
		assertEquals("83201", customers.get(753).getZIP());
	}

	@Test
	@DisplayName("Record 754: Phone is 208-233-8568")
	void PhoneOfRecord754() {
		assertEquals("208-233-8568", customers.get(753).getPhone());
	}

	@Test
	@DisplayName("Record 754: Fax is 208-233-8755")
	void FaxOfRecord754() {
		assertEquals("208-233-8755", customers.get(753).getFax());
	}

	@Test
	@DisplayName("Record 754: Email is eloise@mohabir.com")
	void EmailOfRecord754() {
		assertEquals("eloise@mohabir.com", customers.get(753).getEmail());
	}

	@Test
	@DisplayName("Record 754: Web is http://www.eloisemohabir.com")
	void WebOfRecord754() {
		assertEquals("http://www.eloisemohabir.com", customers.get(753).getWeb());
	}
}

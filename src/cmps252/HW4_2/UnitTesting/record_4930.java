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

@Tag("35")
class Record_4930 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4930: FirstName is Ada")
	void FirstNameOfRecord4930() {
		assertEquals("Ada", customers.get(4929).getFirstName());
	}

	@Test
	@DisplayName("Record 4930: LastName is Pitarresi")
	void LastNameOfRecord4930() {
		assertEquals("Pitarresi", customers.get(4929).getLastName());
	}

	@Test
	@DisplayName("Record 4930: Company is Public Works")
	void CompanyOfRecord4930() {
		assertEquals("Public Works", customers.get(4929).getCompany());
	}

	@Test
	@DisplayName("Record 4930: Address is 204 S Beverly Dr")
	void AddressOfRecord4930() {
		assertEquals("204 S Beverly Dr", customers.get(4929).getAddress());
	}

	@Test
	@DisplayName("Record 4930: City is Beverly Hills")
	void CityOfRecord4930() {
		assertEquals("Beverly Hills", customers.get(4929).getCity());
	}

	@Test
	@DisplayName("Record 4930: County is Los Angeles")
	void CountyOfRecord4930() {
		assertEquals("Los Angeles", customers.get(4929).getCounty());
	}

	@Test
	@DisplayName("Record 4930: State is CA")
	void StateOfRecord4930() {
		assertEquals("CA", customers.get(4929).getState());
	}

	@Test
	@DisplayName("Record 4930: ZIP is 90212")
	void ZIPOfRecord4930() {
		assertEquals("90212", customers.get(4929).getZIP());
	}

	@Test
	@DisplayName("Record 4930: Phone is 310-271-4227")
	void PhoneOfRecord4930() {
		assertEquals("310-271-4227", customers.get(4929).getPhone());
	}

	@Test
	@DisplayName("Record 4930: Fax is 310-271-2027")
	void FaxOfRecord4930() {
		assertEquals("310-271-2027", customers.get(4929).getFax());
	}

	@Test
	@DisplayName("Record 4930: Email is ada@pitarresi.com")
	void EmailOfRecord4930() {
		assertEquals("ada@pitarresi.com", customers.get(4929).getEmail());
	}

	@Test
	@DisplayName("Record 4930: Web is http://www.adapitarresi.com")
	void WebOfRecord4930() {
		assertEquals("http://www.adapitarresi.com", customers.get(4929).getWeb());
	}
}

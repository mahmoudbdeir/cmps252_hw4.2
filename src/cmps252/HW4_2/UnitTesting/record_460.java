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

@Tag("34")
class Record_460 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 460: FirstName is Dario")
	void FirstNameOfRecord460() {
		assertEquals("Dario", customers.get(459).getFirstName());
	}

	@Test
	@DisplayName("Record 460: LastName is Sandine")
	void LastNameOfRecord460() {
		assertEquals("Sandine", customers.get(459).getLastName());
	}

	@Test
	@DisplayName("Record 460: Company is Raskas Foods Inc")
	void CompanyOfRecord460() {
		assertEquals("Raskas Foods Inc", customers.get(459).getCompany());
	}

	@Test
	@DisplayName("Record 460: Address is 30 Park Pl")
	void AddressOfRecord460() {
		assertEquals("30 Park Pl", customers.get(459).getAddress());
	}

	@Test
	@DisplayName("Record 460: City is Englewood")
	void CityOfRecord460() {
		assertEquals("Englewood", customers.get(459).getCity());
	}

	@Test
	@DisplayName("Record 460: County is Bergen")
	void CountyOfRecord460() {
		assertEquals("Bergen", customers.get(459).getCounty());
	}

	@Test
	@DisplayName("Record 460: State is NJ")
	void StateOfRecord460() {
		assertEquals("NJ", customers.get(459).getState());
	}

	@Test
	@DisplayName("Record 460: ZIP is 7631")
	void ZIPOfRecord460() {
		assertEquals("7631", customers.get(459).getZIP());
	}

	@Test
	@DisplayName("Record 460: Phone is 201-871-1705")
	void PhoneOfRecord460() {
		assertEquals("201-871-1705", customers.get(459).getPhone());
	}

	@Test
	@DisplayName("Record 460: Fax is 201-871-3472")
	void FaxOfRecord460() {
		assertEquals("201-871-3472", customers.get(459).getFax());
	}

	@Test
	@DisplayName("Record 460: Email is dario@sandine.com")
	void EmailOfRecord460() {
		assertEquals("dario@sandine.com", customers.get(459).getEmail());
	}

	@Test
	@DisplayName("Record 460: Web is http://www.dariosandine.com")
	void WebOfRecord460() {
		assertEquals("http://www.dariosandine.com", customers.get(459).getWeb());
	}
}

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

@Tag("25")
class Record_3389 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3389: FirstName is Benny")
	void FirstNameOfRecord3389() {
		assertEquals("Benny", customers.get(3388).getFirstName());
	}

	@Test
	@DisplayName("Record 3389: LastName is Strode")
	void LastNameOfRecord3389() {
		assertEquals("Strode", customers.get(3388).getLastName());
	}

	@Test
	@DisplayName("Record 3389: Company is Phillips Lytle Hitchcock")
	void CompanyOfRecord3389() {
		assertEquals("Phillips Lytle Hitchcock", customers.get(3388).getCompany());
	}

	@Test
	@DisplayName("Record 3389: Address is 4351 Auburn Blvd")
	void AddressOfRecord3389() {
		assertEquals("4351 Auburn Blvd", customers.get(3388).getAddress());
	}

	@Test
	@DisplayName("Record 3389: City is Sacramento")
	void CityOfRecord3389() {
		assertEquals("Sacramento", customers.get(3388).getCity());
	}

	@Test
	@DisplayName("Record 3389: County is Sacramento")
	void CountyOfRecord3389() {
		assertEquals("Sacramento", customers.get(3388).getCounty());
	}

	@Test
	@DisplayName("Record 3389: State is CA")
	void StateOfRecord3389() {
		assertEquals("CA", customers.get(3388).getState());
	}

	@Test
	@DisplayName("Record 3389: ZIP is 95841")
	void ZIPOfRecord3389() {
		assertEquals("95841", customers.get(3388).getZIP());
	}

	@Test
	@DisplayName("Record 3389: Phone is 916-482-5693")
	void PhoneOfRecord3389() {
		assertEquals("916-482-5693", customers.get(3388).getPhone());
	}

	@Test
	@DisplayName("Record 3389: Fax is 916-482-0105")
	void FaxOfRecord3389() {
		assertEquals("916-482-0105", customers.get(3388).getFax());
	}

	@Test
	@DisplayName("Record 3389: Email is benny@strode.com")
	void EmailOfRecord3389() {
		assertEquals("benny@strode.com", customers.get(3388).getEmail());
	}

	@Test
	@DisplayName("Record 3389: Web is http://www.bennystrode.com")
	void WebOfRecord3389() {
		assertEquals("http://www.bennystrode.com", customers.get(3388).getWeb());
	}
}

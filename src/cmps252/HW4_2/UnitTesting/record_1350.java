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

@Tag("47")
class Record_1350 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1350: FirstName is Dalia")
	void FirstNameOfRecord1350() {
		assertEquals("Dalia", customers.get(1349).getFirstName());
	}

	@Test
	@DisplayName("Record 1350: LastName is Zenke")
	void LastNameOfRecord1350() {
		assertEquals("Zenke", customers.get(1349).getLastName());
	}

	@Test
	@DisplayName("Record 1350: Company is Girton Manufacturing Company")
	void CompanyOfRecord1350() {
		assertEquals("Girton Manufacturing Company", customers.get(1349).getCompany());
	}

	@Test
	@DisplayName("Record 1350: Address is 945 Bransten Rd")
	void AddressOfRecord1350() {
		assertEquals("945 Bransten Rd", customers.get(1349).getAddress());
	}

	@Test
	@DisplayName("Record 1350: City is San Carlos")
	void CityOfRecord1350() {
		assertEquals("San Carlos", customers.get(1349).getCity());
	}

	@Test
	@DisplayName("Record 1350: County is San Mateo")
	void CountyOfRecord1350() {
		assertEquals("San Mateo", customers.get(1349).getCounty());
	}

	@Test
	@DisplayName("Record 1350: State is CA")
	void StateOfRecord1350() {
		assertEquals("CA", customers.get(1349).getState());
	}

	@Test
	@DisplayName("Record 1350: ZIP is 94070")
	void ZIPOfRecord1350() {
		assertEquals("94070", customers.get(1349).getZIP());
	}

	@Test
	@DisplayName("Record 1350: Phone is 650-592-7039")
	void PhoneOfRecord1350() {
		assertEquals("650-592-7039", customers.get(1349).getPhone());
	}

	@Test
	@DisplayName("Record 1350: Fax is 650-592-7415")
	void FaxOfRecord1350() {
		assertEquals("650-592-7415", customers.get(1349).getFax());
	}

	@Test
	@DisplayName("Record 1350: Email is dalia@zenke.com")
	void EmailOfRecord1350() {
		assertEquals("dalia@zenke.com", customers.get(1349).getEmail());
	}

	@Test
	@DisplayName("Record 1350: Web is http://www.daliazenke.com")
	void WebOfRecord1350() {
		assertEquals("http://www.daliazenke.com", customers.get(1349).getWeb());
	}
}

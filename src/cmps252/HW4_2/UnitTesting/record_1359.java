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

@Tag("43")
class Record_1359 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1359: FirstName is Lillian")
	void FirstNameOfRecord1359() {
		assertEquals("Lillian", customers.get(1358).getFirstName());
	}

	@Test
	@DisplayName("Record 1359: LastName is Gradney")
	void LastNameOfRecord1359() {
		assertEquals("Gradney", customers.get(1358).getLastName());
	}

	@Test
	@DisplayName("Record 1359: Company is Mitsis Printing")
	void CompanyOfRecord1359() {
		assertEquals("Mitsis Printing", customers.get(1358).getCompany());
	}

	@Test
	@DisplayName("Record 1359: Address is 1321 7th St")
	void AddressOfRecord1359() {
		assertEquals("1321 7th St", customers.get(1358).getAddress());
	}

	@Test
	@DisplayName("Record 1359: City is Berkeley")
	void CityOfRecord1359() {
		assertEquals("Berkeley", customers.get(1358).getCity());
	}

	@Test
	@DisplayName("Record 1359: County is Alameda")
	void CountyOfRecord1359() {
		assertEquals("Alameda", customers.get(1358).getCounty());
	}

	@Test
	@DisplayName("Record 1359: State is CA")
	void StateOfRecord1359() {
		assertEquals("CA", customers.get(1358).getState());
	}

	@Test
	@DisplayName("Record 1359: ZIP is 94710")
	void ZIPOfRecord1359() {
		assertEquals("94710", customers.get(1358).getZIP());
	}

	@Test
	@DisplayName("Record 1359: Phone is 510-527-9971")
	void PhoneOfRecord1359() {
		assertEquals("510-527-9971", customers.get(1358).getPhone());
	}

	@Test
	@DisplayName("Record 1359: Fax is 510-527-9797")
	void FaxOfRecord1359() {
		assertEquals("510-527-9797", customers.get(1358).getFax());
	}

	@Test
	@DisplayName("Record 1359: Email is lillian@gradney.com")
	void EmailOfRecord1359() {
		assertEquals("lillian@gradney.com", customers.get(1358).getEmail());
	}

	@Test
	@DisplayName("Record 1359: Web is http://www.lilliangradney.com")
	void WebOfRecord1359() {
		assertEquals("http://www.lilliangradney.com", customers.get(1358).getWeb());
	}
}

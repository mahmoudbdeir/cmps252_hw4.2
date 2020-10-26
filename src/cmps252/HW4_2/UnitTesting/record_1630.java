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

@Tag("14")
class Record_1630 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1630: FirstName is Rickey")
	void FirstNameOfRecord1630() {
		assertEquals("Rickey", customers.get(1629).getFirstName());
	}

	@Test
	@DisplayName("Record 1630: LastName is Wojdak")
	void LastNameOfRecord1630() {
		assertEquals("Wojdak", customers.get(1629).getLastName());
	}

	@Test
	@DisplayName("Record 1630: Company is Shalimar United Methdst Chrch")
	void CompanyOfRecord1630() {
		assertEquals("Shalimar United Methdst Chrch", customers.get(1629).getCompany());
	}

	@Test
	@DisplayName("Record 1630: Address is 35 Mitchell Blvd")
	void AddressOfRecord1630() {
		assertEquals("35 Mitchell Blvd", customers.get(1629).getAddress());
	}

	@Test
	@DisplayName("Record 1630: City is San Rafael")
	void CityOfRecord1630() {
		assertEquals("San Rafael", customers.get(1629).getCity());
	}

	@Test
	@DisplayName("Record 1630: County is Marin")
	void CountyOfRecord1630() {
		assertEquals("Marin", customers.get(1629).getCounty());
	}

	@Test
	@DisplayName("Record 1630: State is CA")
	void StateOfRecord1630() {
		assertEquals("CA", customers.get(1629).getState());
	}

	@Test
	@DisplayName("Record 1630: ZIP is 94903")
	void ZIPOfRecord1630() {
		assertEquals("94903", customers.get(1629).getZIP());
	}

	@Test
	@DisplayName("Record 1630: Phone is 415-479-9645")
	void PhoneOfRecord1630() {
		assertEquals("415-479-9645", customers.get(1629).getPhone());
	}

	@Test
	@DisplayName("Record 1630: Fax is 415-479-9867")
	void FaxOfRecord1630() {
		assertEquals("415-479-9867", customers.get(1629).getFax());
	}

	@Test
	@DisplayName("Record 1630: Email is rickey@wojdak.com")
	void EmailOfRecord1630() {
		assertEquals("rickey@wojdak.com", customers.get(1629).getEmail());
	}

	@Test
	@DisplayName("Record 1630: Web is http://www.rickeywojdak.com")
	void WebOfRecord1630() {
		assertEquals("http://www.rickeywojdak.com", customers.get(1629).getWeb());
	}
}

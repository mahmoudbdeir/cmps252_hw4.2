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

@Tag("36")
class Record_1161 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1161: FirstName is Susana")
	void FirstNameOfRecord1161() {
		assertEquals("Susana", customers.get(1160).getFirstName());
	}

	@Test
	@DisplayName("Record 1161: LastName is Seedborg")
	void LastNameOfRecord1161() {
		assertEquals("Seedborg", customers.get(1160).getLastName());
	}

	@Test
	@DisplayName("Record 1161: Company is Leavens Awards Co Inc")
	void CompanyOfRecord1161() {
		assertEquals("Leavens Awards Co Inc", customers.get(1160).getCompany());
	}

	@Test
	@DisplayName("Record 1161: Address is 702 Nord Ave")
	void AddressOfRecord1161() {
		assertEquals("702 Nord Ave", customers.get(1160).getAddress());
	}

	@Test
	@DisplayName("Record 1161: City is Chico")
	void CityOfRecord1161() {
		assertEquals("Chico", customers.get(1160).getCity());
	}

	@Test
	@DisplayName("Record 1161: County is Butte")
	void CountyOfRecord1161() {
		assertEquals("Butte", customers.get(1160).getCounty());
	}

	@Test
	@DisplayName("Record 1161: State is CA")
	void StateOfRecord1161() {
		assertEquals("CA", customers.get(1160).getState());
	}

	@Test
	@DisplayName("Record 1161: ZIP is 95926")
	void ZIPOfRecord1161() {
		assertEquals("95926", customers.get(1160).getZIP());
	}

	@Test
	@DisplayName("Record 1161: Phone is 530-893-3165")
	void PhoneOfRecord1161() {
		assertEquals("530-893-3165", customers.get(1160).getPhone());
	}

	@Test
	@DisplayName("Record 1161: Fax is 530-893-0583")
	void FaxOfRecord1161() {
		assertEquals("530-893-0583", customers.get(1160).getFax());
	}

	@Test
	@DisplayName("Record 1161: Email is susana@seedborg.com")
	void EmailOfRecord1161() {
		assertEquals("susana@seedborg.com", customers.get(1160).getEmail());
	}

	@Test
	@DisplayName("Record 1161: Web is http://www.susanaseedborg.com")
	void WebOfRecord1161() {
		assertEquals("http://www.susanaseedborg.com", customers.get(1160).getWeb());
	}
}

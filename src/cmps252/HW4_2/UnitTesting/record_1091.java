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
class Record_1091 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1091: FirstName is Austin")
	void FirstNameOfRecord1091() {
		assertEquals("Austin", customers.get(1090).getFirstName());
	}

	@Test
	@DisplayName("Record 1091: LastName is Bowersmith")
	void LastNameOfRecord1091() {
		assertEquals("Bowersmith", customers.get(1090).getLastName());
	}

	@Test
	@DisplayName("Record 1091: Company is Insurance Car Rentals Inc")
	void CompanyOfRecord1091() {
		assertEquals("Insurance Car Rentals Inc", customers.get(1090).getCompany());
	}

	@Test
	@DisplayName("Record 1091: Address is 1623 S Vermont Ave")
	void AddressOfRecord1091() {
		assertEquals("1623 S Vermont Ave", customers.get(1090).getAddress());
	}

	@Test
	@DisplayName("Record 1091: City is Los Angeles")
	void CityOfRecord1091() {
		assertEquals("Los Angeles", customers.get(1090).getCity());
	}

	@Test
	@DisplayName("Record 1091: County is Los Angeles")
	void CountyOfRecord1091() {
		assertEquals("Los Angeles", customers.get(1090).getCounty());
	}

	@Test
	@DisplayName("Record 1091: State is CA")
	void StateOfRecord1091() {
		assertEquals("CA", customers.get(1090).getState());
	}

	@Test
	@DisplayName("Record 1091: ZIP is 90006")
	void ZIPOfRecord1091() {
		assertEquals("90006", customers.get(1090).getZIP());
	}

	@Test
	@DisplayName("Record 1091: Phone is 323-733-7411")
	void PhoneOfRecord1091() {
		assertEquals("323-733-7411", customers.get(1090).getPhone());
	}

	@Test
	@DisplayName("Record 1091: Fax is 323-733-8611")
	void FaxOfRecord1091() {
		assertEquals("323-733-8611", customers.get(1090).getFax());
	}

	@Test
	@DisplayName("Record 1091: Email is austin@bowersmith.com")
	void EmailOfRecord1091() {
		assertEquals("austin@bowersmith.com", customers.get(1090).getEmail());
	}

	@Test
	@DisplayName("Record 1091: Web is http://www.austinbowersmith.com")
	void WebOfRecord1091() {
		assertEquals("http://www.austinbowersmith.com", customers.get(1090).getWeb());
	}
}

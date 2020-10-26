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

@Tag("23")
class Record_1085 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1085: FirstName is Olivia")
	void FirstNameOfRecord1085() {
		assertEquals("Olivia", customers.get(1084).getFirstName());
	}

	@Test
	@DisplayName("Record 1085: LastName is Troyano")
	void LastNameOfRecord1085() {
		assertEquals("Troyano", customers.get(1084).getLastName());
	}

	@Test
	@DisplayName("Record 1085: Company is Wolf Investments Corps")
	void CompanyOfRecord1085() {
		assertEquals("Wolf Investments Corps", customers.get(1084).getCompany());
	}

	@Test
	@DisplayName("Record 1085: Address is Del Monte Ave")
	void AddressOfRecord1085() {
		assertEquals("Del Monte Ave", customers.get(1084).getAddress());
	}

	@Test
	@DisplayName("Record 1085: City is Monterey")
	void CityOfRecord1085() {
		assertEquals("Monterey", customers.get(1084).getCity());
	}

	@Test
	@DisplayName("Record 1085: County is Monterey")
	void CountyOfRecord1085() {
		assertEquals("Monterey", customers.get(1084).getCounty());
	}

	@Test
	@DisplayName("Record 1085: State is CA")
	void StateOfRecord1085() {
		assertEquals("CA", customers.get(1084).getState());
	}

	@Test
	@DisplayName("Record 1085: ZIP is 93940")
	void ZIPOfRecord1085() {
		assertEquals("93940", customers.get(1084).getZIP());
	}

	@Test
	@DisplayName("Record 1085: Phone is 831-373-8259")
	void PhoneOfRecord1085() {
		assertEquals("831-373-8259", customers.get(1084).getPhone());
	}

	@Test
	@DisplayName("Record 1085: Fax is 831-373-4123")
	void FaxOfRecord1085() {
		assertEquals("831-373-4123", customers.get(1084).getFax());
	}

	@Test
	@DisplayName("Record 1085: Email is olivia@troyano.com")
	void EmailOfRecord1085() {
		assertEquals("olivia@troyano.com", customers.get(1084).getEmail());
	}

	@Test
	@DisplayName("Record 1085: Web is http://www.oliviatroyano.com")
	void WebOfRecord1085() {
		assertEquals("http://www.oliviatroyano.com", customers.get(1084).getWeb());
	}
}

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

@Tag("42")
class Record_3092 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3092: FirstName is Arron")
	void FirstNameOfRecord3092() {
		assertEquals("Arron", customers.get(3091).getFirstName());
	}

	@Test
	@DisplayName("Record 3092: LastName is Huynh")
	void LastNameOfRecord3092() {
		assertEquals("Huynh", customers.get(3091).getLastName());
	}

	@Test
	@DisplayName("Record 3092: Company is Walls Inc")
	void CompanyOfRecord3092() {
		assertEquals("Walls Inc", customers.get(3091).getCompany());
	}

	@Test
	@DisplayName("Record 3092: Address is 345 Boniface Pky")
	void AddressOfRecord3092() {
		assertEquals("345 Boniface Pky", customers.get(3091).getAddress());
	}

	@Test
	@DisplayName("Record 3092: City is Anchorage")
	void CityOfRecord3092() {
		assertEquals("Anchorage", customers.get(3091).getCity());
	}

	@Test
	@DisplayName("Record 3092: County is Anchorage")
	void CountyOfRecord3092() {
		assertEquals("Anchorage", customers.get(3091).getCounty());
	}

	@Test
	@DisplayName("Record 3092: State is AK")
	void StateOfRecord3092() {
		assertEquals("AK", customers.get(3091).getState());
	}

	@Test
	@DisplayName("Record 3092: ZIP is 99504")
	void ZIPOfRecord3092() {
		assertEquals("99504", customers.get(3091).getZIP());
	}

	@Test
	@DisplayName("Record 3092: Phone is 907-333-9064")
	void PhoneOfRecord3092() {
		assertEquals("907-333-9064", customers.get(3091).getPhone());
	}

	@Test
	@DisplayName("Record 3092: Fax is 907-333-3068")
	void FaxOfRecord3092() {
		assertEquals("907-333-3068", customers.get(3091).getFax());
	}

	@Test
	@DisplayName("Record 3092: Email is arron@huynh.com")
	void EmailOfRecord3092() {
		assertEquals("arron@huynh.com", customers.get(3091).getEmail());
	}

	@Test
	@DisplayName("Record 3092: Web is http://www.arronhuynh.com")
	void WebOfRecord3092() {
		assertEquals("http://www.arronhuynh.com", customers.get(3091).getWeb());
	}
}

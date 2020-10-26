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

@Tag("33")
class Record_2019 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2019: FirstName is Camille")
	void FirstNameOfRecord2019() {
		assertEquals("Camille", customers.get(2018).getFirstName());
	}

	@Test
	@DisplayName("Record 2019: LastName is Nebergall")
	void LastNameOfRecord2019() {
		assertEquals("Nebergall", customers.get(2018).getLastName());
	}

	@Test
	@DisplayName("Record 2019: Company is Brunswick Woodworking")
	void CompanyOfRecord2019() {
		assertEquals("Brunswick Woodworking", customers.get(2018).getCompany());
	}

	@Test
	@DisplayName("Record 2019: Address is 850 Kamehameha Hwy  #-167a")
	void AddressOfRecord2019() {
		assertEquals("850 Kamehameha Hwy  #-167a", customers.get(2018).getAddress());
	}

	@Test
	@DisplayName("Record 2019: City is Pearl City")
	void CityOfRecord2019() {
		assertEquals("Pearl City", customers.get(2018).getCity());
	}

	@Test
	@DisplayName("Record 2019: County is Honolulu")
	void CountyOfRecord2019() {
		assertEquals("Honolulu", customers.get(2018).getCounty());
	}

	@Test
	@DisplayName("Record 2019: State is HI")
	void StateOfRecord2019() {
		assertEquals("HI", customers.get(2018).getState());
	}

	@Test
	@DisplayName("Record 2019: ZIP is 96782")
	void ZIPOfRecord2019() {
		assertEquals("96782", customers.get(2018).getZIP());
	}

	@Test
	@DisplayName("Record 2019: Phone is 808-456-2785")
	void PhoneOfRecord2019() {
		assertEquals("808-456-2785", customers.get(2018).getPhone());
	}

	@Test
	@DisplayName("Record 2019: Fax is 808-456-5911")
	void FaxOfRecord2019() {
		assertEquals("808-456-5911", customers.get(2018).getFax());
	}

	@Test
	@DisplayName("Record 2019: Email is camille@nebergall.com")
	void EmailOfRecord2019() {
		assertEquals("camille@nebergall.com", customers.get(2018).getEmail());
	}

	@Test
	@DisplayName("Record 2019: Web is http://www.camillenebergall.com")
	void WebOfRecord2019() {
		assertEquals("http://www.camillenebergall.com", customers.get(2018).getWeb());
	}
}

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
class Record_2266 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2266: FirstName is Mason")
	void FirstNameOfRecord2266() {
		assertEquals("Mason", customers.get(2265).getFirstName());
	}

	@Test
	@DisplayName("Record 2266: LastName is Sieberg")
	void LastNameOfRecord2266() {
		assertEquals("Sieberg", customers.get(2265).getLastName());
	}

	@Test
	@DisplayName("Record 2266: Company is Nancys Specialty Foods")
	void CompanyOfRecord2266() {
		assertEquals("Nancys Specialty Foods", customers.get(2265).getCompany());
	}

	@Test
	@DisplayName("Record 2266: Address is 39791 Paseo Padre Pky  #-a")
	void AddressOfRecord2266() {
		assertEquals("39791 Paseo Padre Pky  #-a", customers.get(2265).getAddress());
	}

	@Test
	@DisplayName("Record 2266: City is Fremont")
	void CityOfRecord2266() {
		assertEquals("Fremont", customers.get(2265).getCity());
	}

	@Test
	@DisplayName("Record 2266: County is Alameda")
	void CountyOfRecord2266() {
		assertEquals("Alameda", customers.get(2265).getCounty());
	}

	@Test
	@DisplayName("Record 2266: State is CA")
	void StateOfRecord2266() {
		assertEquals("CA", customers.get(2265).getState());
	}

	@Test
	@DisplayName("Record 2266: ZIP is 94538")
	void ZIPOfRecord2266() {
		assertEquals("94538", customers.get(2265).getZIP());
	}

	@Test
	@DisplayName("Record 2266: Phone is 510-770-9284")
	void PhoneOfRecord2266() {
		assertEquals("510-770-9284", customers.get(2265).getPhone());
	}

	@Test
	@DisplayName("Record 2266: Fax is 510-770-6046")
	void FaxOfRecord2266() {
		assertEquals("510-770-6046", customers.get(2265).getFax());
	}

	@Test
	@DisplayName("Record 2266: Email is mason@sieberg.com")
	void EmailOfRecord2266() {
		assertEquals("mason@sieberg.com", customers.get(2265).getEmail());
	}

	@Test
	@DisplayName("Record 2266: Web is http://www.masonsieberg.com")
	void WebOfRecord2266() {
		assertEquals("http://www.masonsieberg.com", customers.get(2265).getWeb());
	}
}

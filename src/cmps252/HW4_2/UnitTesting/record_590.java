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
class Record_590 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 590: FirstName is Alene")
	void FirstNameOfRecord590() {
		assertEquals("Alene", customers.get(589).getFirstName());
	}

	@Test
	@DisplayName("Record 590: LastName is Dienst")
	void LastNameOfRecord590() {
		assertEquals("Dienst", customers.get(589).getLastName());
	}

	@Test
	@DisplayName("Record 590: Company is Tricraft Welding")
	void CompanyOfRecord590() {
		assertEquals("Tricraft Welding", customers.get(589).getCompany());
	}

	@Test
	@DisplayName("Record 590: Address is 15508 E 19th Ave  #-g")
	void AddressOfRecord590() {
		assertEquals("15508 E 19th Ave  #-g", customers.get(589).getAddress());
	}

	@Test
	@DisplayName("Record 590: City is Aurora")
	void CityOfRecord590() {
		assertEquals("Aurora", customers.get(589).getCity());
	}

	@Test
	@DisplayName("Record 590: County is Adams")
	void CountyOfRecord590() {
		assertEquals("Adams", customers.get(589).getCounty());
	}

	@Test
	@DisplayName("Record 590: State is CO")
	void StateOfRecord590() {
		assertEquals("CO", customers.get(589).getState());
	}

	@Test
	@DisplayName("Record 590: ZIP is 80011")
	void ZIPOfRecord590() {
		assertEquals("80011", customers.get(589).getZIP());
	}

	@Test
	@DisplayName("Record 590: Phone is 303-367-8571")
	void PhoneOfRecord590() {
		assertEquals("303-367-8571", customers.get(589).getPhone());
	}

	@Test
	@DisplayName("Record 590: Fax is 303-367-8573")
	void FaxOfRecord590() {
		assertEquals("303-367-8573", customers.get(589).getFax());
	}

	@Test
	@DisplayName("Record 590: Email is alene@dienst.com")
	void EmailOfRecord590() {
		assertEquals("alene@dienst.com", customers.get(589).getEmail());
	}

	@Test
	@DisplayName("Record 590: Web is http://www.alenedienst.com")
	void WebOfRecord590() {
		assertEquals("http://www.alenedienst.com", customers.get(589).getWeb());
	}
}

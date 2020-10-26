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

@Tag("44")
class Record_4453 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4453: FirstName is Darryl")
	void FirstNameOfRecord4453() {
		assertEquals("Darryl", customers.get(4452).getFirstName());
	}

	@Test
	@DisplayName("Record 4453: LastName is Hoschouer")
	void LastNameOfRecord4453() {
		assertEquals("Hoschouer", customers.get(4452).getLastName());
	}

	@Test
	@DisplayName("Record 4453: Company is House Of Flowers & Designs")
	void CompanyOfRecord4453() {
		assertEquals("House Of Flowers & Designs", customers.get(4452).getCompany());
	}

	@Test
	@DisplayName("Record 4453: Address is 495 Schuyler Ave")
	void AddressOfRecord4453() {
		assertEquals("495 Schuyler Ave", customers.get(4452).getAddress());
	}

	@Test
	@DisplayName("Record 4453: City is Kearny")
	void CityOfRecord4453() {
		assertEquals("Kearny", customers.get(4452).getCity());
	}

	@Test
	@DisplayName("Record 4453: County is Hudson")
	void CountyOfRecord4453() {
		assertEquals("Hudson", customers.get(4452).getCounty());
	}

	@Test
	@DisplayName("Record 4453: State is NJ")
	void StateOfRecord4453() {
		assertEquals("NJ", customers.get(4452).getState());
	}

	@Test
	@DisplayName("Record 4453: ZIP is 7032")
	void ZIPOfRecord4453() {
		assertEquals("7032", customers.get(4452).getZIP());
	}

	@Test
	@DisplayName("Record 4453: Phone is 201-955-3781")
	void PhoneOfRecord4453() {
		assertEquals("201-955-3781", customers.get(4452).getPhone());
	}

	@Test
	@DisplayName("Record 4453: Fax is 201-955-5449")
	void FaxOfRecord4453() {
		assertEquals("201-955-5449", customers.get(4452).getFax());
	}

	@Test
	@DisplayName("Record 4453: Email is darryl@hoschouer.com")
	void EmailOfRecord4453() {
		assertEquals("darryl@hoschouer.com", customers.get(4452).getEmail());
	}

	@Test
	@DisplayName("Record 4453: Web is http://www.darrylhoschouer.com")
	void WebOfRecord4453() {
		assertEquals("http://www.darrylhoschouer.com", customers.get(4452).getWeb());
	}
}

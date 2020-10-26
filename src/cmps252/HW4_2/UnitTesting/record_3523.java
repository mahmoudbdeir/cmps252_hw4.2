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

@Tag("40")
class Record_3523 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3523: FirstName is Rachelle")
	void FirstNameOfRecord3523() {
		assertEquals("Rachelle", customers.get(3522).getFirstName());
	}

	@Test
	@DisplayName("Record 3523: LastName is Stealy")
	void LastNameOfRecord3523() {
		assertEquals("Stealy", customers.get(3522).getLastName());
	}

	@Test
	@DisplayName("Record 3523: Company is Dotson, Marshall F Jr")
	void CompanyOfRecord3523() {
		assertEquals("Dotson, Marshall F Jr", customers.get(3522).getCompany());
	}

	@Test
	@DisplayName("Record 3523: Address is 70 Commercial Ave")
	void AddressOfRecord3523() {
		assertEquals("70 Commercial Ave", customers.get(3522).getAddress());
	}

	@Test
	@DisplayName("Record 3523: City is Moonachie")
	void CityOfRecord3523() {
		assertEquals("Moonachie", customers.get(3522).getCity());
	}

	@Test
	@DisplayName("Record 3523: County is Bergen")
	void CountyOfRecord3523() {
		assertEquals("Bergen", customers.get(3522).getCounty());
	}

	@Test
	@DisplayName("Record 3523: State is NJ")
	void StateOfRecord3523() {
		assertEquals("NJ", customers.get(3522).getState());
	}

	@Test
	@DisplayName("Record 3523: ZIP is 7074")
	void ZIPOfRecord3523() {
		assertEquals("7074", customers.get(3522).getZIP());
	}

	@Test
	@DisplayName("Record 3523: Phone is 201-438-3663")
	void PhoneOfRecord3523() {
		assertEquals("201-438-3663", customers.get(3522).getPhone());
	}

	@Test
	@DisplayName("Record 3523: Fax is 201-438-4528")
	void FaxOfRecord3523() {
		assertEquals("201-438-4528", customers.get(3522).getFax());
	}

	@Test
	@DisplayName("Record 3523: Email is rachelle@stealy.com")
	void EmailOfRecord3523() {
		assertEquals("rachelle@stealy.com", customers.get(3522).getEmail());
	}

	@Test
	@DisplayName("Record 3523: Web is http://www.rachellestealy.com")
	void WebOfRecord3523() {
		assertEquals("http://www.rachellestealy.com", customers.get(3522).getWeb());
	}
}

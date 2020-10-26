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

@Tag("49")
class Record_3290 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3290: FirstName is Autumn")
	void FirstNameOfRecord3290() {
		assertEquals("Autumn", customers.get(3289).getFirstName());
	}

	@Test
	@DisplayName("Record 3290: LastName is Leveston")
	void LastNameOfRecord3290() {
		assertEquals("Leveston", customers.get(3289).getLastName());
	}

	@Test
	@DisplayName("Record 3290: Company is Grafx")
	void CompanyOfRecord3290() {
		assertEquals("Grafx", customers.get(3289).getCompany());
	}

	@Test
	@DisplayName("Record 3290: Address is 13107 Dessau Rd")
	void AddressOfRecord3290() {
		assertEquals("13107 Dessau Rd", customers.get(3289).getAddress());
	}

	@Test
	@DisplayName("Record 3290: City is Austin")
	void CityOfRecord3290() {
		assertEquals("Austin", customers.get(3289).getCity());
	}

	@Test
	@DisplayName("Record 3290: County is Travis")
	void CountyOfRecord3290() {
		assertEquals("Travis", customers.get(3289).getCounty());
	}

	@Test
	@DisplayName("Record 3290: State is TX")
	void StateOfRecord3290() {
		assertEquals("TX", customers.get(3289).getState());
	}

	@Test
	@DisplayName("Record 3290: ZIP is 78754")
	void ZIPOfRecord3290() {
		assertEquals("78754", customers.get(3289).getZIP());
	}

	@Test
	@DisplayName("Record 3290: Phone is 512-990-7461")
	void PhoneOfRecord3290() {
		assertEquals("512-990-7461", customers.get(3289).getPhone());
	}

	@Test
	@DisplayName("Record 3290: Fax is 512-990-9868")
	void FaxOfRecord3290() {
		assertEquals("512-990-9868", customers.get(3289).getFax());
	}

	@Test
	@DisplayName("Record 3290: Email is autumn@leveston.com")
	void EmailOfRecord3290() {
		assertEquals("autumn@leveston.com", customers.get(3289).getEmail());
	}

	@Test
	@DisplayName("Record 3290: Web is http://www.autumnleveston.com")
	void WebOfRecord3290() {
		assertEquals("http://www.autumnleveston.com", customers.get(3289).getWeb());
	}
}

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
class Record_4010 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4010: FirstName is Lora")
	void FirstNameOfRecord4010() {
		assertEquals("Lora", customers.get(4009).getFirstName());
	}

	@Test
	@DisplayName("Record 4010: LastName is Macfarlane")
	void LastNameOfRecord4010() {
		assertEquals("Macfarlane", customers.get(4009).getLastName());
	}

	@Test
	@DisplayName("Record 4010: Company is Trans Northern Airways")
	void CompanyOfRecord4010() {
		assertEquals("Trans Northern Airways", customers.get(4009).getCompany());
	}

	@Test
	@DisplayName("Record 4010: Address is 517 Grape St")
	void AddressOfRecord4010() {
		assertEquals("517 Grape St", customers.get(4009).getAddress());
	}

	@Test
	@DisplayName("Record 4010: City is Abilene")
	void CityOfRecord4010() {
		assertEquals("Abilene", customers.get(4009).getCity());
	}

	@Test
	@DisplayName("Record 4010: County is Taylor")
	void CountyOfRecord4010() {
		assertEquals("Taylor", customers.get(4009).getCounty());
	}

	@Test
	@DisplayName("Record 4010: State is TX")
	void StateOfRecord4010() {
		assertEquals("TX", customers.get(4009).getState());
	}

	@Test
	@DisplayName("Record 4010: ZIP is 79601")
	void ZIPOfRecord4010() {
		assertEquals("79601", customers.get(4009).getZIP());
	}

	@Test
	@DisplayName("Record 4010: Phone is 325-672-4917")
	void PhoneOfRecord4010() {
		assertEquals("325-672-4917", customers.get(4009).getPhone());
	}

	@Test
	@DisplayName("Record 4010: Fax is 325-672-8303")
	void FaxOfRecord4010() {
		assertEquals("325-672-8303", customers.get(4009).getFax());
	}

	@Test
	@DisplayName("Record 4010: Email is lora@macfarlane.com")
	void EmailOfRecord4010() {
		assertEquals("lora@macfarlane.com", customers.get(4009).getEmail());
	}

	@Test
	@DisplayName("Record 4010: Web is http://www.loramacfarlane.com")
	void WebOfRecord4010() {
		assertEquals("http://www.loramacfarlane.com", customers.get(4009).getWeb());
	}
}

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

@Tag("31")
class Record_4180 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4180: FirstName is Morton")
	void FirstNameOfRecord4180() {
		assertEquals("Morton", customers.get(4179).getFirstName());
	}

	@Test
	@DisplayName("Record 4180: LastName is Vanicek")
	void LastNameOfRecord4180() {
		assertEquals("Vanicek", customers.get(4179).getLastName());
	}

	@Test
	@DisplayName("Record 4180: Company is Affordable Signs & More")
	void CompanyOfRecord4180() {
		assertEquals("Affordable Signs & More", customers.get(4179).getCompany());
	}

	@Test
	@DisplayName("Record 4180: Address is 215 E Austin St")
	void AddressOfRecord4180() {
		assertEquals("215 E Austin St", customers.get(4179).getAddress());
	}

	@Test
	@DisplayName("Record 4180: City is Marshall")
	void CityOfRecord4180() {
		assertEquals("Marshall", customers.get(4179).getCity());
	}

	@Test
	@DisplayName("Record 4180: County is Harrison")
	void CountyOfRecord4180() {
		assertEquals("Harrison", customers.get(4179).getCounty());
	}

	@Test
	@DisplayName("Record 4180: State is TX")
	void StateOfRecord4180() {
		assertEquals("TX", customers.get(4179).getState());
	}

	@Test
	@DisplayName("Record 4180: ZIP is 75670")
	void ZIPOfRecord4180() {
		assertEquals("75670", customers.get(4179).getZIP());
	}

	@Test
	@DisplayName("Record 4180: Phone is 903-938-7758")
	void PhoneOfRecord4180() {
		assertEquals("903-938-7758", customers.get(4179).getPhone());
	}

	@Test
	@DisplayName("Record 4180: Fax is 903-938-3845")
	void FaxOfRecord4180() {
		assertEquals("903-938-3845", customers.get(4179).getFax());
	}

	@Test
	@DisplayName("Record 4180: Email is morton@vanicek.com")
	void EmailOfRecord4180() {
		assertEquals("morton@vanicek.com", customers.get(4179).getEmail());
	}

	@Test
	@DisplayName("Record 4180: Web is http://www.mortonvanicek.com")
	void WebOfRecord4180() {
		assertEquals("http://www.mortonvanicek.com", customers.get(4179).getWeb());
	}
}

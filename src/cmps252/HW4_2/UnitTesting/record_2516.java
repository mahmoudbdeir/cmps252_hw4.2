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
class Record_2516 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2516: FirstName is Audra")
	void FirstNameOfRecord2516() {
		assertEquals("Audra", customers.get(2515).getFirstName());
	}

	@Test
	@DisplayName("Record 2516: LastName is Varakuta")
	void LastNameOfRecord2516() {
		assertEquals("Varakuta", customers.get(2515).getLastName());
	}

	@Test
	@DisplayName("Record 2516: Company is Advanced Moving Inc")
	void CompanyOfRecord2516() {
		assertEquals("Advanced Moving Inc", customers.get(2515).getCompany());
	}

	@Test
	@DisplayName("Record 2516: Address is 58048 Kapuai Pl")
	void AddressOfRecord2516() {
		assertEquals("58048 Kapuai Pl", customers.get(2515).getAddress());
	}

	@Test
	@DisplayName("Record 2516: City is Halywa")
	void CityOfRecord2516() {
		assertEquals("Halywa", customers.get(2515).getCity());
	}

	@Test
	@DisplayName("Record 2516: County is Honolulu")
	void CountyOfRecord2516() {
		assertEquals("Honolulu", customers.get(2515).getCounty());
	}

	@Test
	@DisplayName("Record 2516: State is HI")
	void StateOfRecord2516() {
		assertEquals("HI", customers.get(2515).getState());
	}

	@Test
	@DisplayName("Record 2516: ZIP is 96712")
	void ZIPOfRecord2516() {
		assertEquals("96712", customers.get(2515).getZIP());
	}

	@Test
	@DisplayName("Record 2516: Phone is 808-638-4632")
	void PhoneOfRecord2516() {
		assertEquals("808-638-4632", customers.get(2515).getPhone());
	}

	@Test
	@DisplayName("Record 2516: Fax is 808-638-8883")
	void FaxOfRecord2516() {
		assertEquals("808-638-8883", customers.get(2515).getFax());
	}

	@Test
	@DisplayName("Record 2516: Email is audra@varakuta.com")
	void EmailOfRecord2516() {
		assertEquals("audra@varakuta.com", customers.get(2515).getEmail());
	}

	@Test
	@DisplayName("Record 2516: Web is http://www.audravarakuta.com")
	void WebOfRecord2516() {
		assertEquals("http://www.audravarakuta.com", customers.get(2515).getWeb());
	}
}

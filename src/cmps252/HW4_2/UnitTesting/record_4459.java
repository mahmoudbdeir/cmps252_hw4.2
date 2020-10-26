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

@Tag("38")
class Record_4459 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4459: FirstName is Dolly")
	void FirstNameOfRecord4459() {
		assertEquals("Dolly", customers.get(4458).getFirstName());
	}

	@Test
	@DisplayName("Record 4459: LastName is Belken")
	void LastNameOfRecord4459() {
		assertEquals("Belken", customers.get(4458).getLastName());
	}

	@Test
	@DisplayName("Record 4459: Company is Cogen, Richard M Esq")
	void CompanyOfRecord4459() {
		assertEquals("Cogen, Richard M Esq", customers.get(4458).getCompany());
	}

	@Test
	@DisplayName("Record 4459: Address is 1205 W North")
	void AddressOfRecord4459() {
		assertEquals("1205 W North", customers.get(4458).getAddress());
	}

	@Test
	@DisplayName("Record 4459: City is Grand Prairie")
	void CityOfRecord4459() {
		assertEquals("Grand Prairie", customers.get(4458).getCity());
	}

	@Test
	@DisplayName("Record 4459: County is Dallas")
	void CountyOfRecord4459() {
		assertEquals("Dallas", customers.get(4458).getCounty());
	}

	@Test
	@DisplayName("Record 4459: State is TX")
	void StateOfRecord4459() {
		assertEquals("TX", customers.get(4458).getState());
	}

	@Test
	@DisplayName("Record 4459: ZIP is 75050")
	void ZIPOfRecord4459() {
		assertEquals("75050", customers.get(4458).getZIP());
	}

	@Test
	@DisplayName("Record 4459: Phone is 972-623-6301")
	void PhoneOfRecord4459() {
		assertEquals("972-623-6301", customers.get(4458).getPhone());
	}

	@Test
	@DisplayName("Record 4459: Fax is 972-623-7951")
	void FaxOfRecord4459() {
		assertEquals("972-623-7951", customers.get(4458).getFax());
	}

	@Test
	@DisplayName("Record 4459: Email is dolly@belken.com")
	void EmailOfRecord4459() {
		assertEquals("dolly@belken.com", customers.get(4458).getEmail());
	}

	@Test
	@DisplayName("Record 4459: Web is http://www.dollybelken.com")
	void WebOfRecord4459() {
		assertEquals("http://www.dollybelken.com", customers.get(4458).getWeb());
	}
}

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
class Record_3412 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3412: FirstName is Andy")
	void FirstNameOfRecord3412() {
		assertEquals("Andy", customers.get(3411).getFirstName());
	}

	@Test
	@DisplayName("Record 3412: LastName is Scoville")
	void LastNameOfRecord3412() {
		assertEquals("Scoville", customers.get(3411).getLastName());
	}

	@Test
	@DisplayName("Record 3412: Company is Christian Television Msn Inc")
	void CompanyOfRecord3412() {
		assertEquals("Christian Television Msn Inc", customers.get(3411).getCompany());
	}

	@Test
	@DisplayName("Record 3412: Address is 10300 N Central Expy  #-330")
	void AddressOfRecord3412() {
		assertEquals("10300 N Central Expy  #-330", customers.get(3411).getAddress());
	}

	@Test
	@DisplayName("Record 3412: City is Dallas")
	void CityOfRecord3412() {
		assertEquals("Dallas", customers.get(3411).getCity());
	}

	@Test
	@DisplayName("Record 3412: County is Dallas")
	void CountyOfRecord3412() {
		assertEquals("Dallas", customers.get(3411).getCounty());
	}

	@Test
	@DisplayName("Record 3412: State is TX")
	void StateOfRecord3412() {
		assertEquals("TX", customers.get(3411).getState());
	}

	@Test
	@DisplayName("Record 3412: ZIP is 75231")
	void ZIPOfRecord3412() {
		assertEquals("75231", customers.get(3411).getZIP());
	}

	@Test
	@DisplayName("Record 3412: Phone is 214-363-5647")
	void PhoneOfRecord3412() {
		assertEquals("214-363-5647", customers.get(3411).getPhone());
	}

	@Test
	@DisplayName("Record 3412: Fax is 214-363-7431")
	void FaxOfRecord3412() {
		assertEquals("214-363-7431", customers.get(3411).getFax());
	}

	@Test
	@DisplayName("Record 3412: Email is andy@scoville.com")
	void EmailOfRecord3412() {
		assertEquals("andy@scoville.com", customers.get(3411).getEmail());
	}

	@Test
	@DisplayName("Record 3412: Web is http://www.andyscoville.com")
	void WebOfRecord3412() {
		assertEquals("http://www.andyscoville.com", customers.get(3411).getWeb());
	}
}

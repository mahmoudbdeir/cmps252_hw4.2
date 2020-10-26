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

@Tag("19")
class Record_2021 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2021: FirstName is Mai")
	void FirstNameOfRecord2021() {
		assertEquals("Mai", customers.get(2020).getFirstName());
	}

	@Test
	@DisplayName("Record 2021: LastName is Hehr")
	void LastNameOfRecord2021() {
		assertEquals("Hehr", customers.get(2020).getLastName());
	}

	@Test
	@DisplayName("Record 2021: Company is Stralem & Co Inc")
	void CompanyOfRecord2021() {
		assertEquals("Stralem & Co Inc", customers.get(2020).getCompany());
	}

	@Test
	@DisplayName("Record 2021: Address is 1160 N Blue Gum St")
	void AddressOfRecord2021() {
		assertEquals("1160 N Blue Gum St", customers.get(2020).getAddress());
	}

	@Test
	@DisplayName("Record 2021: City is Anahym")
	void CityOfRecord2021() {
		assertEquals("Anahym", customers.get(2020).getCity());
	}

	@Test
	@DisplayName("Record 2021: County is Orange")
	void CountyOfRecord2021() {
		assertEquals("Orange", customers.get(2020).getCounty());
	}

	@Test
	@DisplayName("Record 2021: State is CA")
	void StateOfRecord2021() {
		assertEquals("CA", customers.get(2020).getState());
	}

	@Test
	@DisplayName("Record 2021: ZIP is 92806")
	void ZIPOfRecord2021() {
		assertEquals("92806", customers.get(2020).getZIP());
	}

	@Test
	@DisplayName("Record 2021: Phone is 714-666-7578")
	void PhoneOfRecord2021() {
		assertEquals("714-666-7578", customers.get(2020).getPhone());
	}

	@Test
	@DisplayName("Record 2021: Fax is 714-666-3982")
	void FaxOfRecord2021() {
		assertEquals("714-666-3982", customers.get(2020).getFax());
	}

	@Test
	@DisplayName("Record 2021: Email is mai@hehr.com")
	void EmailOfRecord2021() {
		assertEquals("mai@hehr.com", customers.get(2020).getEmail());
	}

	@Test
	@DisplayName("Record 2021: Web is http://www.maihehr.com")
	void WebOfRecord2021() {
		assertEquals("http://www.maihehr.com", customers.get(2020).getWeb());
	}
}

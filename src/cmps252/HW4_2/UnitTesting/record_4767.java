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

@Tag("9")
class Record_4767 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4767: FirstName is Pearl")
	void FirstNameOfRecord4767() {
		assertEquals("Pearl", customers.get(4766).getFirstName());
	}

	@Test
	@DisplayName("Record 4767: LastName is Doerhoff")
	void LastNameOfRecord4767() {
		assertEquals("Doerhoff", customers.get(4766).getLastName());
	}

	@Test
	@DisplayName("Record 4767: Company is American Transfer Inc")
	void CompanyOfRecord4767() {
		assertEquals("American Transfer Inc", customers.get(4766).getCompany());
	}

	@Test
	@DisplayName("Record 4767: Address is 3710 Woodland Dr")
	void AddressOfRecord4767() {
		assertEquals("3710 Woodland Dr", customers.get(4766).getAddress());
	}

	@Test
	@DisplayName("Record 4767: City is Anchorage")
	void CityOfRecord4767() {
		assertEquals("Anchorage", customers.get(4766).getCity());
	}

	@Test
	@DisplayName("Record 4767: County is Anchorage")
	void CountyOfRecord4767() {
		assertEquals("Anchorage", customers.get(4766).getCounty());
	}

	@Test
	@DisplayName("Record 4767: State is AK")
	void StateOfRecord4767() {
		assertEquals("AK", customers.get(4766).getState());
	}

	@Test
	@DisplayName("Record 4767: ZIP is 99517")
	void ZIPOfRecord4767() {
		assertEquals("99517", customers.get(4766).getZIP());
	}

	@Test
	@DisplayName("Record 4767: Phone is 907-248-9649")
	void PhoneOfRecord4767() {
		assertEquals("907-248-9649", customers.get(4766).getPhone());
	}

	@Test
	@DisplayName("Record 4767: Fax is 907-248-3303")
	void FaxOfRecord4767() {
		assertEquals("907-248-3303", customers.get(4766).getFax());
	}

	@Test
	@DisplayName("Record 4767: Email is pearl@doerhoff.com")
	void EmailOfRecord4767() {
		assertEquals("pearl@doerhoff.com", customers.get(4766).getEmail());
	}

	@Test
	@DisplayName("Record 4767: Web is http://www.pearldoerhoff.com")
	void WebOfRecord4767() {
		assertEquals("http://www.pearldoerhoff.com", customers.get(4766).getWeb());
	}
}

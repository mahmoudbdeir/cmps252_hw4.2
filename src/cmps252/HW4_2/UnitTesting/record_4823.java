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

@Tag("24")
class Record_4823 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4823: FirstName is Mike")
	void FirstNameOfRecord4823() {
		assertEquals("Mike", customers.get(4822).getFirstName());
	}

	@Test
	@DisplayName("Record 4823: LastName is Vallentine")
	void LastNameOfRecord4823() {
		assertEquals("Vallentine", customers.get(4822).getLastName());
	}

	@Test
	@DisplayName("Record 4823: Company is J R Clancy Inc")
	void CompanyOfRecord4823() {
		assertEquals("J R Clancy Inc", customers.get(4822).getCompany());
	}

	@Test
	@DisplayName("Record 4823: Address is 12440 Plaza Dr")
	void AddressOfRecord4823() {
		assertEquals("12440 Plaza Dr", customers.get(4822).getAddress());
	}

	@Test
	@DisplayName("Record 4823: City is Cleveland")
	void CityOfRecord4823() {
		assertEquals("Cleveland", customers.get(4822).getCity());
	}

	@Test
	@DisplayName("Record 4823: County is Cuyahoga")
	void CountyOfRecord4823() {
		assertEquals("Cuyahoga", customers.get(4822).getCounty());
	}

	@Test
	@DisplayName("Record 4823: State is OH")
	void StateOfRecord4823() {
		assertEquals("OH", customers.get(4822).getState());
	}

	@Test
	@DisplayName("Record 4823: ZIP is 44130")
	void ZIPOfRecord4823() {
		assertEquals("44130", customers.get(4822).getZIP());
	}

	@Test
	@DisplayName("Record 4823: Phone is 440-362-7481")
	void PhoneOfRecord4823() {
		assertEquals("440-362-7481", customers.get(4822).getPhone());
	}

	@Test
	@DisplayName("Record 4823: Fax is 440-362-8329")
	void FaxOfRecord4823() {
		assertEquals("440-362-8329", customers.get(4822).getFax());
	}

	@Test
	@DisplayName("Record 4823: Email is mike@vallentine.com")
	void EmailOfRecord4823() {
		assertEquals("mike@vallentine.com", customers.get(4822).getEmail());
	}

	@Test
	@DisplayName("Record 4823: Web is http://www.mikevallentine.com")
	void WebOfRecord4823() {
		assertEquals("http://www.mikevallentine.com", customers.get(4822).getWeb());
	}
}
